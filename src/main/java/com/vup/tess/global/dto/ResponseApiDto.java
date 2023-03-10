package com.vup.tess.global.dto;

import lombok.Data;

@Data
public class ResponseApiDto {
	
	private String apiId;
	private String resultCode;
	private String resultMsg;
	private Object data;
}
