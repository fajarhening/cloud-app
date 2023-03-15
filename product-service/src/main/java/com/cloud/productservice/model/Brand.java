package com.cloud.productservice.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="BRAND_MST")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Brand {
	
	@Id
	private String brandCode;
	private String brandName;
	private String companyName;

}
