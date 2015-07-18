package org.mababio.spring.domain;

import java.util.Collection;
import java.util.HashSet;

import org.springframework.data.neo4j.annotation.GraphId;
import org.neo4j.graphdb.Direction;
import org.springframework.data.neo4j.annotation.Labels;
import org.springframework.data.neo4j.annotation.NodeEntity;
import org.springframework.data.neo4j.annotation.RelatedTo;



@NodeEntity()
public class Person {

	@GraphId
	Long id;

	/*@Labels(defaultValue="Person")
	Collection<String> labels;*/
	
	
	String LastName;

	
	
	/*public Collection<String> getLabels() {
        return labels;
    }

    public void setLabels(String label) {
        HashSet<String> newLabels = new HashSet<>(this.labels);
        if (newLabels.add(label)) this.labels = newLabels;
    }*/

	
	/*public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}*/

	/*@RelatedTo(type="GOES_TO", direction= Direction.INCOMING)
	School sch = new School();*/

	/*public School getSch() {
		return sch;
	}


	public void setSch(School sch) {
		this.sch = sch;
	}*/


	@Override
	public String toString() {
		return "Person [id=" + id + /*", firstName=" + firstName +*/ ", LastName="
				+ LastName + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		Person other = (Person) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}


	public String getLastName() {
		return LastName;
	}


	public void setLastName(String lastName) {
		LastName = lastName;
	}


}
