package com.vup.tess.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.DynamicInsert;

import com.vup.tess.model.key.SectionChargeInfoId;

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
@Table(name= "TBL_SECTION_CHARGE_INFO")
public class SectionChargeInfo {

	@EmbeddedId
	private SectionChargeInfoId seq;	
	
	@Column(nullable = false, precision = 10, scale = 3)
	private BigDecimal basicCharge;
	
	@Column(nullable = false, precision = 5, scale = 2)
	private BigDecimal vatRate;
	
	@Column(nullable = false, precision = 10, scale = 3)
	private BigDecimal vupFeeRate;
	
	@Column(nullable = true, precision = 10, scale = 3)
	private BigDecimal fixUnitPrice;
	
	@Column(nullable = false, precision = 10, scale = 3)
	private BigDecimal chargeValue00;
	
	@Column(nullable = false, precision = 10, scale = 3)
	private BigDecimal chargeValue01;
	
	@Column(nullable = false, precision = 10, scale = 3)
	private BigDecimal chargeValue02;
	
	@Column(nullable = false, precision = 10, scale = 3)
	private BigDecimal chargeValue03;
	
	@Column(nullable = false, precision = 10, scale = 3)
	private BigDecimal chargeValue04;
	
	@Column(nullable = false, precision = 10, scale = 3)
	private BigDecimal chargeValue05;
	
	@Column(nullable = false, precision = 10, scale = 3)
	private BigDecimal chargeValue06;
	
	@Column(nullable = false, precision = 10, scale = 3)
	private BigDecimal chargeValue07;
	
	@Column(nullable = false, precision = 10, scale = 3)
	private BigDecimal chargeValue08;
	
	@Column(nullable = false, precision = 10, scale = 3)
	private BigDecimal chargeValue09;
	
	@Column(nullable = false, precision = 10, scale = 3)
	private BigDecimal chargeValue10;
	
	@Column(nullable = false, precision = 10, scale = 3)
	private BigDecimal chargeValue11;
	
	@Column(nullable = false, precision = 10, scale = 3)
	private BigDecimal chargeValue12;
	
	@Column(nullable = false, precision = 10, scale = 3)
	private BigDecimal chargeValue13;
	
	@Column(nullable = false, precision = 10, scale = 3)
	private BigDecimal chargeValue14;
	
	@Column(nullable = false, precision = 10, scale = 3)
	private BigDecimal chargeValue15;
	
	@Column(nullable = false, precision = 10, scale = 3)
	private BigDecimal chargeValue16;
	
	@Column(nullable = false, precision = 10, scale = 3)
	private BigDecimal chargeValue17;
	
	@Column(nullable = false, precision = 10, scale = 3)
	private BigDecimal chargeValue18;
	
	@Column(nullable = false, precision = 10, scale = 3)
	private BigDecimal chargeValue19;
	
	@Column(nullable = false, precision = 10, scale = 3)
	private BigDecimal chargeValue20;
	
	@Column(nullable = false, precision = 10, scale = 3)
	private BigDecimal chargeValue21;
	
	@Column(nullable = false, precision = 10, scale = 3)
	private BigDecimal chargeValue22;
	
	@Column(nullable = false, precision = 10, scale = 3)
	private BigDecimal chargeValue23;
	
	@CreationTimestamp
	@Column(nullable = false)
	private LocalDateTime saveDate;
	
	@Column(nullable = false, length = 20)
	private String saveId;
}
