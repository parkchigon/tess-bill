package com.vup.tess.global.dto;

import java.util.Map;

import lombok.Data;

@Data
public class RequestApiDto {

	private String apiId;
	private Map<String, Object> param;
}
