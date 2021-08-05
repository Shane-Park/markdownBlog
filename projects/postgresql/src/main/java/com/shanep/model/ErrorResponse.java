package com.shanep.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ErrorResponse {
	private int code;
	private String message;
	
	public ErrorResponse(String message) {
		this.message = message;
	}
	
}