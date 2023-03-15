package com.cloud.productservice.service;

import java.util.List;

import com.cloud.productservice.model.Type;

public interface TypeService extends ProductService,BrandService{

	void saveType(Type type);
	
	Type findByTypeId(Integer id);
	
	List<Type> getAllType();
	
	void deleteType(Type type);

}
