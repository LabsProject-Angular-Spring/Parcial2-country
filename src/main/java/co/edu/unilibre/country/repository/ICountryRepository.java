package co.edu.unilibre.country.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.edu.unilibre.country.entity.Country;

public interface ICountryRepository extends JpaRepository<Country, Long>{

}
