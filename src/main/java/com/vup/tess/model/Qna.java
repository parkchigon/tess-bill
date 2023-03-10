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
@Table(name= "TBL_QNA")
public class Qna {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // auto_increment
	private int seq;
	
	@Column(nullable = false, length = 500)
	private String questionCont;
	
	@Column(nullable = false, length = 20)
	private String questionId;
	
	@Column(nullable = true, length = 500)
	private String answerCont;
	
	@Column(nullable = true, length = 20)
	private String answerId;
	
	@CreationTimestamp
	@Column(nullable = true)
	private LocalDateTime answerDate;
	
	@Column(nullable = false)
	private char faqFlag;
	
	@Column(nullable = false)
	private char useFlag;
	
	@CreationTimestamp
	@Column(nullable = false)
	private LocalDateTime saveDate;
	
	@Column(nullable = false, length = 20)
	private String saveId;
}
