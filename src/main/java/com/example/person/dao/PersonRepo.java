package com.example.person.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.person.model.Person;

@Repository
public interface PersonRepo extends CrudRepository<Person,Long>{
	public List<Person> findAll();
	public Person findById(int id);
	public void deleteById(int id);
	public void deleteAll();
	public Person save(Person p);
	//public Person (Person p);
}
