package com.github.moacirlsj.citiesapi.controller;

import com.github.moacirlsj.citiesapi.entity.State;
import com.github.moacirlsj.citiesapi.repository.StateRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/state")
public class StateController {

    private StateRepository stateRepository;


    @GetMapping
    public Page<State> getAllState(final Pageable page) {
        return stateRepository.findAll(page);
    }


}
