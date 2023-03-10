package com.vup.tess.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.DynamicInsert;

import com.vup.tess.model.key.SaleAccountsDetailId;

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
@Table(name= "TBL_SALE_ACCOUNTS_DETAIL")
public class SaleAccountsDetail {

	@EmbeddedId
	private SaleAccountsDetailId seq;	
	
	@Column(nullable = false, precision = 15, scale = 3)
	private BigDecimal chargeValueAmount;
	
	@Column(nullable = true, precision = 15, scale = 3)
	private BigDecimal chargeValueMin;
	
	@Column(nullable = true, precision = 15, scale = 3)
	private BigDecimal chargeValueMax;
	
	@Column(nullable = false, precision = 10, scale = 3)
	private BigDecimal chargeValuePrice;
	
	@Column(nullable = true, precision = 10, scale = 3)
	private BigDecimal chargeValue00Amount;
	
	@Column(nullable = true, precision = 15, scale = 3)
	private BigDecimal chargeValue00Min;
	
	@Column(nullable = true, precision = 15, scale = 3)
	private BigDecimal chargeValue00Max;
	
	@Column(nullable = true, precision = 10, scale = 3)
	private BigDecimal chargeValue00Price;
	
	@Column(nullable = true, precision = 10, scale = 3)
	private BigDecimal chargeValue01Amount;
	
	@Column(nullable = true, precision = 15, scale = 3)
	private BigDecimal chargeValue01Min;
	
	@Column(nullable = true, precision = 15, scale = 3)
	private BigDecimal chargeValue01Max;
	
	@Column(nullable = true, precision = 10, scale = 3)
	private BigDecimal chargeValue01Price;
	
	@Column(nullable = true, precision = 10, scale = 3)
	private BigDecimal chargeValue02Amount;
	
	@Column(nullable = true, precision = 15, scale = 3)
	private BigDecimal chargeValue02Min;
	
	@Column(nullable = true, precision = 15, scale = 3)
	private BigDecimal chargeValue02Max;
	
	@Column(nullable = true, precision = 10, scale = 3)
	private BigDecimal chargeValue02Price;
	
	@Column(nullable = true, precision = 10, scale = 3)
	private BigDecimal chargeValue03Amount;
	
	@Column(nullable = true, precision = 15, scale = 3)
	private BigDecimal chargeValue03Min;
	
	@Column(nullable = true, precision = 15, scale = 3)
	private BigDecimal chargeValue03Max;
	
	@Column(nullable = true, precision = 10, scale = 3)
	private BigDecimal chargeValue03Price;
	
	@Column(nullable = true, precision = 10, scale = 3)
	private BigDecimal chargeValue04Amount;
	
	@Column(nullable = true, precision = 15, scale = 3)
	private BigDecimal chargeValue04Min;
	
	@Column(nullable = true, precision = 15, scale = 3)
	private BigDecimal chargeValue04Max;
	
	@Column(nullable = true, precision = 10, scale = 3)
	private BigDecimal chargeValue04Price;
	
	@Column(nullable = true, precision = 10, scale = 3)
	private BigDecimal chargeValue05Amount;
	
	@Column(nullable = true, precision = 15, scale = 3)
	private BigDecimal chargeValue05Min;
	
	@Column(nullable = true, precision = 15, scale = 3)
	private BigDecimal chargeValue05Max;
	
	@Column(nullable = true, precision = 10, scale = 3)
	private BigDecimal chargeValue05Price;
	
	@Column(nullable = true, precision = 10, scale = 3)
	private BigDecimal chargeValue06Amount;
	
	@Column(nullable = true, precision = 15, scale = 3)
	private BigDecimal chargeValue06Min;
	
	@Column(nullable = true, precision = 15, scale = 3)
	private BigDecimal chargeValue06Max;
	
	@Column(nullable = true, precision = 10, scale = 3)
	private BigDecimal chargeValue06Price;
	
