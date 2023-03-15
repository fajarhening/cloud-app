package com.cloud.productservice.model;

import java.util.Date;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="PRODUCT_MST")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
	@Id
	private Long productId;
	private String productDesc;
	@ManyToOne (cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name="brandCode")
	private Brand brand;
	@ManyToOne (cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name="typeId")
	private Type type;
	private String color;
	private String edition;
	private Date createDate;
	private String createId;
	private Date modifiedDate;
	private String modifiedBy;
	
}
