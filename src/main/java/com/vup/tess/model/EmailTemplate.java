package com.vup.tess.model;

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
@Table(name= "TBL_EMAIL_TEMPLATE")
public class EmailTemplate {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // auto_increment
	private int seq;
	
	@Column(nullable = false, length = 8)
	private String applyDate;
	
	@Column(nullable = false, length = 4)
	private String emailTypeCd;
	
	@Column(nullable = false, length = 50)
	private String title;
	
	@Column(nullable = false, columnDefinition = "TEXT")
	private String contents;
	
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
