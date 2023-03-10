package com.vup.tess.model;

import java.math.BigDecimal;
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

import com.vup.tess.model.key.SaleAccountsId;

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
@Table(name= "TBL_SALE_ACCOUNTS")
public class SaleAccounts {

	@EmbeddedId
	private SaleAccountsId seq;	
	
	@Column(nullable = false, precision = 15, scale = 3)
	private BigDecimal totalAmount;
	
	@Column(nullable = false, precision = 10, scale = 3)
	private BigDecimal dayAmount;
	
	@Column(nullable = false, precision = 10, scale = 3)
	private BigDecimal basicCharge;
	
	@Column(nullable = false, precision = 10, scale = 3)
	private BigDecimal vat;
	
	@Column(nullable = false, precision = 10, scale = 3)
	private BigDecimal vupFee;
	
	@Column(nullable = false, precision = 10, scale = 3)
	private BigDecimal sum;
	
	@Column(nullable = false, precision = 10, scale = 3)
	private BigDecimal unitPrice;
	
	@ManyToOne(fetch = FetchType.EAGER)		// EAGER, LAZY 
	@JoinColumn(name = "settlementStatusCd", referencedColumnName = "codeId", insertable=false, updatable=false, nullable=false) 
	private CommonCode settlementStatusCd;
	
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
