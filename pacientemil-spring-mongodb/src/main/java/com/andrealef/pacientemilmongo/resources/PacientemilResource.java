package com.andrealef.pacientemilmongo.resources;

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

import com.andrealef.pacientemilmongo.domain.Pacientemil;
import com.andrealef.pacientemilmongo.repository.PacientemilRepository;

@RestController
@RequestMapping(value="/pacientemil")
public class PacientemilResource {

	@Autowired
	private PacientemilRepository repository;
	
	
	@GetMapping("/findAll Pacientemil")
	public List<Pacientemil>getPacientemil(){
		return repository.findAll(); 
	}
	@GetMapping("/findAll Pacientemil/{id}")
	public List<Pacientemil> getPacientemil(@PathVariable String id){
		return repository.findAll(); 
	}
	
	@PostMapping("/add Pacientemil")
	public String savePacientemil(@RequestBody Pacientemil pacientemil) {
		repository.save(pacientemil);
		return "Add paciente:"+pacientemil.getId();
	}
	
	@DeleteMapping("/delete/{id}")
	public String deletePacientemil(@PathVariable String id){
	    repository.deleteById(id);
	    return "Paciente deleted"+id;
	}
	
	@PutMapping("/update Pacientemil")
	public void updatePacientemil(@RequestBody Pacientemil pacientemil) {
		repository.save(pacientemil);
		
	}
}
