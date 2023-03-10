package com.vup.tess.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.DynamicInsert;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data	// @Getter, @Setter, @ToString @ RequiredArgsConstructor
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@DynamicInsert
public class Settlement {
	@Id
	@Column(nullable = false)
	private int tradingRoomSeq;
	
	@Column(nullable = false, length = 4)
	private String year;
	
	@Column(nullable = false, length = 2)
	private String month;
	
	@Column(nullable = false, length = 6)
	private String factoryId;
	
	@Column(nullable = false, precision = 15, scale = 3)
	private BigDecimal totalTradeVolume;
	
	@Column(nullable = false, precision = 15, scale = 3)
	private BigDecimal totalVolume;
	
	@Column(nullable = false, precision = 15, scale = 3)
	private BigDecimal oriTotalVolume;
	
	@Column(nullable = false, length = 10)
	private String pointId;
	
	@Column(nullable = false, precision = 10, scale = 3)
	private BigDecimal totalPriceAmount;
	
	@Column(nullable = false, precision = 10, scale = 3)
	private BigDecimal oriTotalPriceAmount;
	
	@Column(nullable = true, precision = 10, scale = 3)
	private BigDecimal basicChargeAmount;
	
	@Column(nullable = true, precision = 10, scale = 3)
	private BigDecimal vatAmount;
	
	@Column(nullable = true, precision = 10, scale = 3)
	private BigDecimal feeAmount;
	
	@Column(nullable = true, length = 20)
	private String billNo;
	
	@Column(nullable = false, precision = 10, scale = 3)
	private BigDecimal settlementAmount;
	
	@Column(nullable = false, precision = 10, scale = 3)
	private BigDecimal oriSettlementAmount;
	
	@Column(nullable = false, length = 4)
	private String settlementStatusCd;
	
	@Column(nullable = false, length = 4)
	private String depositCd;
	
	@Column(nullable = false)
	private int alarmCount;
}
