package com.nguyenphitan.domain.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.nguyenphitan.utils.MessageUtils;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Customer entity
 *
 */
@Getter
@Setter
@ToString
@Entity
@Table(name = "customer")
public class Customer {
	/** ID */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	
	/** Customer code */
	@Column(name = "code")
	@NotNull(message = MessageUtils.CUSTOMER_CODE_NOT_NULL)
	private String code;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "user_id", referencedColumnName = "id")
	private User user;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "cart_id", referencedColumnName = "id")
	private Cart cart;
	
	@OneToMany(mappedBy = "customer")
	private Set<Order> orders;
	
}
