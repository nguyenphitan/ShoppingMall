package com.nguyenphitan.controller;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.io.IOException;
import java.nio.charset.Charset;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.http.MediaType;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.test.web.servlet.request.RequestPostProcessor;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.nguyenphitan.JSonUtil;
import com.nguyenphitan.app.controller.LoginAuthController;
import com.nguyenphitan.app.request.LoginAuthRequest;
import com.nguyenphitan.domain.entity.Account;
import com.nguyenphitan.domain.service.JwtUserDetailsService;
import com.nguyenphitan.oauth.CustomUserDetails;
import com.nguyenphitan.utils.JwtTokenUtils;


public class LoginAuthControllerTest extends AbstractControllerTest{
	
	@Mock
	private AuthenticationManager authenticationManager;
	
	@Mock 
	private JwtTokenUtils jwtTokenUtils;
	
	@Mock
	private JwtUserDetailsService userDetailsService;

    @InjectMocks
    private LoginAuthController loginAuthController;
    
    // URI path
    private String apiUrl = "/api/v1/auth/login";

    private MediaType contentType = new MediaType(MediaType.APPLICATION_JSON.getType(), MediaType.APPLICATION_JSON.getSubtype(), Charset.forName("utf8"));
    
    // Bearer token
    private RequestPostProcessor bearerToken;

    @Before
    public void init() throws IOException {
        MockitoAnnotations.openMocks(this);
        this.mockMvc = MockMvcBuilders
        		.standaloneSetup(loginAuthController)
                .addFilter(springSecurityFilterChain)
                .setCustomArgumentResolvers(pageableArgumentResolver)
                .build();
    }

    @Test
    public void testCheckLoginOK() throws Exception {
    	LoginAuthRequest params = new LoginAuthRequest();
    	params.setEmail("test@gmail.com");
    	params.setPassword("12345678");
    	
    	Account account = new Account();
    	account.setEmail("test@gmail.com");
    	account.setPassword("12345678");
    	
    	CustomUserDetails userDetails = new CustomUserDetails();
    	userDetails.setUser(account);
    	when(userDetailsService.loadUserByUsername(Mockito.anyString())).thenReturn(userDetails);
    	
    	this.mockMvc.perform(post(apiUrl)
    			.with(bearerToken)
    			.contentType(contentType)
    			.content(JSonUtil.asJsonString(params)))
    			.andExpect(status().isOk());
    }
    
    
}
