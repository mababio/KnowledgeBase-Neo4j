package org.mababio.spring.repo;


import org.mababio.spring.domain.Problem;
import org.springframework.data.neo4j.repository.GraphRepository;


//@Repository
public interface ProblemRepository extends GraphRepository<Problem> {

}
