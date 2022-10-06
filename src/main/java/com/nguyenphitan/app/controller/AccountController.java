//package com.nguyenphitan.app.controller;
//
//import javax.validation.Valid;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.nguyenphitan.app.request.AccountRegisterRequest;
//import com.nguyenphitan.app.request.AccountUpdateRequest;
//import com.nguyenphitan.domain.service.AccountService;
//import com.nguyenphitan.dto.AccountUpdateDto;
//import com.nguyenphitan.dto.ResponseDto;
//import com.nguyenphitan.utils.MessageUtils;
//
///**
// * Account controller
// * @author ADMIN
// *
// */
//@RestController
//@RequestMapping("api/v1/account")
//public class AccountController {
//	
//	@Autowired
//	private AccountService accountService;
//
//	/**
//	 * Register new account
//	 * @param registerRequest
//	 * @return
//	 */
//	@PostMapping(path = "/register")
//	public ResponseEntity<ResponseDto> createNewAccount(@RequestBody @Valid AccountRegisterRequest registerRequest) {
//		HttpStatus status = HttpStatus.OK;
//		String message = MessageUtils.OK;
//		accountService.createNewAccount(registerRequest);
//		return ResponseDto.build().withHttpStatus(status).withMessage(message).toResponseEntity();
//	}
//	
//	/**
//	 * Update account info
//	 * @param updateRequest
//	 * @return
//	 */
//	@PostMapping(path = "/update")
//	public ResponseEntity<ResponseDto> updateAccount(@RequestBody @Valid AccountUpdateRequest updateRequest) {
//		HttpStatus status = HttpStatus.OK;
//		String message = MessageUtils.OK;
//		AccountUpdateDto response = accountService.updateAccount(updateRequest);
//		return ResponseDto.build().
//				withHttpStatus(status).withData(response)
//				.withMessage(message).toResponseEntity();
//	}
//	
//}
