package com.vup.tess.model.key;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.vup.tess.model.PointUnit;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Embeddable
@NoArgsConstructor
@AllArgsConstructor
public class PointUnitConversionId implements Serializable {

	@ManyToOne(fetch = FetchType.EAGER)		// EAGER, LAZY 
	@JoinColumn(name = "sourcePointUnitSeq", referencedColumnName = "seq", insertable=false, updatable=false, nullable=false) 
	private PointUnit sourcePointUnitSeq;
	
	@ManyToOne(fetch = FetchType.EAGER)		// EAGER, LAZY 
	@JoinColumn(name = "targetPointUnitSeq", referencedColumnName = "seq", insertable=false, updatable=false, nullable=false) 
	private PointUnit targetPointUnitSeq;
	
}
