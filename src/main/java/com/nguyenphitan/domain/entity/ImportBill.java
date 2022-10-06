package com.nguyenphitan.domain.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.nguyenphitan.utils.MessageUtils;

import lombok.Data;

@Data
@Entity
@Table(name = "import_bill")
public class ImportBill {
	/** ID */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	
	/** Import bill code */
	@Column(name = "code")
	@NotNull(message = MessageUtils.IMPORT_BILL_CODE_NOT_NULL)
	private String code;
	
	@ManyToOne
	@JoinColumn(name = "import_order_id", nullable = false)
	private ImportOrder importOrder;

}
