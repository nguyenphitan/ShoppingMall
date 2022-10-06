package com.nguyenphitan.domain.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import com.nguyenphitan.utils.MessageUtils;

import lombok.Data;

@Entity
@Table(name = "address")
@Data
public class Address {
	
	/** ID */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	
	/** District name */
	@Column(name = "district")
	@Size(max = 50, message = MessageUtils.LARGER_THAN_50_CHARACTER)
    private String district;
	
	/** City name */
	@Column(name = "city")
	@Size(max = 50, message = MessageUtils.LARGER_THAN_50_CHARACTER)
	private String city;
	
	/** Street name */
	@Column(name = "street")
	@Size(max = 256, message = MessageUtils.LARGER_THAN_256_CHARACTER)
	private String street;
	
	@OneToMany(mappedBy = "address")
    private Set<User> users;
	
	@OneToMany(mappedBy = "address")
	private Set<Supplier> suppliers;
	
	@OneToMany(mappedBy = "address")
	private Set<Payment> payments;
    
}
