package com.nguyenphitan.domain.repository;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.nguyenphitan.domain.entity.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account, Integer> {
	@Query(value = "select * from account where email=?", nativeQuery = true)
	Optional<Account> findAccountByEmail(String email);
	
	@Modifying
	@Transactional
	@Query(value = "UPDATE account SET password=?2 WHERE id=?1", nativeQuery = true)
	Integer updateAccount(Integer id, String password);
}
