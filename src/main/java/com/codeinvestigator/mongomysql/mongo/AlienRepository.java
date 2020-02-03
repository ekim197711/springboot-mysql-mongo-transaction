package com.codeinvestigator.mongomysql.mongo;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface AlienRepository extends MongoRepository<Alien, String> {
}
