package com.vup.tess.bill.scheduler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import com.vup.tess.proc.worker.BillProc;

import lombok.NoArgsConstructor;

@Service
@NoArgsConstructor
public class BillScheduler {
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private BillProc billProc;
	
	@Scheduled(fixedRateString  = "${delay.time}")
	public void startWork() {
		try {
			logger.info("###### START BILL DAEMON #####");
			
			billProc.doService();
			 

		} catch (Exception e) {
			logger.error("{}", e);

		} finally {
			logger.info("###### END BILL DAEMON #####");
		}
	}
}
