package com.cloud.salesservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cloud.salesservice.model.Courier;

public interface CourierRepository extends JpaRepository<Courier,Integer> {

}