	@Column(nullable = true, precision = 10, scale = 3)
	private BigDecimal chargeValue07Amount;
	
	@Column(nullable = true, precision = 15, scale = 3)
	private BigDecimal chargeValue07Min;
	
	@Column(nullable = true, precision = 15, scale = 3)
	private BigDecimal chargeValue07Max;
	
	@Column(nullable = true, precision = 10, scale = 3)
	private BigDecimal chargeValue07Price;
	
	@Column(nullable = true, precision = 10, scale = 3)
	private BigDecimal chargeValue08Amount;
	
	@Column(nullable = true, precision = 15, scale = 3)
	private BigDecimal chargeValue08Min;
	
	@Column(nullable = true, precision = 15, scale = 3)
	private BigDecimal chargeValue08Max;
	
	@Column(nullable = true, precision = 10, scale = 3)
	private BigDecimal chargeValue08Price;
	
	@Column(nullable = true, precision = 10, scale = 3)
	private BigDecimal chargeValue09Amount;
	
	@Column(nullable = true, precision = 15, scale = 3)
	private BigDecimal chargeValue09Min;
	
	@Column(nullable = true, precision = 15, scale = 3)
	private BigDecimal chargeValue09Max;
	
	@Column(nullable = true, precision = 10, scale = 3)
	private BigDecimal chargeValue09Price;
	
	@Column(nullable = true, precision = 10, scale = 3)
	private BigDecimal chargeValue10Amount;
	
	@Column(nullable = true, precision = 15, scale = 3)
	private BigDecimal chargeValue10Min;
	
	@Column(nullable = true, precision = 15, scale = 3)
	private BigDecimal chargeValue10Max;
	
	@Column(nullable = true, precision = 10, scale = 3)
	private BigDecimal chargeValue10Price;
	
	@Column(nullable = true, precision = 10, scale = 3)
	private BigDecimal chargeValue11Amount;
	
	@Column(nullable = true, precision = 15, scale = 3)
	private BigDecimal chargeValue11Min;
	
	@Column(nullable = true, precision = 15, scale = 3)
	private BigDecimal chargeValue11Max;
	
	@Column(nullable = true, precision = 10, scale = 3)
	private BigDecimal chargeValue11Price;
	
	@Column(nullable = true, precision = 10, scale = 3)
	private BigDecimal chargeValue12Amount;
	
	@Column(nullable = true, precision = 15, scale = 3)
	private BigDecimal chargeValue12Min;
	
	@Column(nullable = true, precision = 15, scale = 3)
	private BigDecimal chargeValue12Max;
	
	@Column(nullable = true, precision = 10, scale = 3)
	private BigDecimal chargeValue12Price;
	
	@Column(nullable = true, precision = 10, scale = 3)
	private BigDecimal chargeValue13Amount;
	
	@Column(nullable = true, precision = 15, scale = 3)
	private BigDecimal chargeValue13Min;
	
	@Column(nullable = true, precision = 15, scale = 3)
	private BigDecimal chargeValue13Max;
	
	@Column(nullable = true, precision = 10, scale = 3)
	private BigDecimal chargeValue13Price;
	
	@Column(nullable = true, precision = 10, scale = 3)
	private BigDecimal chargeValue14Amount;
	
	@Column(nullable = true, precision = 15, scale = 3)
	private BigDecimal chargeValue14Min;
	
	@Column(nullable = true, precision = 15, scale = 3)
	private BigDecimal chargeValue14Max;
	
	@Column(nullable = true, precision = 10, scale = 3)
	private BigDecimal chargeValue14Price;
	
	@Column(nullable = true, precision = 10, scale = 3)
	private BigDecimal chargeValue15Amount;
	
	@Column(nullable = true, precision = 15, scale = 3)
	private BigDecimal chargeValue15Min;
	
	@Column(nullable = true, precision = 15, scale = 3)
	private BigDecimal chargeValue15Max;
	
