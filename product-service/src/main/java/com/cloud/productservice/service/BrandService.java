package com.cloud.productservice.service;

import java.util.List;

import com.cloud.productservice.model.Brand;

public interface BrandService {

	void saveBrand(Brand brand);
	
	Brand findByBrandCode(String code);
	
	List<Brand> getAllBrand();
	
	void deleteBrand(Brand brand);

}
