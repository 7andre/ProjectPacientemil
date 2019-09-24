package com.andrealef.pacientemilmongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.andrealef.pacientemilmongo.domain.Pacientemil;
import com.andrealef.pacientemilmongo.repository.PacientemilRepository;

public class PacientemilService {
	@Autowired
	   private PacientemilRepository pr;
	   
	   public List<Pacientemil>findAll(){
		   return pr.findAll();
	   }
}
