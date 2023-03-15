package com.cloud.salesservice.model;

import java.math.BigDecimal;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Table(name="invoice_header")
@Data
@AllArgsConstructor
public class InvoiceHead {
	
	@Id
	private Long invoiceNo;
	private String invoiceType;
	private Date invoiceDate;
	private BigDecimal totalAmount;
	private Integer totalItem;

}
