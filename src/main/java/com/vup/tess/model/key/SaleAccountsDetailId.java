package com.vup.tess.model.key;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;

import com.vup.tess.model.PointMaster;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Embeddable
@NoArgsConstructor
@AllArgsConstructor
public class SaleAccountsDetailId implements Serializable {

	@ManyToOne(fetch = FetchType.EAGER)		// EAGER, LAZY 
	@JoinColumns({@JoinColumn(name="factoryId", referencedColumnName="factoryId", insertable=false, updatable=false, nullable=false), 
		@JoinColumn(name="energyGroupId", referencedColumnName="energyGroupId", insertable=false, updatable=false, nullable=false),
		@JoinColumn(name="pointId", referencedColumnName="pointId", insertable=false, updatable=false, nullable=false)})
	private PointMaster pointMaster;		

	@Column(nullable = false, length = 2)
	private String month;
	
	@Column(nullable = false, length = 2)
	private String chargeDay;
	
}
