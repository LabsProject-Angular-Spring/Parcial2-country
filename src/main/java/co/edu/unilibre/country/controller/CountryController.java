package co.edu.unilibre.country.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import co.edu.unilibre.country.entity.Country;
import co.edu.unilibre.country.service.ICountryService;

@RestController
public class CountryController {
	@Value("${server.port}")
	private Long port;
	
	@Autowired
	private ICountryService countryService;
	
	@GetMapping("/list")
	public List<Country> getList(){
		return countryService.getAllList().stream().map(country -> {
			country.setPort(port);
			return country;
		}).collect(Collectors.toList());
	}
	
	@GetMapping("/{id}")
	public Country getById(@PathVariable Long id) {
		Country country = countryService.getById(id);
		country.setPort(port);
		return country;
		
	}
}
