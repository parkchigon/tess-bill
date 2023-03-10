package com.vup.tess.model.key;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.vup.tess.model.MenuInfo;
import com.vup.tess.model.UserAuthGroup;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Embeddable
@NoArgsConstructor
@AllArgsConstructor
public class UserAuthMenuId implements Serializable {

	@ManyToOne(fetch = FetchType.EAGER)		// EAGER, LAZY 
	@JoinColumn(name = "userAuthGroupSeq", referencedColumnName = "seq", insertable=false, updatable=false, nullable=false) 
	private UserAuthGroup userAuthGroupSeq;
	
	@ManyToOne(fetch = FetchType.EAGER)		// EAGER, LAZY 
	@JoinColumn(name = "menuInfoSeq", referencedColumnName = "seq", insertable=false, updatable=false, nullable=false) 
	private MenuInfo menuInfoSeq;

}
