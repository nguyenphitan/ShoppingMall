package com.nguyenphitan.app.request;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

/**
 * Validate user update request
 * @author ADMIN
 *
 */
@Setter
@Getter
public class UserUpdateRequest {
	/** User id */
	private Integer userId; 
	
	/** Fullname */
	private String fullName;
	
	/** Phone number */
	private String phoneNumber;
	
	/** User address */
	private String address;
	
	/** Date of birth */
	private Date dateOfBirth;
	
}
