package com.cloud.salesservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cloud.salesservice.model.MarketPlace;

public interface MarketPlaceRepository extends JpaRepository<MarketPlace,String> {

}
