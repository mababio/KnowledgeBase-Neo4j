package org.mababio.spring.domain;


import java.util.Set;

import org.mababio.spring.inter.Node;
import org.springframework.data.neo4j.annotation.NodeEntity;
import org.springframework.data.neo4j.annotation.RelatedTo;


@NodeEntity
final public class Solution extends Node {
	
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

}
