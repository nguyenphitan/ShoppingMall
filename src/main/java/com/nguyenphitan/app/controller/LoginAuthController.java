package com.nguyenphitan.app.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nguyenphitan.app.request.LoginAuthRequest;
import com.nguyenphitan.domain.service.JwtUserDetailsService;
import com.nguyenphitan.dto.ResponseDto;
import com.nguyenphitan.exception.BusinessException;
import com.nguyenphitan.utils.JwtTokenUtils;
import com.nguyenphitan.utils.MessageUtils;

/**
 * Login authentication controller
 * @author ADMIN
 *
 */
@RestController
@RequestMapping("api/v1/auth/login")
public class LoginAuthController {
	
	@Autowired
	private AuthenticationManager authenticationManager;

	@Autowired
	private JwtTokenUtils jwtTokenUtils;

	@Autowired
	private JwtUserDetailsService userDetailsService;

	/**
	 * API login authentication
	 * @param loginAuthRequest
	 * @return 
	 */
	@PostMapping()
	public ResponseEntity<ResponseDto> checkLogin(@RequestBody @Valid LoginAuthRequest loginAuthRequest) throws Exception {
		HttpStatus status = HttpStatus.OK;
		String message = MessageUtils.LOGIN_OK;
		authenticate(loginAuthRequest.getEmail(), loginAuthRequest.getPassword());	// authenticate with email and password
		final UserDetails userDetails = userDetailsService
				.loadUserByUsername(loginAuthRequest.getEmail());
		
		final String token = jwtTokenUtils.generateToken(userDetails);
		return ResponseDto.build()
				.withHttpStatus(status)
				.withData(token)
				.withMessage(message).toResponseEntity();
	}
	
	/**
	 * Authenticate with email and password
	 * @param email
	 * @param password
	 * @throws Exception
	 */
	private void authenticate(String email, String password) throws Exception {
		try {
			authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(email, password));
		} catch (DisabledException e) {
			throw new BusinessException(MessageUtils.USER_DISABLED);
		} catch (BadCredentialsException e) {
			throw new BusinessException(MessageUtils.INVALID_CREDENTIALS);
		}
	}
	
}
