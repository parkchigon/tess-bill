package com.vup.tess.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
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
@Table(name= "TBL_ENERGY_GROUP")
public class EnergyGroup {
	
	@Id
	@Column(nullable = false, length = 10)
	private String energyGroupId;
	
	@Column(nullable = false, length = 20)
	private String energyGroupName;
	
	@Column(nullable = true, length = 50)
	private String energyGroupDesc;
	
	@ManyToOne(fetch = FetchType.EAGER)		// EAGER, LAZY
	@JoinColumn(name = "pointUnitSeq", referencedColumnName = "seq", insertable=false, updatable=false, nullable=false) 
	private PointUnit pointUnitSeq;

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
