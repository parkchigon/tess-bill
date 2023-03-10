package com.vup.tess.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import com.vup.tess.model.key.PointMasterId;

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
@DynamicUpdate
@Table(name= "TBL_POINT_MASTER")
public class PointMaster {

	@EmbeddedId
	private PointMasterId seq;
	
	@Column(nullable = false, length = 20)
	private String pointName;
	
	@Column(nullable = true, length = 10)
	private String pointDesc;
	
	@ManyToOne(fetch = FetchType.EAGER)		// EAGER, LAZY 
	@JoinColumn(name = "pointUnitSeq", referencedColumnName = "seq", insertable=false, updatable=false, nullable=false) 
	private PointUnit pointUnitSeq;
	
	@ManyToOne(fetch = FetchType.EAGER)		// EAGER, LAZY 
	@JoinColumn(name = "pointTagTypeCd", referencedColumnName = "codeId", insertable=false, updatable=false, nullable=false) 
	private CommonCode pointTagTypeCd;
	
	@ManyToOne(fetch = FetchType.EAGER)		// EAGER, LAZY 
	@JoinColumn(name = "pointValueTypeCd", referencedColumnName = "codeId", insertable=false, updatable=false, nullable=false) 
	private CommonCode pointValueTypeCd;
	
	@ManyToOne(fetch = FetchType.EAGER)		// EAGER, LAZY 
	@JoinColumn(name = "energyGroupId", referencedColumnName = "energyGroupId", insertable=false, updatable=false, nullable=false) 
	private EnergyGroup energyGroupId;
	
	@Column(nullable = false, length = 1, columnDefinition = "char(1) default 'Y'") 
	private String pointChargeFlag;
	
	@Column(nullable = false)
	private Integer pointPeriod;
	
	@Column(nullable = true)
	private Integer pointValueMin;
	
	@Column(nullable = true)
	private Integer pointValueMax;
	
	@Column(nullable = false, length = 1, columnDefinition = "char(1) default 'Y'") 
	private String useFlag;
	
	@CreationTimestamp
	@Column(nullable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
	private LocalDateTime updateDate;
	
	@Column(nullable = false, length = 20)
	private String updateId;
	
	@CreationTimestamp
	@Column(nullable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
	private LocalDateTime saveDate;
	
	@Column(nullable = false, length = 20)
	private String saveId;

}
