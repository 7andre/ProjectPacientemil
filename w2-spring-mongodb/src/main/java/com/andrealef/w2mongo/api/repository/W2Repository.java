package com.andrealef.w2mongo.api.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.andrealef.w2mongo.api.W2;

@Repository
public interface W2Repository extends MongoRepository<W2,String>{

}
