package com.vup.tess.bill.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.vup.tess.model.Settlement;
import com.vup.tess.repository.SettlementRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BillServiceImpl implements BillService{
	
	@Autowired
	private SettlementRepository settlementRepository;
	
	@Transactional(readOnly = true)
	public List<Settlement> findByAll() {
		
		return settlementRepository.findByAll();
	}
	

}
