package com.vup.tess.model;

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
@Table(name= "TBL_REPORT_FILES")
public class ReportFiles {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // auto_increment
	private int seq;
	
	@ManyToOne(fetch = FetchType.EAGER)		// EAGER, LAZY 
	@JoinColumn(name = "reportTemplate", referencedColumnName = "seq", insertable=false, updatable=false, nullable=false) 
	private ReportTemplate reportTemplate;

	@ManyToOne(fetch = FetchType.EAGER)		// EAGER, LAZY 
	@JoinColumn(name = "factoryGroupId", referencedColumnName = "factoryGroupId", insertable=false, updatable=false, nullable=true) 
	private FactoryGroup factoryGroupId;
	
	@ManyToOne(fetch = FetchType.EAGER)		// EAGER, LAZY 
	@JoinColumn(name = "factoryId", referencedColumnName = "factoryGroupId", insertable=false, updatable=false, nullable=true) 	
	private FactoryMaster factoryId;
	
	@Column(nullable = false, length = 4)
	private String reportYear;
	
	@Column(nullable = true, length = 2)
	private String reportMonth;
	
	@Column(nullable = false, length = 50)
	private String reportFileName;
	
	@Column(nullable = true, length = 100)
	private String reportPath;
	
	@Column(nullable = true, length = 100)
	private String reportUrlPath;
	
	@Column(nullable = true, length = 10)
	private String reportFileSize;
	
	@Column(nullable = true, length = 50)
	private String reportError;
	
	@CreationTimestamp
	@Column(nullable = false)
	private LocalDateTime saveDate;
	
	@Column(nullable = false, length = 20)
	private String saveId;
}
