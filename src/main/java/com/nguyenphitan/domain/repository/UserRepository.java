package com.nguyenphitan.domain.repository;

import java.util.Date;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.nguyenphitan.domain.entity.Userr;

public interface UserRepository extends JpaRepository<Userr, Integer>{
	@Query(value = "select * from user where email=?", nativeQuery = true)
	Optional<Userr> findUserByEmail(String email);
	
//	@Modifying
//	@Query(value = "UPDATE user SET full_name=#{fullName}, address=#{address}, phone_number=#{phoneNumber}, "
//			+ "date_of_birth=#{dateOfBirth} WHERE id=#{userId}", nativeQuery = true)
//	Optional<User> updateUser(UserUpdateRequest userUpdate);
	
	@Modifying
	@Transactional
	@Query(value = "UPDATE user SET full_name=?2, address=?3, phone_number=?4, "
			+ "date_of_birth=?5 WHERE id=?1", nativeQuery = true)
	Integer updateUser(Integer id, String fullName, String address, String phoneNumber, Date dateOfBirth);
}
