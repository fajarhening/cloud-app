package com.cloud.productservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cloud.productservice.model.Type;

@Repository
public interface TypeRepository extends JpaRepository<Type,Integer>{

}
