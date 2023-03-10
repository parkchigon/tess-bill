package com.vup.tess.model.key;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.vup.tess.model.EnergyGroup;
import com.vup.tess.model.FactoryGroup;
import com.vup.tess.model.FactoryMaster;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Embeddable
@NoArgsConstructor
@AllArgsConstructor
public class SectionChargeInfoId implements Serializable {

	@ManyToOne(fetch = FetchType.EAGER)		// EAGER, LAZY 
	@JoinColumn(name = "factoryGroupId", referencedColumnName = "factoryGroupId", insertable=false, updatable=false, nullable=false) 
	private FactoryGroup factoryGroupId;
	
	@ManyToOne(fetch = FetchType.EAGER)		// EAGER, LAZY 
	@JoinColumn(name = "energyGroupId", referencedColumnName = "energyGroupId", insertable=false, updatable=false, nullable=false) 
	private EnergyGroup energyGroupId;	

	
	@Column(nullable = false, length = 8)
	private String applyDate;
}
