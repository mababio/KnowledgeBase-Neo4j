package org.mababio.spring.managedbean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.ManagedBean;
import javax.faces.bean.RequestScoped;

import org.mababio.spring.domain.Problem;
import org.mababio.spring.domain.Solution;
import org.mababio.spring.repo.ProblemRepository;
import org.mababio.spring.repo.SolutionRepository;
import org.springframework.beans.factory.annotation.Autowired;


@ManagedBean(value="persist")
@RequestScoped
public class PersistBean {

@Autowired
private ProblemRepository problemRepository;
@Autowired
private SolutionRepository solutionRepository;


private List<Problem>problemList = new ArrayList<Problem>();

private Problem problem;


public Problem getProblem() {
	this.problem =  new Problem();
	return problem;
}

public void setProblem(Problem problem) {
	this.problem = problem;
}


public void addProblem(){
	problemList.add(this.problem);
}

public void persist(){
	problemList.stream().forEach(s -> problemRepository.save(s));
}







	
	
	
}
