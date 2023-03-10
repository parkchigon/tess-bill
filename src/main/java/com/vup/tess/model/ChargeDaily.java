package com.vup.tess.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
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
@Table(name= "TBL_CHARGE_DAILY")
public class ChargeDaily {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // auto_increment
	private int seq;
	
	@Column(name = "CHARGE_DATE_D", nullable = false, length = 8)
	private String chargeDateD;
	
	@ManyToOne(fetch = FetchType.EAGER)		// EAGER, LAZY 
	@JoinColumns({@JoinColumn(name="factoryId", referencedColumnName="factoryId", insertable=false, updatable=false, nullable=false), 
		@JoinColumn(name="energyGroupId", referencedColumnName="energyGroupId", insertable=false, updatable=false, nullable=false),
		@JoinColumn(name="pointId", referencedColumnName="pointId", insertable=false, updatable=false, nullable=false)})
	private PointMaster pointMaster;	

	@Column(nullable = true, precision = 15, scale = 3)
	private BigDecimal totalCharge;
	
	@Column(nullable = true, precision = 15, scale = 3)
	private BigDecimal totalEnergeValue;
	
	@CreationTimestamp
	@Column(nullable = false)
	private LocalDateTime saveDate;

}
