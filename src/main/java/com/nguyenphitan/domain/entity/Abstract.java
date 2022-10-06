package com.nguyenphitan.domain.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

import com.nguyenphitan.glossary.PersistentObject;

import lombok.Data;

@Data
@MappedSuperclass
public class Abstract implements PersistentObject, Serializable {
	/** Create At */
	@Column(name = "created_at")
	protected Date createdAt;
	
	/** Update At */
	@Column(name = "updated_at")
	protected Date updatedAt;
	
}
