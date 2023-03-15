package com.cloud.codeservice.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cloud.codeservice.model.Code;
import com.cloud.codeservice.model.CodeId;

@Repository
public interface CodeRepository extends JpaRepository<Code,CodeId>{

	List<Code> findByIdCodeType (String codeType);
	
	Optional<Code> findById(CodeId id);
	
	
}
