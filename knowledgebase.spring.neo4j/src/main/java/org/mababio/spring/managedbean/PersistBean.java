package org.mababio.spring.managedbean;

import javax.annotation.ManagedBean;
import javax.annotation.PostConstruct;

import org.mababio.spring.domain.Problem;
import org.mababio.spring.domain.Solution;
import org.mababio.spring.repo.ProblemRepository;
import org.mababio.spring.repo.SolutionRepository;
import org.springframework.beans.factory.annotation.Autowired;


@ManagedBean(value="persist")
public class PersistBean {

@Autowired
ProblemRepository problemRepository;
@Autowired
SolutionRepository solutionRepository;
Problem problem = new Problem();
Solution solution = new Solution();

/*
@PostConstruct
public void setup(){
}*/


public Problem getProblem() {
	return problem;
}

public void setProblem(Problem problem) {
	this.problem = problem;
}

public Solution getSolution() {
	return solution;
}

public void setSolution(Solution solution) {
	this.solution = solution;
}

public void work(){
	problemRepository.save(problem);
	solutionRepository.save(solution);
}


	
	
	
}
