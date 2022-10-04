package com.nguyenphitan.domain.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "userr")
public class Userr {
	/** ID */
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected Integer id;
	
	/** Fullname */
	@Column(name = "full_name")
	@NotBlank(message = MessageUtils.NOT_BLANK)
	protected String fullName;
	
	/** User email */
	@Column(name = "avatar")
	protected String avatar;
	
	/** User email */
	@Column(name = "email")
	@NotNull(message = MessageUtils.EMAIL_NOT_NULL)
	protected String email;
	
	/** Phone number */
	@Column(name = "phone_number")
	@Size(max = 10, message = MessageUtils.LARGER_THAN_10_CHARACTER)
	protected String phoneNumber;
	
	/** Password */
	@Column(name = "password")
	@NotNull(message = MessageUtils.PASSWORD_NOT_NULL)
	@Size(min = 8, message = MessageUtils.MINIMUN_PASSWORD_CHARACTOR)
	protected String password;
	
	/** Gender */
	@Column(name = "gender")
	@Size(max = 1, message = MessageUtils.GENDER_CANNOT_LARGER_THAN_1_CHARACTER)
	protected Integer gender;
	
	/** Note */
	@Column(name = "note")
	@Size(max = 256, message = MessageUtils.LARGER_THAN_256_CHARACTER)
	protected String note;
	
	/** Create At */
	@Column(name = "created_at")
	protected Date createdAt;
	
	/** Update At */
	@Column(name = "updated_at")
	protected Date updatedAt;
	
	/** Date of birth */
	@Column(name = "date_of_birth")
	protected Date dateOfBirth;
	
	@ManyToOne
	@JoinColumn(name = "address_id", nullable = false)
	protected Address address;
}
