package com.cloud.productservice.controller;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cloud.productservice.model.Brand;
import com.cloud.productservice.model.Product;
import com.cloud.productservice.model.Type;
import com.cloud.productservice.service.TypeService;

@RestController
@RequestMapping(value = "/api/products/")
public class ProductServiceController {

	@Autowired
	TypeService service;
	
	Logger logger = LoggerFactory.getLogger(this.getClass());

	@GetMapping("/get-brand/{code}")
	public ResponseEntity<?> getBrands(@PathVariable("code") String code) {
		Brand br = service.findByBrandCode(code);
		if (null != br) {
			return ResponseEntity.ok().body(br);
		}
		return ResponseEntity.notFound().build();
	}

	@GetMapping("get-type/{id}")
	public ResponseEntity<?> getType(@PathVariable("id") Integer id) {
		Type t = service.findByTypeId(id);
		if (null != t) {
			return ResponseEntity.ok().body(t);
		}
		return ResponseEntity.notFound().build();
	}

	@GetMapping("{id}")
	public ResponseEntity<?> getProduct(@PathVariable("id") Long id) {
		Product p = service.findByProductId(id);
		if (null != p) {
			return ResponseEntity.ok().body(p);
		}
		return ResponseEntity.notFound().build();
	}

	@GetMapping("all-brands")
	public ResponseEntity<?> viewBrands() {
		List<Brand> data = service.getAllBrand();
		return ResponseEntity.ok().body(data);
	}

	@GetMapping("all-types")
	public ResponseEntity<?> allTypes() {
		List<Type> data = service.getAllType();
		return ResponseEntity.ok().body(data);
	}

	public ResponseEntity<?> viewProducts() {
		List<Product> data = service.getAllProduct();
		return ResponseEntity.ok().body(data);
	}

	@PostMapping("save-brand")
	public ResponseEntity<?> saveBrand(@RequestBody Brand brand) {
		logger.info("brand : " + brand.getBrandCode() + " name: " + brand.getBrandName());
		Optional<Brand> exists = Optional.ofNullable(service.findByBrandCode(brand.getBrandCode()));
		if (!exists.isPresent()) {
			try{
				service.saveBrand(brand);
				return ResponseEntity.ok().body(brand);
			} catch (Exception e) {
				return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
			}
		}
		return new ResponseEntity<>("data is exists!", HttpStatus.CONFLICT);
	}

	@PostMapping("save-type")
	public ResponseEntity<?> saveType(@RequestBody Type type) {
		Optional<Type> exists = Optional.ofNullable(service.findByTypeId(type.getTypeId()));
		if (!exists.isPresent()) {
			try {
				service.saveType(type);
				return ResponseEntity.ok().body(type);
			} catch (Exception e) {
				return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
			}
		}
		return new ResponseEntity<>("data is exists!", HttpStatus.CONFLICT);
	}

	@PostMapping
	public ResponseEntity<?> saveProduct(@RequestBody Product product) {
		Optional<Product> exists = Optional.ofNullable(service.findByProductId(product.getProductId()));
		if (!exists.isPresent()) {
			try {
				service.saveProduct(product);
				return ResponseEntity.ok().body(product);
			} catch (Exception e) {
				return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
			}

		}
		return new ResponseEntity<>("data is exists!", HttpStatus.CONFLICT);

	}
	
	@DeleteMapping("del-brand/{code}")
	public ResponseEntity<?> delBrand(@PathVariable("code") String code) {
		Optional<Brand> exists = Optional.ofNullable(service.findByBrandCode(code));
		if (exists.isPresent()) {
			try{
				service.deleteBrand(exists.get());
				return ResponseEntity.ok().body(exists.get());
			} catch (Exception e) {
				return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
			}
		}
		return new ResponseEntity<>("brand is not found!", HttpStatus.NOT_FOUND);
	}

	@DeleteMapping("del-type/{id}")
	public ResponseEntity<?> delType(@PathVariable("id") Integer id) {
		Optional<Type> exists = Optional.ofNullable(service.findByTypeId(id));
		if (exists.isPresent()) {
			try {
				service.deleteType(exists.get());
				return ResponseEntity.ok().body(exists.get());
			} catch (Exception e) {
				return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
			}
		}
		return new ResponseEntity<>("type is not found!", HttpStatus.NOT_FOUND);
	}

	@DeleteMapping("del-product/{id}")
	public ResponseEntity<?> delProduct(@PathVariable("id") Long id) {
		Optional<Product> exists = Optional.ofNullable(service.findByProductId(id));
		if (exists.isPresent()) {
			try {
				service.deleteProduct(exists.get());
				return ResponseEntity.ok().body(exists.get());
			} catch (Exception e) {
				return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
			}

		}
		return new ResponseEntity<>("product is not found!", HttpStatus.NOT_FOUND);

	}
}
