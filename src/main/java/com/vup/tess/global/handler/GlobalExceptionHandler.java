package com.vup.tess.global.handler;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

import com.vup.tess.global.dto.ResponseDto;

@ControllerAdvice
@RestController
public class GlobalExceptionHandler {
	
	@ExceptionHandler(value=Exception.class)
	public ResponseDto<String> handleArgumentException(Exception e) {
		return new ResponseDto<String>(HttpStatus.INTERNAL_SERVER_ERROR.value(), e.getMessage()); // 500
	}
}
