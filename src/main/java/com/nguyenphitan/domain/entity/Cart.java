package com.nguyenphitan.domain.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "cart")
public class Cart {
	/** ID */
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	/** Total price */
	@Column(name = "total_price")
	private Float totalPrice;
	
	@OneToOne(mappedBy = "cart")
	private Customer customer;
	
	@ManyToOne
	@JoinColumn(name = "product_item_id", nullable = false)
	private ProductItem productItem;
	
}
