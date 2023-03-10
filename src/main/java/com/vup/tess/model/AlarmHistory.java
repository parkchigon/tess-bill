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
@Table(name= "TBL_ALARM_HISTORY")
public class AlarmHistory {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // auto_increment
	private int Seq;
	
	@ManyToOne(fetch = FetchType.EAGER)		// EAGER, LAZY 
	@JoinColumns({@JoinColumn(name="factoryId", referencedColumnName="factoryId", insertable=false, updatable=false, nullable=false), 
		@JoinColumn(name="energyGroupId", referencedColumnName="energyGroupId", insertable=false, updatable=false, nullable=false),
		@JoinColumn(name="pointId", referencedColumnName="pointId", insertable=false, updatable=false, nullable=false)})
	private PointMaster pointMaster;
	
	@ManyToOne(fetch = FetchType.EAGER)		// EAGER, LAZY 
	@JoinColumn(name = "alarmTypeCd", referencedColumnName = "codeId", insertable=false, updatable=false, nullable=false) 
	private CommonCode alarmTypeCd;
	
	@ManyToOne(fetch = FetchType.EAGER)		// EAGER, LAZY 
	@JoinColumn(name = "pointValueTypeCd", referencedColumnName = "codeId", insertable=false, updatable=false, nullable=true) 
	private CommonCode pointValueTypeCd;
	
	@ManyToOne(fetch = FetchType.EAGER)		// EAGER, LAZY 
	@JoinColumn(name = "alarmConditionCd", referencedColumnName = "codeId", insertable=false, updatable=false, nullable=true) 
	private CommonCode alarmConditionCd;
	
	@Column(nullable = true, precision = 10, scale = 3)
	private BigDecimal alarmLowValue;
	
	@Column(nullable = true, precision = 10, scale = 3)
	private BigDecimal alarmHighValue;
	
	@Column(nullable = false)
	private int alarmCount;
	
	@Column(nullable = false)
	private int alarmSetCount;
	
	@Column(nullable = true)
	private int alarmTimeRange;
	
	@CreationTimestamp
	@Column(nullable = false)
	private LocalDateTime alarmTimeFirst;
	
	@Column(nullable = false)
	private int alarmTotalCount;
	
	@Column(nullable = true, precision = 10, scale = 3)
	private BigDecimal alarmValue;
	
	@Column(nullable = false)
	private String alarmMessage;
	
	@ManyToOne(fetch = FetchType.EAGER)		// EAGER, LAZY 
	@JoinColumn(name = "alarmStatusCd", referencedColumnName = "codeId", insertable=false, updatable=false, nullable=false) 
	private CommonCode alarmStatusCd;
	
	@Column(nullable = false) 
	private char useFlag;	
	
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
