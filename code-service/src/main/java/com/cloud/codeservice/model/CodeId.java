package com.cloud.codeservice.model;

import java.io.Serializable;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CodeId implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String codeType;
	private String codeKey;
	
}
