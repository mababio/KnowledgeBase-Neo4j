package org.mababio.spring.inter;

import java.util.Date;

import org.springframework.data.neo4j.annotation.GraphId;

public abstract class Node {
	
	@GraphId
	private Long id;
	private Date date;
	private String content;
	
	
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
