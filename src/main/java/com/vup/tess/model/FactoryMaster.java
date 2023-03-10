package com.vup.tess.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
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
@Table(name= "TBL_FACTORY_MASTER", indexes = {@Index(unique = false, columnList = "factoryGroupId")})
public class FactoryMaster {
	
	@Id
	@Column(nullable = false, length = 10)
	private String factoryId;
	
	@Column(nullable = false, length = 20)
	private String factoryName;
	
	@ManyToOne(fetch = FetchType.EAGER)		// EAGER, LAZY
	@JoinColumn(name = "factoryGroupId", referencedColumnName = "factoryGroupId", unique=false, insertable=true, updatable=true, nullable=false) 
	private FactoryGroup factoryGroupId; 
	
	@Column(nullable = true, length = 10)
	private String zipCode;
	
	@Column(nullable = true, length = 100)
	private String address;
	
	@Column(nullable = true, precision = 10, scale = 3)
	private BigDecimal latitude;
	
	@Column(nullable = true, precision = 10, scale = 3)
	private BigDecimal longitude;
	 
	@Column(nullable = true, length = 20)
	private String telNo;
	
	@Column(nullable = true, length = 20)
	private String faxNo;
	
	@Column(nullable = true, length = 8)
	private String buildDate;
	
	@Column(nullable = true, precision = 10, scale = 3)
	private BigDecimal factoryArea;
	
	@Column(nullable = true, precision = 10, scale = 3)
	private BigDecimal energyArea;
	
	@Column(nullable = true, length = 50)
	private String memberCount;
	
	@Column(nullable = true, length = 50)
	private String yearlyOperationTime;
	
	@Column(nullable = true, length = 4)
	private String factoryLevelCd;
	
	@Column(nullable = true, length = 50)
	private String factoryFloorDesc;	
	
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
