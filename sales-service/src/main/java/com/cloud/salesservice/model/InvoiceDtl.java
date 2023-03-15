package com.cloud.salesservice.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

import com.cloud.salesservice.dto.ProductDto;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Table(name="invoice_dtl")
@Data
@AllArgsConstructor
public class InvoiceDtl implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@EmbeddedId
	private InvoiceDtlId id;
	private Integer qty;
	private List<ProductDto> product;
	private BigDecimal subtotal;
	private BigDecimal disc;
	public InvoiceDtl(InvoiceDtlId id) {
		super();
		this.id = id;
	}
	
	
	}
