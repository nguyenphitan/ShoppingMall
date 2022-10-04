package com.nguyenphitan.utils;

import org.springframework.stereotype.Component;

/**
 * Define message utils
 *
 */
@Component
public interface MessageUtils {
	
	/** Length is larger than 10 character */
	public static final String LARGER_THAN_10_CHARACTER = "Field cannot larger than 10 character";
	
	/** Length is larger than 50 character */
	public static final String LARGER_THAN_50_CHARACTER = "Field cannot larger than 50 character";
	
	/** Length is larger than 256 character */
	public static final String LARGER_THAN_256_CHARACTER = "Field cannot larger than 256 character";
	
	/** Return success */
	public static final String OK = "OK";
	
	/** Email field cannot be null */
	public static final String EMAIL_NOT_NULL = "Email field cannot be null";
	
	/** Password field cannot be null */
	public static final String PASSWORD_NOT_NULL = "Password field cannot be null";
	
	/** Field cannot be null */
	public static final String NOT_NULL = "Field cannot be null";
	
	/** Field cannot be blank */
	public static final String NOT_BLANK = "Field cannot be blank";
	
	/** Minimum character for password */
	public static final String MINIMUN_PASSWORD_CHARACTOR = "Minimum character is 8 characters";
	
	/** Login success */
	public static final String LOGIN_OK = "Login success";
	
	/** User disable */
	public static final String USER_DISABLED = "User disable";
	
	/** Invalid credentials */
	public static final String INVALID_CREDENTIALS = "Invalid credentials";
	
	/** Email existed */
	public static final String EMAIL_EXISTED = "Email existed";
	
	/** Account does not exist */
	public static final String ACCOUNT_DOES_NOT_EXIST = "Account does not exist";
	
	/** User does not exist */
	public static final String USER_DOES_NOT_EXIST = "User does not exist";
	
	/** Fail to update user info */
	public static final String FAIL_TO_UPDATE_USER = "Fail to update user info";
	
	/** Fail to update account info */
	public static final String FAIL_TO_UPDATE_ACCOUNT = "Fail to update account info";
	
	/** Don't have permission to access */
	public static final String DO_NOT_PERMISSION_TO_ACCESS = "You don't have permission to access this API";
	
	/** Gender cannot larger than 1 character */
	public static final String GENDER_CANNOT_LARGER_THAN_1_CHARACTER = "Gender cannot larger than 1 character";
	
}
