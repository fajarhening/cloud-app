package com.cloud.salesservice.dto;

import java.io.Serializable;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductDto implements Serializable{/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long productId;
	private String productDesc;
	private BrandDto brand;
	private TypeDto type;
	private String color;
	private String edition;
	private Date createDate;
	private String createId;
	private Date modifiedDate;
	private String modifiedBy;


}
