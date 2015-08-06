package org.mababio.spring.inter;

import java.util.Set;

/*
 * Contains methods that must be implemented by sub Nodes
 * populates Node collection fields with Node instance 
 * */
public interface NodeBuilder {
	/* the comsume method helps vacillate the creation of relationship between nodes */
	abstract public Node  consume(Node load);	
	abstract public Node  consume(Set<? extends Node> load);
}
