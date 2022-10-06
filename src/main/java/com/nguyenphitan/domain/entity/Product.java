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
@Table(name = "product")
public class Product {
	/** ID */
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	/** Product code */
	@Column(name = "code")
	@NotNull(message = MessageUtils.PRODUCT_CODE_NOT_NULL)
	private String code;
	
	/** Product name */
	@Column(name = "name")
	@NotNull(message = MessageUtils.PRODUCT_NAME_NOT_NULL)
	private String productName;
	
	/** Import price */
	@Column(name = "import_price")
	@NotNull(message = MessageUtils.IMPORT_PRICE_NOT_NULL)
	private Float importPrice;
	
	/** Product price */
	@Column(name = "price")
	@NotNull(message = MessageUtils.PRODUCT_PRICE_NOT_NULL)
	private Float price;
	
	/** Inventory */
	@Column(name = "inventory")
	@NotNull(message = MessageUtils.INVENTORY_NOT_NULL)
	private Integer inventory;
	
	/** Description */
	@Column(name = "description")
	private String description;
	
	@OneToMany(mappedBy = "product")
	private Set<ProductItem> items;
	
	@OneToMany(mappedBy = "product")
	private Set<ImportItem> importItems;
	
	@OneToMany(mappedBy = "product")
	private Set<OrderItem> orderItems;
	
	@ManyToOne
	@JoinColumn(name = "category_id", nullable = false)
	private Category category;
	
	@ManyToOne
	@JoinColumn(name = "group_id", nullable = false)
	private ProductGroup productGroup;
	
	@ManyToOne
	@JoinColumn(name = "supplier_id", nullable = false)
	private Supplier supplier;
	
}
