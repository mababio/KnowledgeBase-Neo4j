package org.mababio.spring.spring.boot.test.traditional;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.IntStream;

import javax.validation.constraints.Size;

import org.mababio.spring.domain.Problem;
import org.mababio.spring.domain.Solution;

public class Tester {
	
	
	@Size(min=0,max=0)
	private String  args;// List<String> list= new ArrayList<String>();
	public static  void main(String[] args){
	
	
	Problem problem = new Problem();
	
	problem.setContent("home");
	
	System.out.println(problem.getContent());
		
		
	}
}
