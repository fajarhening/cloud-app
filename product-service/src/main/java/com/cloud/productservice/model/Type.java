package com.cloud.productservice.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="TYPE_MST")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Type {
	@Id
	private Integer typeId;
	private String typeDesc;

}
