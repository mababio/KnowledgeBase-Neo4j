package org.mababio.spring.domain;

import java.util.Set;

import org.springframework.data.neo4j.annotation.NodeEntity;
import org.springframework.data.neo4j.annotation.RelatedTo;
import org.mababio.spring.inter.Node;

@NodeEntity
final public class Problem extends Node  {

@RelatedTo(type="Sloved_By")
Set<Solution> solutions;

@RelatedTo(type="Associated_To")
private Set<Tag> tags;

public Set<Tag> getTags() {
	return tags;
}

public void addTags(Tag tag) {
	this.tags.add(tag);
}
public void setTags(Set<Tag> tags){
	this.tags = tags;
}

public Set<Solution> getSolution() {
	return solutions;
}

public void addSolution(Solution solution) {
	this.solutions.add(solution);
}

public void setSolution(Set<Solution> solutions){
	this.solutions =solutions;
}


	
	
}
