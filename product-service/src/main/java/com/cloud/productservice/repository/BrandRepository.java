package com.cloud.productservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cloud.productservice.model.Brand;

@Repository
public interface BrandRepository extends JpaRepository<Brand,String>{

}
