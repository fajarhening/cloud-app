package com.cloud.codeservice.model;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="code_mst")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Code {
	@EmbeddedId
	private CodeId id;
	private String codeDesc;
	private Integer seq;
	public Code(CodeId id) {
		super();
		this.id = id;
	}
	
}
