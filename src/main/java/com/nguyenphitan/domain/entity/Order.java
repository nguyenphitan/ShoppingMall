package com.nguyenphitan.domain.entity;

import java.sql.Timestamp;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.nguyenphitan.utils.MessageUtils;

import lombok.Data;

@Data
@Entity
@Table(name = "\"order\"")
public class Order {
	/** ID */
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	/** Order code */
	@Column(name = "code")
	@NotNull(message = MessageUtils.ORDER_CODE_NOT_NULL)
	private String code;
	
	/** Order date */
	@Column(name = "order_date")
	@NotNull(message = MessageUtils.ORDER_DATE_NOT_NULL)
	private Timestamp orderDate;
	
	/** Delivery date */
	@Column(name = "delivery_date")
	@NotNull(message = MessageUtils.DELIVERY_DATE_NOT_NULL)
	private Timestamp deliveryDate;

	/** Order status */
	@Column(name = "status")
	@NotNull(message = MessageUtils.ORDER_STATUS_NOT_NULL)
	private Integer status;
	
	/** Total payment */
	@Column(name = "total_payment")
	@NotNull(message = MessageUtils.TOTAL_PAYMENT_NOT_NULL)
	private Float totalPayment;
	
	@ManyToOne
	@JoinColumn(name = "employee_id", nullable = false)
	private Employee employee;
	
	@ManyToOne
	@JoinColumn(name = "customer_id", nullable = false)
	private Customer customer;
	
	@ManyToOne
	@JoinColumn(name = "payment_id", nullable = false)
	private Payment payment;
	
	@OneToMany(mappedBy = "order")
	private Set<OrderItem> orderItems;
	
	@OneToOne(mappedBy = "order")
	private Bill bill;

}
