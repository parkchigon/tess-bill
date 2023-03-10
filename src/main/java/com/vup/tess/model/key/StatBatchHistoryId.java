package com.vup.tess.model.key;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Embeddable
@NoArgsConstructor
@AllArgsConstructor
public class StatBatchHistoryId implements Serializable {

	@Column(nullable = false, length = 8)
	private String jobDate;
	
	@Column(nullable = false, length = 10)
	private String statProcessId;
}
