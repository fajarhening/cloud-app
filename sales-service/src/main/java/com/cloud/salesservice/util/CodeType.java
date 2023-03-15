package com.cloud.salesservice.util;

public enum  CodeType {

	
	ORDER_TYPE("ORTY"),
	
	COURIER_TYPE("CTY"),
	
	MARKET_TYPE("MTY"),
	;
	
	String type;
	
	private CodeType(String type) {
		this.type = type;
	}
	
	public String getType() {
		return type;
	}
	
}
