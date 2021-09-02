package com.github.MarceloBenevides.citiesapi.countries.repository;

import com.github.MarceloBenevides.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
