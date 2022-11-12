package com.github.moacirlsj.citiesapi.repository;

import com.github.moacirlsj.citiesapi.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
