package com.andrealef.pacientemilmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.andrealef.pacientemilmongo.domain.Pacientemil;

@Repository
public interface PacientemilRepository extends MongoRepository<Pacientemil,String>{

}
