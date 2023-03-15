package com.cloud.salesservice.model;

import java.math.BigDecimal;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Table(name="market_place_mst")
@Data
@AllArgsConstructor
public class MarketPlace {
	
	@Id
	private String marketCode;
	private String marketName;
	private String marketLocation;
	private String marketCountry;
	private String marketType;
	private BigDecimal fee;
	private BigDecimal extra_fee;

}
