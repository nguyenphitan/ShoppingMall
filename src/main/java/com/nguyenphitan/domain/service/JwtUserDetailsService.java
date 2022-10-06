//package com.nguyenphitan.domain.service;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//
//import com.nguyenphitan.domain.entity.Customer;
//import com.nguyenphitan.domain.entity.User;
//import com.nguyenphitan.domain.repository.AccountRepository;
//import com.nguyenphitan.oauth.CustomUserDetails;
//
///**
// * Jwt user details service
// * @author ADMIN
// *
// */
//@Service
//public class JwtUserDetailsService implements UserDetailsService {
//
//	@Autowired
//	private AccountRepository accountRepository;
//	
//	@Override
//	public UserDetails loadUserByUsername(String email) {
//		User user = accountRepository.findAccountByEmail(email).orElseThrow(
//				() -> new UsernameNotFoundException("Tai khoan mat khau khong chinh xac")
//		);
//		return new CustomUserDetails(user);
//	}
//	
////	@Override
////	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
////		if ("javainuse".equals(username)) {
////			return new User("nguyenphitan", "$2a$10$slYQmyNdGzTn7ZLBXBChFOC9f6kFjAqPhccnP6DxlWXx2lPk1C3G6",
////					new ArrayList<>());
////		} else {
////			throw new UsernameNotFoundException("User not found with username: " + username);
////		}
////	}
//	
//}
