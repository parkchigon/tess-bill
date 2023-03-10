package com.vup.tess.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.DynamicInsert;

import com.vup.tess.model.key.PointMasterId;
import com.vup.tess.model.key.PointUnitConversionId;

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
@Table(name= "TBL_POINT_UNIT_CONVERSION")
public class PointUnitConversion {

	@EmbeddedId
	private PointUnitConversionId seq;

	@Column(nullable = false)
	private double weightValue;
	
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
