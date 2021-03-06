package org.mababio.spring.inter;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;




import org.springframework.data.neo4j.annotation.GraphId;

public abstract class Node implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	@GraphId
	private Long id;
	
	
	private Date date;
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((content == null) ? 0 : content.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Node other = (Node) obj;
		if (content == null) {
			if (other.content != null)
				return false;
		} else if (!content.equals(other.content))
			return false;
		return true;
	}
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
