package com.cloud.salesservice.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Table(name="courier_mst")
@Data
@AllArgsConstructor
public class Courier {

	@Id
	private Integer courierId;
	private String courierName;	
	private String courierType;
	private Integer rating;
	

}
