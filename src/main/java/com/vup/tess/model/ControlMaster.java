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
@Table(name= "TBL_CONTROL_MASTER")
public class ControlMaster {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // auto_increment
	private int seq;
	
	@ManyToOne(fetch = FetchType.EAGER)		// EAGER, LAZY 
	@JoinColumns({@JoinColumn(name="factoryId", referencedColumnName="factoryId", insertable=false, updatable=false, nullable=false), 
		@JoinColumn(name="energyGroupId", referencedColumnName="energyGroupId", insertable=false, updatable=false, nullable=false),
		@JoinColumn(name="pointId", referencedColumnName="pointId", insertable=false, updatable=false, nullable=false)})
	private PointMaster pointMaster;		
	
	@ManyToOne(fetch = FetchType.EAGER)		// EAGER, LAZY 
	@JoinColumn(name = "controlTypeCd", referencedColumnName = "codeId", insertable=false, updatable=false, nullable=false) 
	private CommonCode controlTypeCd;	
	
	@Column(nullable = false) 
	private char pointCmd;
	
	@Column(nullable = true, precision = 10, scale = 3)
	private BigDecimal setValue;
	
	@Column(nullable = true, length = 17)
	private String responseDate;
	
	@ManyToOne(fetch = FetchType.EAGER)		// EAGER, LAZY 
	@JoinColumn(name = "responseResultCd", referencedColumnName = "codeId", insertable=false, updatable=false, nullable=false) 
	private CommonCode responseResultCd;	

	@ManyToOne(fetch = FetchType.EAGER)		// EAGER, LAZY 
	@JoinColumn(name = "controlStatusCd", referencedColumnName = "codeId", insertable=false, updatable=false, nullable=false) 
	private CommonCode controlStatusCd;		
	
	@CreationTimestamp
	@Column(nullable = false) 
	private LocalDateTime updateDate; 
	
	@Column(nullable = false, length = 20)
	private String updateId;
	
	@CreationTimestamp
	@Column(nullable = false)
	private LocalDateTime saveDate;
	
	@Column(nullable = false, length = 20)
	private String saveId;
}
