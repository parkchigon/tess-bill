package com.vup.tess.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.DynamicInsert;

import com.vup.tess.model.key.UserAuthMenuId;

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
@Table(name= "TBL_USER_AUTH_MENU")
public class UserAuthMenu {

	@EmbeddedId
	private UserAuthMenuId seq;
	
	@ManyToOne(fetch = FetchType.EAGER)		// EAGER, LAZY
	@JoinColumn(name = "authIdCd", referencedColumnName = "codeId", insertable=false, updatable=false, nullable=false) 
	private CommonCode authIdCd;
	
	@Column(nullable = true, length = 50)
	private String userAuthDesc;
	
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
