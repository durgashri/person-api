package com.example.person.controller;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.person.model.Person;
import com.example.person.service.PersonService;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@RestController
@RequestMapping("/personAPI")
@Transactional
@EnableSwagger2
public class PersonController {
	@Autowired
	PersonService personService;
	
	@GetMapping("/getAllPersons")
	public List<Person> getAllPersons(){
		return personService.getAllPersons();
	}
	
	@GetMapping("/getPersonById")
	public Person getPerson(int id){
		return personService.getPerson(id);
	}
	
	@PostMapping("/insertPerson")
	public Person insertPerson(@RequestBody Person person){
		return personService.insertPerson(person);
	}
	
	//@RequestMapping(value="/updatePerson",method=RequestMethod.PUT)
	@PutMapping("/updatePerson")
	public Person updatePerson(@RequestBody Person person){
		return personService.updatePerson(person);
	}
	
	@DeleteMapping("/deletePersonById")
	public String deletePerson(int id){
		return personService.deletePerson(id);
	}
	
	@DeleteMapping("/deleteAllPersons")
	public String deleteAllPersons(){
		return personService.deleteAllPersons();
	}
}
