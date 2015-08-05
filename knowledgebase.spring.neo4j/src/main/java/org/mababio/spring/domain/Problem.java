package org.mababio.spring.domain;

import java.util.HashSet;
import java.util.Set;


import org.springframework.data.neo4j.annotation.NodeEntity;
import org.springframework.data.neo4j.annotation.RelatedTo;
import org.mababio.spring.inter.Node;

@NodeEntity
final public class Problem extends Node  {

	
	public  Problem() {
		// TODO Auto-generated constructor stub
	}

@RelatedTo(type="Sloved_By")
private Set<Solution> solutions = new HashSet<Solution>();

@RelatedTo(type="Associated_To")
private Set<Tag> tags = new HashSet<Tag>();


public  Set<Tag> getTags() {
	return tags;
}

public Set<Solution> getSolution() {
	return solutions;
}


@Override
public Problem consume(Node load) {
	
	if(!load.getContent().isEmpty()){
		if(load instanceof Tag ){
			this.tags.add((Tag)load);
		}else if (load instanceof Solution) {
			this.solutions.add((Solution)load);
		}
	}
	
	
	return this;
}


@Override
public Problem consume(Set< ? extends Node> load) {
	load.stream().forEach(tag -> consume(tag));
	
	return this;
	}
	



	
	
}
