package com.cloud.salesservice.util;

public enum CodeKey  {
	
	ORDER_ONLINE("ORON"),
	ORDER_OFFLINE("OROF"),
	COURIER_TYPE_REGULAR("REG"),
	COURIER_TYPE_EXPRESS("EXP"),
	COURIER_TYPE_ECONOMY("ECO"),
	COURIER_TYPE_SAME_DAY("SDD"),
	COURIER_TYPE_INSTANT("INS"),
	MARKET_TYPE_OFFLINE ("OFM"),
	MARKET_TYPE_ONLINE("OLM")
	
	;
	
	String key;
	
	private CodeKey(String key) {
		this.key = key;
	}
	
	public String getKey() {
		return key;
	}

}
