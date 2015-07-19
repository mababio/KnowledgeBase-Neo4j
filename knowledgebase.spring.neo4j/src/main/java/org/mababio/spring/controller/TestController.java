/*package org.mababio.spring.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@Configuration
@RestController
public class TestController {
	
	
	
	@Autowired
	//PersonRepo personRepo;
	
	@RequestMapping(value="/me", produces={"application/json"} )
	public String foo(@RequestParam(value="name") String name){
		
		return "hom";
		
	}

}
*/