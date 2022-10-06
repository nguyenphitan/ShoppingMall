package com.nguyenphitan.domain.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.nguyenphitan.utils.MessageUtils;

import lombok.Data;

@Data
@Entity
@Table(name = "manager")
public class Manager {
	/** ID */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	
	/** Manager code */
	@NotNull(message = MessageUtils.MANAGER_CODE_NOT_NULL)
	private String code;
	
	/** ID No */
	@NotNull(message = MessageUtils.ID_NO_NOT_NULL)
	private String idNo;
	
	/** Status */
	@NotNull(message = MessageUtils.MANAGER_STATUS_NOT_NULL)
	private Integer status;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "user_id", referencedColumnName = "id")
	private User user;
	
	@OneToMany(mappedBy = "manager")
	private Set<Employee> employees;
	
	@OneToMany(mappedBy = "manager")
	private Set<ImportOrder> importOrders;
	
}
