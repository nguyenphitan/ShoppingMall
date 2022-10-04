package com.nguyenphitan.service;

import static org.mockito.Mockito.when;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.nguyenphitan.app.request.AccountRegisterRequest;
import com.nguyenphitan.domain.entity.Account;
import com.nguyenphitan.domain.entity.Userr;
import com.nguyenphitan.domain.repository.AccountRepository;
import com.nguyenphitan.domain.repository.UserRepository;
import com.nguyenphitan.domain.service.impl.AccountServiceImpl;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
        classes = {
                WebMvcConfigurerAdapter.class
        })
@WebAppConfiguration(value = "web")
public class AccountServiceImplTest {

	@Mock
	private AccountRepository accountRepository;
	
	@Mock
	private UserRepository userRepository;
	
	@InjectMocks
	private AccountServiceImpl accountService;
	
	@Before
    public void init() {
        MockitoAnnotations.openMocks(this);
    }
	
	/**
	 * Test create new account success
	 * @throws Exception
	 */
	@Test
	public void testCreateNewAccountOK() throws Exception {
		AccountRegisterRequest params = new AccountRegisterRequest();
		params.setAddress("Ha Noi");
		params.setDateOfBirth(new Date());
		params.setEmail("test@gmail.com");
		params.setFullName("Nguyen Phi Tan");
		params.setPassword("12345678");
		params.setPhoneNumber("0342366513");
		when(accountRepository.findAccountByEmail(Mockito.anyString())).thenReturn(null);
		when(accountRepository.save(Mockito.any())).thenReturn(new Account());
		when(userRepository.save(Mockito.any())).thenReturn(new Userr());
		accountService.createNewAccount(params);
	}
	
}
