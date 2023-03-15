package com.cloud.salesservice.model;

import java.util.Date;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="invoice_dtl_ol")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class InvoiceDtlOnline {

	@EmbeddedId
	private InvoiceDtlId id;
	@ManyToOne
	@JoinColumn(name="courier_id")
	private Courier courier;
	private Date pickupDate;
	private Integer deliveryEstDay;
	private Date arrivedDate;
	public InvoiceDtlOnline(InvoiceDtlId id) {
		super();
		this.id = id;
	}
	
}
