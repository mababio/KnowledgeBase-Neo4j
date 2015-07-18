package org.mababio.spring.repo;

import org.mababio.spring.domain.Person;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.neo4j.repository.GraphRepository;
import org.springframework.stereotype.Repository;

//@Repository
public interface PersonRepo extends GraphRepository<Person> {

}
