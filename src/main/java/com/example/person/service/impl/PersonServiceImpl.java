package com.example.person.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.person.dao.PersonRepo;
import com.example.person.model.Person;
import com.example.person.service.PersonService;

@Service
public class PersonServiceImpl implements PersonService{

	@Autowired
	PersonRepo personRepo;
	
	@Override
	public List<Person> getAllPersons() {
		return personRepo.findAll();
	}

	@Override
	public Person getPerson(int id) {
		return personRepo.findById(id);
	}

	@Override
	public String deletePerson(int id) {
		personRepo.deleteById(id);
		return "Person with id: "+id+" deleted.";
	}

	@Override
	public String deleteAllPersons() {
		personRepo.deleteAll();
		return "All Persons deleted.";
	}

	@Override
	public Person insertPerson(Person p) {
		return personRepo.save(p);
	}

	@Override
	public Person updatePerson(Person person) {
		return personRepo.save(person);
	}

}
