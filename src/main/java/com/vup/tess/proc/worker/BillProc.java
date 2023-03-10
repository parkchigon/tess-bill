package com.vup.tess.proc.worker;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.vup.tess.bill.service.BillService;
import com.vup.tess.bill.service.work.BillWorkerThread;
import com.vup.tess.model.Settlement;

@Service
public class BillProc {
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	private static BillWorkerThread[] workerThreadArr = null;
	
	@Value("${scheduler.worker.threadCnt}")
	private String threadCnt;
	
	@Value("${scheduler.workers.filePath}")
	private String filePath;
	
	@Value("${scheduler.workers.fileName}")
	private String fileName;
	
	@Autowired 
	private BillService billService;
	
	public void doService() {
		try {
			if (workerThreadArr == null) {
				makeWorkerThread();
			}
			
			int notCompleteQueueCount = this.getThreadQueueCount();
			if (notCompleteQueueCount > 0) {
				logger.info("Before job not complete! queueCount:" + notCompleteQueueCount);
				return;
			}
			
			List<Settlement> settlementList = billService.findByAll();
			logger.info("settlementList::"+settlementList);
			if (settlementList == null) {
				return;
			}
			
			for (int i = 0; i < settlementList.size(); i++) {
				workerThreadArr[i % Integer.parseInt(threadCnt)].addQueue(settlementList.get(i));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private int getThreadQueueCount() {
		int queueCount = 0;

		for (int i = 0; i < Integer.parseInt(threadCnt); i++) {
			queueCount = queueCount + workerThreadArr[i].getQueueCount();
		}

		return queueCount;
	}

	private void makeWorkerThread() {
		workerThreadArr = new BillWorkerThread[Integer.parseInt(threadCnt)];
		for (int i = 0; i < Integer.parseInt(threadCnt); i++) {
			BillWorkerThread workerThread = new BillWorkerThread(i + 1);
			workerThread.setWorkerNum(i);
			workerThread.setFilePath(filePath);
			workerThread.setFileName(fileName);
			workerThreadArr[i] = workerThread;
			logger.info("Make WorkerThread " + i);
		}
		
	}
	
}
