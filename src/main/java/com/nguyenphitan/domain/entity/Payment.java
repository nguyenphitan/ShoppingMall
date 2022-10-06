package com.nguyenphitan.domain.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.nguyenphitan.utils.MessageUtils;

import lombok.Data;

@Data
@Entity
@Table(name = "payment")
public class Payment {
	/** ID */
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	/** Receiver name */
	@Column(name = "receiver_name")
	private String receiverName;
	
	/** Phone number */
	@Column(name = "phone_number")
	@NotNull(message = MessageUtils.RECEIVER_PHONE_NOT_NULL)
	private String phoneNumber;
	
	/** Payment method */
	@Column(name = "payment_method")
	@NotNull(message = MessageUtils.PAYMENT_METHOD_NOT_NULL)
	private Integer paymentMethod;
	
	@OneToMany(mappedBy = "payment")
	private Set<Order> orders;
	
	@ManyToOne
	@JoinColumn(name = "address_id", nullable = false)
	private Address address;

}
