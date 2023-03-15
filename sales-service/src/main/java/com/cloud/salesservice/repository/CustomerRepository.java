package com.cloud.salesservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cloud.salesservice.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long>{

}
