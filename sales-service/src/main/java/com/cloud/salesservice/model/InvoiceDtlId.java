package com.cloud.salesservice.model;

import java.io.Serializable;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
@Data
@AllArgsConstructor
@NoArgsConstructor
public class InvoiceDtlId implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@ManyToOne
	@JoinColumn(name="INVOICE_NO")
	private InvoiceHead invoice;
	@OneToOne
	@JoinColumn(name="MARKET_CODE")
	private MarketPlace market;
	@OneToOne
	@JoinColumn(name="CUSTOMER_ID")
	private Customer customer;

	
}
