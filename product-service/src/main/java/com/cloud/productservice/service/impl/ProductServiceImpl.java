package com.cloud.productservice.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cloud.productservice.model.Brand;
import com.cloud.productservice.model.Product;
import com.cloud.productservice.model.Type;
import com.cloud.productservice.repository.BrandRepository;
import com.cloud.productservice.repository.ProductRepository;
import com.cloud.productservice.repository.TypeRepository;
import com.cloud.productservice.service.TypeService;

@Service
public class ProductServiceImpl implements TypeService{

	@Autowired
	ProductRepository productRepo;
	@Autowired
	BrandRepository brandRepo;
	@Autowired
	TypeRepository typeRepo;
	
	@Override
	public void saveProduct(Product product) {
	
		productRepo.save(product);
	}

	@Override
	public Product findByProductId(Long id) {
		
		Optional<Product> data = productRepo.findById(id); 
		if(data.isPresent()) {
			return data.get();
		}
		return null; 
	}

	@Override
	public List<Product> getAllProduct() {
		return productRepo.findAll();
	}

	@Override
	public void deleteProduct(Product product) {
		productRepo.delete(product);
	}

	@Override
	public void saveType(Type type) {
		typeRepo.save(type);
	}

	@Override
	public Type findByTypeId(Integer id) {
		Optional<Type> data = typeRepo.findById(id);
		if(data.isPresent()) {
			return data.get();
		}
		return null;
	}

	@Override
	public List<Type> getAllType() {
		return typeRepo.findAll();
	}

	@Override
	public void deleteType(Type type) {
		typeRepo.delete(type);
	}

	@Override
	public void saveBrand(Brand brand) {
	
		brandRepo.save(brand);
	}

	@Override
	public Brand findByBrandCode(String code) {
		Optional<Brand> data = brandRepo.findById(code);
		if(data.isPresent()) {
			return data.get();
		}
		return null;
	}

	@Override
	public List<Brand> getAllBrand() {
		return brandRepo.findAll();
	}

	@Override
	public void deleteBrand(Brand brand) {
	
		brandRepo.delete(brand);
	}

}
