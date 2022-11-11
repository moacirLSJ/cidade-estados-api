package com.github.moacirlsj.citiesapi.controller;

import com.github.moacirlsj.citiesapi.entity.City;
import com.github.moacirlsj.citiesapi.repository.CityRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/city")
public class CityController {
    private final CityRepository cityRepository;

    public CityController(CityRepository cityRepository) {
        this.cityRepository = cityRepository;
    }

    @GetMapping("/{id}")
    public City getCityById(@PathVariable Long id) throws Exception {
        return cityRepository.findById(id).orElseThrow(() -> new Exception("city not found"));
    }

    @GetMapping
    public Page<City> getAll(final Pageable page) {

        return cityRepository.findAll(page);
    }


}
