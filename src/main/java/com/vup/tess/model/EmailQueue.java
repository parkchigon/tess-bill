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
@Table(name= "TBL_EMAIL_QUEUE")
public class EmailQueue {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // auto_increment
	private int seq;
	
	@Column(nullable = false, length = 50)
	private String emailTitle;
	
	@Column(nullable = false, length = 50)
	private String emailReceiver;
	
	@Column(nullable = true, length = 50)
	private String emailReferrer;
	
	@Column(nullable = false, length = 50)
	private String emailSneder;
	
	@Column(columnDefinition = "TEXT")
	private String emailContents;
	
	@ManyToOne(fetch = FetchType.EAGER)		// EAGER, LAZY 
	@JoinColumn(name = "emailTypeCd", referencedColumnName = "codeId", insertable=false, updatable=false, nullable=false) 
	private CommonCode emailTypeCd;
	
	@Column(nullable = true, length = 12)
	private String sendReserveDate;
	
	@Column(nullable = false)
	private char sendFlag;
	
	@Column(nullable = true, length = 12)
	private String sendDate;
	
	@Column(nullable = true)
	private int resendCnt;
	
	@Column(nullable = true)
	private int resendMaxCnt;
	
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
