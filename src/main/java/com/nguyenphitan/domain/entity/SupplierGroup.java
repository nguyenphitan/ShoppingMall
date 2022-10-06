package com.nguyenphitan.domain.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.nguyenphitan.utils.MessageUtils;

import lombok.Data;

@Data
@Entity
@Table(name = "supplier_group")
public class SupplierGroup {
	/** ID */
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	/** Group code */
	@Column(name = "code")
	@NotNull(message = MessageUtils.GROUP_CODE_NOT_NULL)
	private String code;
	
	/** Group name */
	@Column(name = "name")
	@NotNull(message = MessageUtils.GROUP_NAME_NOT_NULL)
	private String name;
	
	@OneToMany(mappedBy = "supplierGroup")
	private Set<Supplier> suppliers;

}
