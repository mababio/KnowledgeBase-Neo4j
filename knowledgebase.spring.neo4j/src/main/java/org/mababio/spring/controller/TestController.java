package org.mababio.spring.controller;

import org.mababio.spring.domain.Person;
import org.mababio.spring.repo.PersonRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@Configuration
@RestController
public class TestController {
	
	
	
	@Autowired
	PersonRepo personRepo;
	
	@RequestMapping(value="/me", produces={"application/json"} )
	public String foo(@RequestParam(value="name") String name){
		
		Person person = new Person();
		
		person.setLastName(name);
		
		personRepo.save(person);
		return "hom";
		
	}

}
