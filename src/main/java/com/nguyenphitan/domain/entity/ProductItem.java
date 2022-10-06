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
@Table(name = "product_item")
public class ProductItem {
	/** ID */
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	/** Product quantity */
	@Column(name = "quantity")
	@NotNull(message = MessageUtils.NOT_NULL)
	private Integer quantity;
	
	@ManyToOne
	@JoinColumn(name = "product_id", nullable = false)
	private Product product;
	
	@OneToMany(mappedBy = "productItem")
	private Set<Cart> carts;
	
}
