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
	
	/** Role not null */
	public static final String ROLE_NOT_NULL = "Role cannot be null";
	
	/** Customer code cannot be null */
	public static final String CUSTOMER_CODE_NOT_NULL = "Customer code cannot be null";
	
	/** Employee code cannot be null */
	public static final String EMPLOYEE_CODE_NOT_NULL = "Employee code cannot be null";
	
	/** Manager code cannot be null */
	public static final String MANAGER_CODE_NOT_NULL = "Manager code cannot be null";
	
	/** Order date cannot be null */
	public static final String ORDER_DATE_NOT_NULL = "Order date cannot be null";
	
	/** Total payment cannot be null */
	public static final String TOTAL_PAYMENT_NOT_NULL = "Total payment cannot be null";
	
	/** Order status cannot be null */
	public static final String ORDER_STATUS_NOT_NULL = "Order status cannot be null";
	
	/** Delivery date cannot be null */
	public static final String DELIVERY_DATE_NOT_NULL = "Delivery date cannot be null";
	
	/** Product code cannot be null */
	public static final String PRODUCT_CODE_NOT_NULL = "Product code cannot be null";
	
	/** Supplier code cannot be null */
	public static final String SUPPLIER_CODE_NOT_NULL = "Supplier code cannot be null";
	
	/** Import bill code cannot be null */
	public static final String IMPORT_BILL_CODE_NOT_NULL = "Import bill code cannot be null";
	
	/** Name cannot be null */
	public static final String NAME_NOT_NULL = "Name cannot be null";
	
	/** Product name cannot be null */
	public static final String PRODUCT_NAME_NOT_NULL = "Product name cannot be null";
	
	/** Phone number cannot be null */
	public static final String PHONE_NOT_NULL = "Phone number cannot be null";
	
	/** Phone number of receiver cannot be null */
	public static final String RECEIVER_PHONE_NOT_NULL = "Phone number of receiver cannot be null";
	
	/** Payment method cannot be null */
	public static final String PAYMENT_METHOD_NOT_NULL = "Payment method cannot be null";
	
	/** Group code cannot be null */
	public static final String GROUP_CODE_NOT_NULL = "Group code cannot be null";
	
	/** Category code cannot be null */
	public static final String CATEGORY_CODE_NOT_NULL = "Category code cannot be null";
	
	/** Order code cannot be null */
	public static final String ORDER_CODE_NOT_NULL = "Order code cannot be null";
	
	/** Bill code cannot be null */
	public static final String BILL_CODE_NOT_NULL = "Bill code cannot be null";
	
	/** Group name cannot be null */
	public static final String GROUP_NAME_NOT_NULL = "Group name cannot be null";
	
	/** Category name cannot be null */
	public static final String CATEGORY_NAME_NOT_NULL = "Category name cannot be null";
	
	/** ID No cannot be null */
	public static final String ID_NO_NOT_NULL = "ID No cannot be null";
	
	/** Import price cannot be null */
	public static final String IMPORT_PRICE_NOT_NULL = "Import price cannot be null";
	
	/** Code cannot be null */
	public static final String CODE_NOT_NULL = "Code cannot be null";
	
	/** Product price cannot be null */
	public static final String PRODUCT_PRICE_NOT_NULL = "Product price cannot be null";
	
	/** Inventory cannot be null */
	public static final String INVENTORY_NOT_NULL = "Inventory cannot be null";
	
	/** Company name cannot be null */
	public static final String COMPANY_NO_NOT_NULL = "Company name cannot be null";
	
	/** Employee status cannot be null */
	public static final String EMPLOYEE_STATUS_NOT_NULL = "Employee status cannot be null";
	
	/** Manager status cannot be null */
	public static final String MANAGER_STATUS_NOT_NULL = "Manager status cannot be null";
	
	/** Import date cannot be null */
	public static final String IMPORT_ORDER_DATE_NOT_NULL = "The import date of the order cannot be null";
	
	/** Total price import cannot be null */
	public static final String TOTAL_PRICE_IMPORT_NOT_NULL = "The total price of the order cannot be null";
	
}
