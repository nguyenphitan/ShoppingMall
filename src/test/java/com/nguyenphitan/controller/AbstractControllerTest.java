package com.nguyenphitan.controller;

import java.nio.charset.Charset;

import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.data.web.PageableHandlerMethodArgumentResolver;
import org.springframework.http.MediaType;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.FilterChainProxy;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@EnableAspectJAutoProxy
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { WebMvcConfigurerAdapter.class, WebSecurity.class})
@WebAppConfiguration(value = "web")
public class AbstractControllerTest {
	
	protected MockMvc mockMvc;
	
	@Autowired
    protected PasswordEncoder encoder;
	
	@Autowired
    protected FilterChainProxy springSecurityFilterChain;
	
	@InjectMocks
    protected PageableHandlerMethodArgumentResolver pageableArgumentResolver;
	
	@Autowired
    protected WebApplicationContext webApplicationContext;
	
	protected MediaType contentType = new MediaType(MediaType.APPLICATION_JSON.getType(), MediaType.APPLICATION_JSON.getSubtype(),
            Charset.forName("utf8"));
	
}
