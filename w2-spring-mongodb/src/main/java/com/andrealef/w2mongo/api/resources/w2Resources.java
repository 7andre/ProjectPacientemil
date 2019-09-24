package com.andrealef.w2mongo.api.resources;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.andrealef.w2mongo.api.W2;
import com.andrealef.w2mongo.api.repository.W2Repository;

@RestController
@RequestMapping(value="/W2")

public class w2Resources {
	@Autowired
	private W2Repository repository;
	
	@GetMapping("/findAll w2")
	public List<W2>getW2(){
		return repository.findAll(); 
	}
	@GetMapping("/findAll w2/{id}")
	public List<W2> getw2(@PathVariable String id){
		return repository.findAll(); 
	}
	
	@PostMapping("/add w2")
	public String savePacientemil(@RequestBody W2 w2) {
		repository.save(w2);
		return "Add paciente:"+w2.getId();
	}
	
	@DeleteMapping("/delete/{id}")
	public String deletePacientemil(@PathVariable String id){
	    repository.deleteById(id);
	    return "Paciente deleted"+id;
	}
	
	@PutMapping("/update Pacientemil")
	public void updatePacientemil(@RequestBody W2 w2) {
		repository.save(w2);
		
	}
}
