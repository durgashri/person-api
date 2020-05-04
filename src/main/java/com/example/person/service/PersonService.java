package com.example.person.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.person.model.Person;
@Service
@Transactional
public interface PersonService {
	public List<Person> getAllPersons(); 
	public Person getPerson(int id);
	public String deletePerson(int id);
	public String deleteAllPersons();
	public Person insertPerson(Person person);
	public Person updatePerson(Person person);
}
