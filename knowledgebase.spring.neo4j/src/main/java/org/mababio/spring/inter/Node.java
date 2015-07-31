package org.mababio.spring.inter;

import java.util.Date;
import java.util.Set;


import org.springframework.data.neo4j.annotation.GraphId;

public abstract class Node {
	
	@GraphId
	private Long id;
	
	
	private Date date;
	
	
	private String content;
	
	
	
	public Node(){
		this.setDate(new Date());
	}
	
	
	public Long getId() {
		return id;
	}
	public Node setId(Long id) {
		this.id = id;
		return this;
	}
	public Date getDate() {
		return date;
	}
	public Node setDate(Date date) {
		this.date = date;
		return this;
	}
	public String getContent() {
		return content;
	}
	public Node setContent(String cotent) {
		this.content = cotent;
		return this;
	}
	
	
	/* the comsume method helps vacillate the creation of relationship between nodes */
	abstract public Node  consume(Node load);	
	abstract public Node  consume(Set<? extends Node> load);

}
