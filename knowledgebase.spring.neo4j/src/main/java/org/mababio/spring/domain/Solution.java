package org.mababio.spring.domain;


import java.util.HashSet;
import java.util.Set;

import org.mababio.spring.inter.Node;
import org.springframework.data.neo4j.annotation.NodeEntity;
import org.springframework.data.neo4j.annotation.RelatedTo;


@NodeEntity
final public class Solution extends Node {
	
	
	private static final long serialVersionUID = 1L;
	
	@RelatedTo(type="Associated_To")
	private Set<Tag> tags = new HashSet<Tag>();

	public Set<Tag> getTags() {
		return tags;
	}

	
	/* Does not consume if the content of node is empty*/
	@Override
	public Solution consume(Node load) {
	
		if(!load.getContent().isEmpty()){
			if(load instanceof Tag){
				this.tags.add((Tag)load);
			}
		}
	return this;
	}

	@Override
	public Solution consume(Set< ? extends Node> load) {
		load.stream().forEach(tag -> consume(tag));
	return this;
	}



}
