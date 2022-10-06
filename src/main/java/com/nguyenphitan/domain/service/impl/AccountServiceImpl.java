//package com.nguyenphitan.domain.service.impl;
//
//import java.util.Date;
//
//import javax.transaction.Transactional;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.stereotype.Service;
//
//import com.nguyenphitan.app.request.AccountRegisterRequest;
//import com.nguyenphitan.app.request.AccountUpdateRequest;
//import com.nguyenphitan.domain.entity.Account;
//import com.nguyenphitan.domain.entity.User;
//import com.nguyenphitan.domain.repository.AccountRepository;
//import com.nguyenphitan.domain.repository.UserRepository;
//import com.nguyenphitan.domain.service.AccountService;
//import com.nguyenphitan.dto.AccountRegisterDto;
//import com.nguyenphitan.dto.AccountUpdateDto;
//import com.nguyenphitan.exception.BusinessException;
//import com.nguyenphitan.utils.CommonUtils;
//import com.nguyenphitan.utils.JwtTokenUtils;
//import com.nguyenphitan.utils.MessageUtils;
//import com.nguyenphitan.utils.RoleAccount;
//
///**
// * Account service implement
// * @author ADMIN
// *
// */
//@Service
//public class AccountServiceImpl implements AccountService {
//
//	@Autowired 
//	private AccountRepository accountRepository;
//	
//	@Autowired
//	private UserRepository userRepository;
//	
//	@Autowired
//	private PasswordEncoder passwordEncoder;
//	
//	@Autowired
//	private CommonUtils commonUtils;
//	
//	@Autowired
//	private JwtTokenUtils jwtTokenUtils;
//	
//	/**
//	 * Register new account
//	 * @param registerRequest
//	 * @return
//	 */
//	@Override
//	@Transactional
//	public AccountRegisterDto createNewAccount(AccountRegisterRequest registerRequest) {
//		// Check email existed
//		checkEmailExisted(registerRequest.getEmail());
//		
//		// Build user from request
////		User user = new User();
////		user.setEmail(registerRequest.getEmail());
////		user.setFullName(registerRequest.getFullName());
////		user.setAddress(registerRequest.getAddress());
////		user.setDateOfBirth(registerRequest.getDateOfBirth());
////		user.setPhoneNumber(registerRequest.getPhoneNumber());
////		user = userRepository.save(user);
//		
//		// Create account
////		Account account = new Account();
////		account.setUserId(user.getId());
////		account.setEmail(registerRequest.getEmail());
////		account.setPassword(passwordEncoder.encode(registerRequest.getPassword()));
////		account.setRole(RoleAccount.ROLE_USER);
////		account = accountRepository.save(account);
//		
//		AccountRegisterDto response = new AccountRegisterDto();
////		response.setAccount(account);
//		response.setMessage(MessageUtils.OK);
//		return response;
//	}
//
//	/**
//	 * Update account info
//	 * @param updateRequest
//	 * @return
//	 */
//	@Override
//	public AccountUpdateDto updateAccount(AccountUpdateRequest updateRequest) {
//		AccountUpdateDto response = new AccountUpdateDto();
//		String tokenValue = commonUtils.getTokenValue();
//		String email = jwtTokenUtils.getUsernameFromToken(tokenValue);
//		Integer accountId = this.getAccountIdByEmail(email);	// account id
//		Integer userId = this.getUserIdByEmail(email);	// user id
//		
//		// Save user update  info
//		this.saveUserUpdate(userId, updateRequest);
//		// Save account update info
//		this.saveAccountUpdate(accountId, updateRequest);
//		response.setMessage(MessageUtils.OK);
//		return response;
//	}
//	
//	/**
//	 * Save user update info
//	 * @param updateRequest
//	 * @return
//	 */
//	@Transactional(rollbackOn = BusinessException.class)
//	private Integer saveUserUpdate(Integer id, AccountUpdateRequest updateRequest) {
//		String fullName = updateRequest.getFullName();
//		String phoneNumber = updateRequest.getPhoneNumber();
//		String address = updateRequest.getAddress();
//		Date dateOfBirth = updateRequest.getDateOfBirth();
//		
//		try {
//			return userRepository.updateUser(id, fullName, address, phoneNumber, dateOfBirth);
//		} catch (Exception e) {
//			System.out.println(e);
//			throw new BusinessException(MessageUtils.FAIL_TO_UPDATE_USER);
//		}
//	}
//	
//	/**
//	 * Save account update info
//	 * @param updateRequest
//	 * @return
//	 */
//	@Transactional(rollbackOn = BusinessException.class)
//	private Integer saveAccountUpdate(Integer id, AccountUpdateRequest updateRequest) {
//		String passwordEncode = passwordEncoder.encode(updateRequest.getPassword());
//		
//		try {
//			return accountRepository.updateAccount(id, passwordEncode);
//		} catch (Exception e) {
//			throw new BusinessException(MessageUtils.FAIL_TO_UPDATE_ACCOUNT);
//		}
//	}
//	
//	/**
//	 * Get account id from email
//	 * @param email
//	 * @return
//	 */
//	private Integer getAccountIdByEmail(String email) {
//		if(accountRepository.findAccountByEmail(email).isEmpty()) {
//			throw new BusinessException(MessageUtils.ACCOUNT_DOES_NOT_EXIST);
//		} else {
//			Account account = accountRepository.findAccountByEmail(email).get();
//			return account.getId();
//		}
//	}
//	
//	/**
//	 * Get user id from email
//	 * @param email
//	 * @return
//	 */
//	private Integer getUserIdByEmail(String email) {
//		if(userRepository.findUserByEmail(email).isEmpty()) {
//			throw new BusinessException(MessageUtils.USER_DOES_NOT_EXIST);
//		} else {
//			User user = userRepository.findUserByEmail(email).get();
//			return user.getId();
//		}
//	}
//	
//	/**
//	 * Check email existed
//	 * @param email
//	 * @return true: existed/ false: not exists
//	 */
//	private Boolean checkEmailExisted(String email) {
//		if( accountRepository.findAccountByEmail(email).isEmpty() ) {
//			return false;
//		} else {
//			throw new BusinessException(MessageUtils.EMAIL_EXISTED);	
//		}
//	}
//
//}
