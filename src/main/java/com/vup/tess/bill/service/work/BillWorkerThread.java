package com.vup.tess.bill.service.work;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Vector;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFFormulaEvaluator;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.vup.tess.model.Settlement;

public class BillWorkerThread {
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	RealWorker worker = null;
	int threadID;
	int workerNum;
	
	private String filePath;
	private String fileName;
	
	private Vector<Settlement> msgVector = null;
	
	public BillWorkerThread() {
	}
	
	public BillWorkerThread(int tid){
		threadID = tid;
		//DEBUG_STRING = "[WorkerThread-" + threadID + "] : ";
		worker = new RealWorker();
		worker.start();

		msgVector = new Vector<Settlement>(1000);
	}
	
	public void setWorkerNum(int workerNum) {
		this.workerNum = workerNum;
	}
	
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}
	
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	
	private class RealWorker extends Thread{
		public RealWorker() {
			setDaemon(true);
			setName("WorkerThread-" + (threadID + 100));
		}

		private boolean runFlag = true;
		
		public void run(){
			try{
				while(runFlag){
					try {
						Object object = null;
						synchronized (msgVector) {
							if (msgVector.size() > 0)
								object = msgVector.remove(0);
						}
						if (object == null) {
							sleep(20);
							continue;
						}

						logger.info("msgVector::"+object.toString());
						doScheduleService(((Settlement) object));
						// sleep(100);
					} catch (Exception e) {
						logger.error("Exception ", e);

					} finally {

					}
					
					
				}
			}catch(Exception e){
				e.printStackTrace();
			}
		}

		private void doScheduleService(Settlement settlement) throws Exception{
			//고지서 작성
			//고지서 템플릿 조회
			logger.info("filePath + fileName ::"+filePath + fileName);
			/** 임시 경로 */
			XSSFWorkbook excelTempleteWorkbook = readExcelTempleteFile(filePath + fileName);
			
			//엑셀 데이터 입력
			ecxelSheetInsert(excelTempleteWorkbook, settlement);
			
			XSSFFormulaEvaluator.evaluateAllFormulaCells(excelTempleteWorkbook);
			StringBuffer fileName = new StringBuffer();
			
			fileName.append("열요금명세표");
			fileName.append(settlement.getFactoryId());
			fileName.append(".xlsx");
			
			FileOutputStream os = null;
			//엑셀파일 저장 경로 및 저장 위치
			String reportFilePath = "C:/tessexcel/report/";
			try {
				
				File reportFolder = new File(reportFilePath);
				if(!reportFolder.exists()){
					reportFolder.mkdirs();
				}
				os = new FileOutputStream(reportFilePath + fileName.toString());
				excelTempleteWorkbook.write(os);
			}catch (Exception e) {
				e.printStackTrace();
			}
			
			//엑셀toPDF
			excel2pdf(reportFilePath,fileName);
			
			/*
			 * //행의 수 int rowindex=0; int columnindex=0; int
			 * rows=sheet.getPhysicalNumberOfRows();
			 * for(rowindex=1;rowindex<rows;rowindex++){ //행을읽는다 XSSFRow
			 * row=sheet.getRow(rowindex); if(row !=null){ //셀의 수 int
			 * cells=row.getPhysicalNumberOfCells();
			 * for(columnindex=0;columnindex<=cells;columnindex++){ //셀값을 읽는다 XSSFCell
			 * cell=row.getCell(columnindex); String value=""; //셀이 빈값일경우를 위한 널체크
			 * if(cell==null){ continue; }else{ //타입별로 내용 읽기 switch (cell.getCellType()){
			 * case XSSFCell.CELL_TYPE_FORMULA: value=cell.getCellFormula(); break; case
			 * XSSFCell.CELL_TYPE_NUMERIC: value=cell.getNumericCellValue()+""; break; case
			 * XSSFCell.CELL_TYPE_STRING: value=cell.getStringCellValue()+""; break; case
			 * XSSFCell.CELL_TYPE_BLANK: value=cell.getBooleanCellValue()+""; break; case
			 * XSSFCell.CELL_TYPE_ERROR: value=cell.getErrorCellValue()+""; break; } }
			 * System.out.println("각 셀 내용 :"+value); } } }
			 */

			
		}

		private void excel2pdf(String reportFilePath, StringBuffer fileName) {
			// TODO Auto-generated method stub
			
		}

		private void ecxelSheetInsert(XSSFWorkbook excelTempleteWorkbook, Settlement settlement) {
			XSSFSheet sheet = excelTempleteWorkbook.getSheetAt(0);
			excelTempleteWorkbook.setSheetName(0, "열요금명세표");
			XSSFRow row = null;
			XSSFCell cell = null;
			
			row = sheet.getRow(1);
			cell = row.getCell(5);
			cell.setCellType(cell.CELL_TYPE_STRING);
			cell.setCellValue(settlement.getYear()+"년  " + settlement.getMonth()+" 월분");
			
		}

		private XSSFWorkbook readExcelTempleteFile(String templateFilePath) throws Exception {
			File file = new File(templateFilePath);
			
			if(!file.exists()) {
				logger.error("Report Templete File is not exist");
				logger.error("Req templateFilePath : " + templateFilePath);
				throw new Exception("Report Templete File is not exist");
			}
			FileInputStream is = null;
			XSSFWorkbook workbook = null;
			try {
				is = new FileInputStream(file);
				workbook = new XSSFWorkbook(is);
			} catch (Exception e) {
				logger.error(e.getMessage(), e);
			} finally {
				try {
					is.close();
				} catch (Exception e) {
					logger.error(e.getMessage(), e);
				}
			}
			
			return workbook;
		}
	}

	
	public void addQueue(Settlement settlement) {
		synchronized (msgVector) {
			msgVector.add(settlement);
		}
		
	}
	
	public int getQueueCount() {
		return msgVector.size();
	}
	
}
