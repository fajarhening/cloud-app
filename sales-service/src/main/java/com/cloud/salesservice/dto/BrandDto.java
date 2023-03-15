package com.cloud.salesservice.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BrandDto implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String brandCode;
	private String brandName;
	private String companyName;

}
