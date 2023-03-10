package com.vup.tess.model.key;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.vup.tess.model.FactoryMaster;
import com.vup.tess.model.UserInfo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Embeddable
@NoArgsConstructor
@AllArgsConstructor
public class UserAuthFactoryId implements Serializable {
	
	@ManyToOne(fetch = FetchType.EAGER)		// EAGER, LAZY 
	@JoinColumn(name = "factoryId", referencedColumnName = "factoryId", insertable=false, updatable=false, nullable=false) 
	private FactoryMaster factoryId;
	
	@ManyToOne(fetch = FetchType.EAGER)		// EAGER, LAZY 
	@JoinColumn(name = "userId", referencedColumnName = "userId", insertable=false, updatable=false, nullable=false) 
	private UserInfo userId;	

}
