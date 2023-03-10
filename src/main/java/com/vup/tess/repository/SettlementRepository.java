package com.vup.tess.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.vup.tess.model.Settlement;

@Repository
public interface SettlementRepository extends JpaRepository<Settlement,String>{

	@Query(value="select TRADING_ROOM_SEQ, YEAR, MONTH, SOURCE_FACTORY_ID as FACTORY_ID, TOTAL_TRADE_VOLUME, TOTAL_SUPPLY_VOLUME as TOTAL_VOLUME, ORI_TOTAL_SUPPLY_VOLUME as ORI_TOTAL_VOLUME, POINT_ID, TOTAL_PRICE_AMOUNT, ORI_TOTAL_PRICE_AMOUNT, BASIC_CHARGE_AMOUNT, VAT_AMOUNT, FEE_AMOUNT, BILL_NO, SETTLEMENT_AMOUNT, ORI_SETTLEMENT_AMOUNT, SETTLEMENT_STATUS_CD, PAYMENT_CD as DEPOSIT_CD, ALARM_COUNT\r\n"
			+ "  from tbl_settlement_sale\r\n"
			+ " where SETTLEMENT_STATUS_CD ='4401'\r\n"
			+ "union all\r\n"
			+ "  select TRADING_ROOM_SEQ, YEAR, MONTH, SINK_FACTORY_ID as FACTORY_ID, TOTAL_TRADE_VOLUME, TOTAL_USAGE_VOLUME as TOTAL_VOLUME, ORI_TOTAL_USAGE_VOLUME as ORI_TOTAL_VOLUME, POINT_ID, TOTAL_PRICE_AMOUNT, ORI_TOTAL_PRICE_AMOUNT, BASIC_CHARGE_AMOUNT, VAT_AMOUNT, FEE_AMOUNT, BILL_NO, SETTLEMENT_AMOUNT, ORI_SETTLEMENT_AMOUNT, SETTLEMENT_STATUS_CD, DEPOSIT_CD, ALARM_COUNT\r\n"
			+ "  from tbl_settlement_buy\r\n"
			+ "  where SETTLEMENT_STATUS_CD ='4401'", nativeQuery=true)
	List<Settlement> findByAll();

}
