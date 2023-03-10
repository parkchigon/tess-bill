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
@Table(name= "TBL_BOARD")
public class Board {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // auto_increment
	private int seq;
	
	@ManyToOne(fetch = FetchType.EAGER)		// EAGER, LAZY 
	@JoinColumn(name = "boardTypeCd", referencedColumnName = "codeId", insertable=false, updatable=false, nullable=false) 
	private CommonCode boardTypeCd;
	
	@Column(nullable = false, length = 200)
	private String title;
	
	@Column(nullable = true, columnDefinition = "TEXT")
	private String content;
	
	@Column(nullable = false)
	private char topFlag;
	
	@Column(nullable = false)
	private int readCount;
	
	@Column(nullable = true, length = 12)
	private String exposureStartDate;
	
	@Column(nullable = true, length = 12)
	private String exposureEndDate;
	
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
