package be.bt.services;

import java.util.List;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import be.bt.entities.Announce;
import be.bt.repository.AnnounceRepository;

@Service
public class AnnouceServiceImp implements IAnnounceService {
	
	@Autowired
	AnnounceRepository announceRepository;

	@Override
	public List<Announce> findAllAnnouces() {
		
		return announceRepository.findAll();
	}

	@Override
	public Announce findAnnouceById(String id) {
	
		return announceRepository.findOne(id);
	}

	@Override
	public List<Announce> findAnnounceByCategory(String category) {
		
		return announceRepository.findAnnounceByCategory(category);
	}

	@Override
	public List<Announce> findAnnounceByPerson(int PersonId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Announce> findAnnoucesByZipCode(String zipCode) {
		
		return announceRepository.findAnnoucesByZipCode(zipCode);
	}

	@Override
	public List<Announce> findAnnoucesByZipCodeAndCategory(String zipCode, String catName) {
		
		return announceRepository.findAnnoucesByZipCodeAndCategory(zipCode, catName);
	}
	
	

}