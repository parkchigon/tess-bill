package com.vup.tess.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.FetchType;
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
@Table(name= "TBL_USER_INFO")
public class UserInfo {

	@Id
	private String userId;
	
	private String userPw;
	
	@ManyToOne(fetch = FetchType.EAGER)		// EAGER, LAZY
	@JoinColumn(name = "userAuthGroupSeq")
	private UserAuthGroup userAuthGroupSeq;
	
	private String userName;
	private String companyName;
	private String companyDivision;
	private String userDesc;
	private String zipCode;
	private String address;
	private String contact;
	private String email;
	private String BillUserName;
	private String BillDivision;
	private String BillContact;
	private String BillEmail;
	private char useFlag;
	
	@CreationTimestamp
	private LocalDateTime updateDate;
	
	private String updateId;
	
	@CreationTimestamp
	private LocalDateTime saveDate;
	
	private String saveId;

}
