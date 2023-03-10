package com.vup.tess.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
@Table(name= "TBL_REPORT_TEMPLATE")
public class ReportTemplate {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // auto_increment
	private int seq;
	
	@Column(nullable = false) 
	private char reportPeriodType;
	
	@Column(nullable = false) 
	private char reportScaleType;
	
	@Column(nullable = false) 
	private char reportOwnerType;
	
	@Column(nullable = false, length = 30)
	private String templateName;
	
	@Column(nullable = false, length = 50)
	private String fileName;
	
	@Column(nullable = false, length = 100)
	private String filePath;
	
	@Column(nullable = true, length = 100)
	private String mimetype;
	
	@Column(nullable = false, length = 2)
	private String publishDate;
	
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
