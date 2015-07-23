package org.mababio.spring.repo;

import org.mababio.spring.domain.Tag;
import org.springframework.data.neo4j.repository.GraphRepository;

public interface TagRepository extends GraphRepository<Tag> {

}
