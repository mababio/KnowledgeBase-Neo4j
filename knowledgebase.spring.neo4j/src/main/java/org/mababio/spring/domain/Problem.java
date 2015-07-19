package org.mababio.spring.domain;


import java.util.Set;

import org.springframework.data.neo4j.annotation.NodeEntity;
import org.springframework.data.neo4j.annotation.RelatedTo;
import org.mababio.spring.inter.Node;



@NodeEntity
final public class Problem extends Node  {

@RelatedTo(type="Sloved_By")
Set<Solution>solution;

public Set<Solution> getSoluiton() {
	return solution;
}

public void addSoluiton(Solution solution) {
	this.solution.add(solution);
}


	
	
}
