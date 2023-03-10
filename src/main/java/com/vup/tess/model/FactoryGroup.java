package com.vup.tess.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.DynamicInsert;

import com.vup.tess.model.key.FactoryEnergyId;
import com.vup.tess.model.key.FactoryGroupId;

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
@Table(name= "TBL_FACTORY_GROUP")
public class FactoryGroup {
	
	@Id
	@Column(length = 10)
	private String factoryGroupId;

	//@EmbeddedId
	//private FactoryGroupId seq;	
	
	@Column(nullable = false, length = 20)
	private String factoryGroupName;
	
	@Column(nullable = true, length = 100)
	private String groupDesc;
	
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
