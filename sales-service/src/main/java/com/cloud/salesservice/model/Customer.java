package com.cloud.salesservice.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="customer_mst")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer {

	@Id
	private Long customerId;
	private String customerName;
	private String customerAddress;
	private String customerPhone;
}