	@Column(nullable = true, precision = 10, scale = 3)
	private BigDecimal chargeValue15Price;
	
	@Column(nullable = true, precision = 10, scale = 3)
	private BigDecimal chargeValue16Amount;
	
	@Column(nullable = true, precision = 15, scale = 3)
	private BigDecimal chargeValue16Min;
	
	@Column(nullable = true, precision = 15, scale = 3)
	private BigDecimal chargeValue16Max;
	
	@Column(nullable = true, precision = 10, scale = 3)
	private BigDecimal chargeValue16Price;
	
	@Column(nullable = true, precision = 10, scale = 3)
	private BigDecimal chargeValue17Amount;
	
	@Column(nullable = true, precision = 15, scale = 3)
	private BigDecimal chargeValue17Min;
	
	@Column(nullable = true, precision = 15, scale = 3)
	private BigDecimal chargeValue17Max;
	
	@Column(nullable = true, precision = 10, scale = 3)
	private BigDecimal chargeValue17Price;
	
	@Column(nullable = true, precision = 10, scale = 3)
	private BigDecimal chargeValue18Amount;
	
	@Column(nullable = true, precision = 15, scale = 3)
	private BigDecimal chargeValue18Min;
	
	@Column(nullable = true, precision = 15, scale = 3)
	private BigDecimal chargeValue18Max;
	
	@Column(nullable = true, precision = 10, scale = 3)
	private BigDecimal chargeValue18Price;
	
	@Column(nullable = true, precision = 10, scale = 3)
	private BigDecimal chargeValue19Amount;
	
	@Column(nullable = true, precision = 15, scale = 3)
	private BigDecimal chargeValue19Min;
	
	@Column(nullable = true, precision = 15, scale = 3)
	private BigDecimal chargeValue19Max;
	
	@Column(nullable = true, precision = 10, scale = 3)
	private BigDecimal chargeValue19Price;
	
	@Column(nullable = true, precision = 10, scale = 3)
	private BigDecimal chargeValue20Amount;
	
	@Column(nullable = true, precision = 15, scale = 3)
	private BigDecimal chargeValue20Min;
	
	@Column(nullable = true, precision = 15, scale = 3)
	private BigDecimal chargeValue20Max;
	
	@Column(nullable = true, precision = 10, scale = 3)
	private BigDecimal chargeValue20Price;
	
	@Column(nullable = true, precision = 10, scale = 3)
	private BigDecimal chargeValue21Amount;
	
	@Column(nullable = true, precision = 15, scale = 3)
	private BigDecimal chargeValue21Min;
	
	@Column(nullable = true, precision = 15, scale = 3)
	private BigDecimal chargeValue21Max;
	
	@Column(nullable = true, precision = 10, scale = 3)
	private BigDecimal chargeValue21Price;
	
	@Column(nullable = true, precision = 10, scale = 3)
	private BigDecimal chargeValue22Amount;
	
	@Column(nullable = true, precision = 15, scale = 3)
	private BigDecimal chargeValue22Min;
	
	@Column(nullable = true, precision = 15, scale = 3)
	private BigDecimal chargeValue22Max;
	
	@Column(nullable = true, precision = 10, scale = 3)
	private BigDecimal chargeValue22Price;
	
	@Column(nullable = true, precision = 10, scale = 3)
	private BigDecimal chargeValue23Amount;
	
	@Column(nullable = true, precision = 15, scale = 3)
	private BigDecimal chargeValue23Min;
	
	@Column(nullable = true, precision = 15, scale = 3)
	private BigDecimal chargeValue23Max;
	
	@Column(nullable = true, precision = 10, scale = 3)
	private BigDecimal chargeValue23Price;
	
	@CreationTimestamp
	@Column(nullable = false)
	private LocalDateTime saveDate;
	
	@Column(nullable = false, length = 20)
	private String saveId;
}
