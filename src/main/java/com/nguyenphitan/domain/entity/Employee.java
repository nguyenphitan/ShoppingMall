package com.nguyenphitan.domain.entity;

import java.util.Set;

import javax.persistence.CascadeType;
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
@Table(name = "employee")
public class Employee {
	/** ID */
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	/** Employee code */
	@NotNull(message = MessageUtils.EMPLOYEE_CODE_NOT_NULL)
	private String code;
	
	/** ID No */
	@NotNull(message = MessageUtils.ID_NO_NOT_NULL)
	private String idNo;
	
	/** Status */
	@NotNull(message = MessageUtils.EMPLOYEE_STATUS_NOT_NULL)
	private Integer status;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "user_id", referencedColumnName = "id")
	private User user;
	
	@ManyToOne
	@JoinColumn(name = "manager_id", nullable = false)
	private Manager manager;
	
	@OneToMany(mappedBy = "employee")
	private Set<Order> orders;
	
}
