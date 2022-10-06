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
@Table(name = "supplier")
public class Supplier {
	/** ID */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	
	/** Supplier code */
	@Column(name = "code")
	@NotNull(message = MessageUtils.SUPPLIER_CODE_NOT_NULL)
	private String code;
	
	/** Supplier name */
	@Column(name = "name")
	@NotNull(message = MessageUtils.NAME_NOT_NULL)
	private String name;
	
	/** Phone number */
	@Column(name = "phone_number")
	@NotNull(message = MessageUtils.PHONE_NOT_NULL)
	private String phoneNumber;
	
	/** Email */
	@Column(name = "email")
	@NotNull(message = MessageUtils.EMAIL_NOT_NULL)
	private String email;
	
	/** Company name */
	@Column(name = "company")
	@NotNull(message = MessageUtils.COMPANY_NO_NOT_NULL)
	private String company;
	
	/** Branch */
	@Column(name = "branch")
	private String branch;
	
	/** Tax code */
	@Column(name = "tax_code")
	private String taxCode;
	
	/** Note */
	@Column(name = "note")
	private String note;
	
	@OneToMany(mappedBy = "supplier")
	private Set<ImportOrder> importOrders;
	
	@OneToMany(mappedBy = "supplier")
	private Set<ImportItem> importItems;
	
	@OneToMany(mappedBy = "supplier")
	private Set<Product> products;
	
	@ManyToOne
	@JoinColumn(name = "group_id", nullable = false)
	private SupplierGroup supplierGroup;
	
	@ManyToOne
	@JoinColumn(name = "address_id", nullable = false)
	private Address address;
	
	
}
