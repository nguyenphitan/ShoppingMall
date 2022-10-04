package com.nguyenphitan.dto;

import com.nguyenphitan.domain.entity.Account;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Return when create new account
 * @author ADMIN
 *
 */
@Getter
@Setter
@ToString
public class AccountRegisterDto {
	private Account account;
	private String message;
	
	/**
	 * Create new instant of AccountRegisterDto
	 * @return
	 */
	public AccountRegisterDto build() {
		return new AccountRegisterDto();
	}

	/**
	 * Set account data to object
	 * @return
	 */
	public AccountRegisterDto withData(Account account) {
		this.account = account;
		return this;
	}
	
	/**
	 * Set message to object
	 * @return
	 */
	public AccountRegisterDto withMessage(String message) {
		this.message = message;
		return this;
	}
	
}
