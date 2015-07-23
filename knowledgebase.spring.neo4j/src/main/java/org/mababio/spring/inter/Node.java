package org.mababio.spring.inter;

import java.util.Date;

import javax.validation.constraints.NotNull;

import org.springframework.data.neo4j.annotation.GraphId;

public abstract class Node {
	
	@GraphId
	private Long id;
	
	@NotNull
	private Date date;
	
	@NotNull
	private String content;
	
	
	
	public Node(){
		this.setDate(new Date());
	}
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String cotent) {
		this.content = cotent;
	}
	
	

}
