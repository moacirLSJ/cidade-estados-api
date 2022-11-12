package com.github.moacirlsj.citiesapi.repository;

import com.github.moacirlsj.citiesapi.entity.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityRepository extends JpaRepository<City, Long> {

}
