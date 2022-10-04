package com.nguyenphitan.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Return update account
 * @author ADMIN
 *
 */
@Getter
@Setter
@ToString
public class AccountUpdateDto {
	/** Message */
	private String message;
	
	/**
	 * Create new instant of AccountRegisterDto
	 * @return
	 */
	public AccountUpdateDto build() {
		return new AccountUpdateDto();
	}
	
	/**
	 * Set message to object
	 * @return
	 */
	public AccountUpdateDto withMessage(String message) {
		this.message = message;
		return this;
	}
	
}
