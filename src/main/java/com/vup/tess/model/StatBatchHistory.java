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
import com.vup.tess.model.key.SectionChargeInfoId;
import com.vup.tess.model.key.StatBatchHistoryId;

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
@Table(name= "TBL_STAT_BATCH_HISTORY")
public class StatBatchHistory {

	@EmbeddedId
	private StatBatchHistoryId seq;	
	
	@Column(nullable = true, length = 50)
	private String statProcessName;
	
	@Column(nullable = false, length = 17) 
	private String endDate;
	
	@Column(nullable = true)
	private int totalCount;
	
	@Column(nullable = true)
	private int successCount;
	
	@Column(nullable = true)
	private int errorCount;
	
	@CreationTimestamp
	@Column(nullable = false)
	private LocalDateTime saveDate;
	
	@Column(nullable = false, length = 20)
	private String saveId;
}
