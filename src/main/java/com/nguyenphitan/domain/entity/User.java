package com.nguyenphitan.domain.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.nguyenphitan.utils.MessageUtils;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
@Table(name = "user")
public class User extends Abstract {
	/** ID */
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	/** Fullname */
	@Column(name = "full_name")
	@NotBlank(message = MessageUtils.NOT_BLANK)
	private String fullName;
	
	/** User email */
	@Column(name = "avatar")
	private String avatar;
	
	/** User email */
	@Column(name = "email")
	@NotNull(message = MessageUtils.EMAIL_NOT_NULL)
	private String email;
	
	/** Phone number */
	@Column(name = "phone_number")
	@Size(max = 10, message = MessageUtils.LARGER_THAN_10_CHARACTER)
	private String phoneNumber;
	
	/** Password */
	@Column(name = "password")
	@NotNull(message = MessageUtils.PASSWORD_NOT_NULL)
	@Size(min = 8, message = MessageUtils.MINIMUN_PASSWORD_CHARACTOR)
	private String password;
	
	/** Gender */
	@Column(name = "gender")
	@Size(max = 1, message = MessageUtils.GENDER_CANNOT_LARGER_THAN_1_CHARACTER)
	private Integer gender;
	
	/** Note */
	@Column(name = "note")
	@Size(max = 256, message = MessageUtils.LARGER_THAN_256_CHARACTER)
	private String note;
	
	/** Date of birth */
	@Column(name = "date_of_birth")
	private Date dateOfBirth;
	
	/** User role */
	@NotNull(message = MessageUtils.ROLE_NOT_NULL)
	private String role;
	
	@ManyToOne
	@JoinColumn(name = "address_id", nullable = false)
	private Address address;
	
	@OneToOne(mappedBy = "user")
	private Customer customer;
	
	@OneToOne(mappedBy = "user")
	private Employee employee;
	
	@OneToOne(mappedBy = "user")
	private Manager manager;
}
