package com.cloud.codeservice.controller;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cloud.codeservice.model.Code;
import com.cloud.codeservice.model.CodeId;
import com.cloud.codeservice.repository.CodeRepository;

@RestController
@RequestMapping("/api/code/")
public class CodeController {
	
	@Autowired
	private CodeRepository repo;
	
	Logger logger = LoggerFactory.getLogger(getClass());
	
	@GetMapping
	public ResponseEntity<?> viewAll(){
		return ResponseEntity.ok().body(repo.findAll());
	}
	@PostMapping
	public ResponseEntity<?> newCode(@RequestBody Code code){
		logger.info("code : "+code);
		Optional<Code> exists = repo.findById(code.getId());
		logger.info("exists : "+exists);
		
		if(!exists.isPresent()) {
			try {
				repo.save(code);
				return new ResponseEntity<>(code, HttpStatus.OK);
			}catch(Exception e) {
				return new ResponseEntity<>(e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
			}
		}else {
			return new ResponseEntity<>("data is exists ", HttpStatus.CONFLICT); 
		}
		
	}
	
	@GetMapping("{type}")
	public ResponseEntity<?> findByType(@PathVariable("type") String type){
		return ResponseEntity.ok().body(repo.findByIdCodeType(type));
		
	}
	
	@GetMapping("by-type-&-key")
	public ResponseEntity<?> findByTypeAndKey(@RequestParam("type") String type, @RequestParam("key") String key){
		CodeId id = new CodeId(type,key);
		Optional<Code> data = repo.findById(id);
		if(data.isPresent()) {
			return ResponseEntity.ok().body(data.get());
		}
		return new ResponseEntity<>("Data not found!", HttpStatus.NOT_FOUND);
	}
	

}
