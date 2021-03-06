package be.bt.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import be.bt.entities.Person;
import be.bt.repository.PersonRepository;

@Service
public class PersonServiceImp implements IPersonService {
	
	
	@Autowired
	IUserService userService;

	@Autowired
	PersonRepository personRepository;
	@Override
	public List<Person> findPersonByZipCode(String zipCode) {
		
		
		return personRepository.findByZipCode(zipCode);
		
		
	}
	
	public Person save(Person p ){
		return personRepository.save(p);
		
	}

	@Override
	public Person findByUser(String username) {
		
		
		
		return personRepository.findByUser(userService.findByUsername(username));
	}

	@Override
	public Person savePerson(Person p) {
		
		return personRepository.save(p);
	}

}
  