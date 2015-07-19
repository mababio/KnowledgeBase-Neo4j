package org.mababio.spring.repo;

import org.mababio.spring.domain.Solution;
import org.springframework.data.neo4j.repository.GraphRepository;


//@Repository
public interface SolutionRepository extends GraphRepository<Solution> {

}
