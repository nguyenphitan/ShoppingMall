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
@Table(name = "category")
public class Category {
	/** ID */
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	/** Category code */
	@Column(name = "code")
	@NotNull(message = MessageUtils.CATEGORY_CODE_NOT_NULL)
	private String code;
	
	/** Category name */
	@Column(name = "name")
	@NotNull(message = MessageUtils.CATEGORY_NAME_NOT_NULL)
	private String name;
	
	@OneToMany(mappedBy = "category")
	private Set<Product> products;

}
