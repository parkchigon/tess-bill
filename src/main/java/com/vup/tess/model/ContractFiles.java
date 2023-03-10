package com.vup.tess.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.DynamicInsert;

import com.vup.tess.model.key.ContractFilesId;

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
@Table(name= "TBL_CONTRACT_FILES")
public class ContractFiles {

	@EmbeddedId
	private ContractFilesId seq;

	@Column(nullable = false, length = 8)
	private String contractDate;
	
	@Column(nullable = false, length = 50)
	private String fileName;
	
	@Column(nullable = false, length = 100)
	private String filePath;
	
	@Column(nullable = false, length = 100)
	private String fileUrlPath;
	
	@CreationTimestamp
	@Column(nullable = false)
	private LocalDateTime saveDate;
	
	@Column(nullable = false, length = 20)
	private String saveId;
}
