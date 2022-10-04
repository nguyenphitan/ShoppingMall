package com.nguyenphitan.dto;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ResponseDto<T> {
	
	/** HTTP Status */
	@JsonIgnore
	private HttpStatus httpStatus = HttpStatus.OK;
	
	/** HTTP Headers */
	@JsonIgnore
	private HttpHeaders headers;
	
	/** HTTP Code */
	private int code = HttpStatus.OK.value();
	
	/** Response Message */
	private String message;
	
	/** Total items */
	private Integer totalItems = null;
	
	/** Data */
	private T data;
	
	/** errors */
	private T errors;
	
	/**
	 * Create new instant of ResponseDto
	 * @param <T>
	 * @return
	 */
	public static <T> ResponseDto<T> build() {
		return new ResponseDto<>();
	}
	
	/**
	 * Set HttpStatus for the response
	 * @param httpStatus
	 * @return
	 */
	public ResponseDto<T> withHttpStatus(HttpStatus httpStatus) {
		this.httpStatus = httpStatus;
		this.code = httpStatus.value();
		return this;
	}
	
	/**
	 * Set data for the response
	 * @param data
	 * @return
	 */
	public ResponseDto<T> withData(T data) {
		this.data = data;
		return this;
	}
	
	/**
	 * Set data with total items for the response
	 * @param data
	 * @param totalItems
	 * @return
	 */
	public ResponseDto<T> withData(T data, int totalItems) {
		this.data = data;
		this.totalItems = this.totalItems;
		return this;
	}
	
	/**
	 * Set HttpHeaders for the response
	 * @param httpHeaders
	 * @return
	 */
	public ResponseDto<T> withHttpHeaders(HttpHeaders httpHeaders) {
		this.headers = httpHeaders;
		return this;
	}
	
	/**
	 * Set message for the response
	 * @param message
	 * @return
	 */
	public ResponseDto<T> withMessage(String message) {
		this.message = message;
		return this;
 	}
	
	/**
	 * Set errors for the response
	 * @param errors
	 * @return
	 */
	public ResponseDto<T> withErrors(T errors) {
		this.errors = errors;
		return this;
	}
	
	/**
	 * Convert to standard ResponseEntity
	 * @return
	 */
	public ResponseEntity<ResponseDto> toResponseEntity() {
		return new ResponseEntity<>(this, httpStatus);
	}
	
}
