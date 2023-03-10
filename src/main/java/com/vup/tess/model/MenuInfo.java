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
@Table(name= "TBL_MENU_INFO")
public class MenuInfo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // auto_increment
	private int seq;
	
	@Column(nullable = false, length = 20)
	private String menuName;
	
	@Column(nullable = true)
	private int pMenuInfoSeq;
	
	@Column(nullable = false)
	private int menuDepth;
	
	@Column(nullable = true)
	private int menuSort;
	
	@Column(nullable = true, length = 100)
	private String menuUrl;
	
	@Column(nullable = true, length = 50)
	private String menuDesc;

	@CreationTimestamp
	private LocalDateTime updateDate;
	
	@Column(nullable = false, length = 20)
	private String updateId;
	
	@CreationTimestamp
	private LocalDateTime saveDate;
	
	@Column(nullable = false, length = 20)
	private String saveId;
}
