package com.nguyenphitan.app.response;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Return login
 * @author ADMIN
 *
 */
@Getter
@Setter
@ToString
public class LoginAuthResponse implements Serializable{
	/**
	 * Serial version uid 
	 */
	private static final long serialVersionUID = 1L;
	
	/** jwt token */
	private String token;
}
