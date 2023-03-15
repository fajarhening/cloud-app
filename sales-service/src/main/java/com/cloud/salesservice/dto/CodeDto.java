package com.cloud.salesservice.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CodeDto implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String codeType;
	private String codeKey;
	private String codeDesc;
	private Integer seq;
	
}
