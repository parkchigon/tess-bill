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
@Table(name= "TBL_TRANSACTION_CONTRACT")
public class TransactionContract {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // auto_increment
	private int seq;
	
	@ManyToOne(fetch = FetchType.EAGER)		// EAGER, LAZY 
	@JoinColumn(name = "sourceFactoryId", referencedColumnName = "factoryId", insertable=false, updatable=false, nullable=false) 
	private FactoryMaster sourceFactoryId;
	
	@ManyToOne(fetch = FetchType.EAGER)		// EAGER, LAZY 
	@JoinColumn(name = "sinkFactoryId", referencedColumnName = "factoryId", insertable=false, updatable=false, nullable=false) 
	private FactoryMaster sinkFactoryId;
	
	@ManyToOne(fetch = FetchType.EAGER)		// EAGER, LAZY 
	@JoinColumn(name = "energyGroupId", referencedColumnName = "energyGroupId", insertable=false, updatable=false, nullable=false) 
	private EnergyGroup energyGroupId;
	
	@ManyToOne(fetch = FetchType.EAGER)		// EAGER, LAZY 
	@JoinColumn(name = "transactionModelCd", referencedColumnName = "codeId", insertable=false, updatable=false, nullable=false) 
	private CommonCode transactionModelCd;
	
	@CreationTimestamp
	@Column(nullable = false)
	private LocalDateTime startTransactionDate;
	
	@CreationTimestamp
	@Column(nullable = false)
	private LocalDateTime endTransactionDate;
	
	@Column(nullable = true, precision = 10, scale = 3)
	private BigDecimal transactionValue;
	
	@Column(nullable = true, precision = 10, scale = 3)
	private BigDecimal dayMaxValue;
	
	@Column(nullable = true, precision = 10, scale = 3)
	private BigDecimal monthMaxValue;
	
	@Column(nullable = true, length = 100)
	private String documentName;
	
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
