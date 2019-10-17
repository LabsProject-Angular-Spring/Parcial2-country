package co.edu.unilibre.country.service;

import java.util.List;

import co.edu.unilibre.country.entity.Country;

public interface ICountryService {
	public List<Country> getAllList();
	public Country getById(Long id);
}
