package com.andrealef.w2mongo.api.services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.andrealef.w2mongo.api.W2;
import com.andrealef.w2mongo.api.repository.W2Repository;

import java.util.List;

@Service
public class W2Services {

	@Autowired
	   private W2Repository pr;
	   
	   public List<W2>findAll(){
		   return pr.findAll();
	   }
}

