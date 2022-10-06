package com.nguyenphitan.domain.entity;

import java.sql.Timestamp;
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
@Table(name = "import_order")
public class ImportOrder {
	/** ID */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	
	/** Import date */
	@Column(name = "import_date")
	@NotNull(message = MessageUtils.IMPORT_ORDER_DATE_NOT_NULL)
	private Timestamp importDate;
	
	/** Total price */
	@Column(name = "total_price")
	@NotNull(message = MessageUtils.TOTAL_PRICE_IMPORT_NOT_NULL)
	private Float totalPrice;
	
	@ManyToOne
	@JoinColumn(name = "manager_id", nullable = false)
	private Manager manager;
	
	@ManyToOne
	@JoinColumn(name = "supplier_id", nullable = false)
	private Supplier supplier;
	
	@OneToMany(mappedBy = "importOrder")
	private Set<ImportBill> importBills;
	
	@OneToMany(mappedBy = "importOrder")
	private Set<ImportItem> importItems;

}
