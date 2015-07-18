package org.mababio.spring.app.config;

import org.neo4j.graphdb.GraphDatabaseService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.neo4j.config.EnableNeo4jRepositories;
import org.springframework.data.neo4j.config.Neo4jConfiguration;
import org.springframework.data.neo4j.rest.SpringRestGraphDatabase;

@Configuration
@EnableNeo4jRepositories(basePackages="org.mababio.spring.repo")
public class AppConfig extends Neo4jConfiguration {

	public AppConfig() {


		setBasePackage("org.mababio.spring.domain");
	}
	
	

	    @Bean
	    public GraphDatabaseService graphDatabaseService() {
	        return new SpringRestGraphDatabase("http://localhost:7474/db/data/");
	    }
	


}