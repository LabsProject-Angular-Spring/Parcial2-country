package co.edu.unilibre.country.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.unilibre.country.entity.Country;
import co.edu.unilibre.country.repository.ICountryRepository;
import co.edu.unilibre.country.service.ICountryService;

@Service
public class CountryService implements ICountryService{

	@Autowired
	private ICountryRepository countryRepository;
	
	@Override
	public List<Country> getAllList() {
		return countryRepository.findAll();
	}

	@Override
	public Country getById(Long id) {
		return countryRepository.findById(id).get();
	}
	
}
