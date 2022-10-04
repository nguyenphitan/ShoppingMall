package com.nguyenphitan.domain.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.nguyenphitan.utils.MessageUtils;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * User account
 * @author ADMIN
 *
 */
@Getter
@Setter
@ToString
@Entity
@Table(name = "account")
public class Account extends Userr {
	/** ID */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	
	/** User id */
	@NotNull(message = MessageUtils.NOT_NULL)
	@Column(name = "user_id")
	private Integer userId;
	
	/** Email */
	@NotNull(message = MessageUtils.NOT_NULL)
	@Column(name = "email")
	private String email;
	
	/** Password */
	@NotNull(message = MessageUtils.NOT_NULL)
	@Column(name = "password")
	private String password;
	
	/** User role */
	@NotNull(message = MessageUtils.NOT_NULL)
	@Column(name = "role")
	private String role;
}
