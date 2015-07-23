package org.mababio.spring.managedbean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import org.mababio.spring.domain.Problem;


@ManagedBean(name="problemBean")
@RequestScoped
public class ProblemBean {
	
	Problem problem;
	
	
	 public ProblemBean() {
		this.problem = new Problem();
	}

	public Problem getProblem() {
		return problem;
	}

	public void setProblem(Problem problem) {
		this.problem = problem;
	}
	

}
