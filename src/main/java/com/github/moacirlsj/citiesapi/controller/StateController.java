package com.github.moacirlsj.citiesapi.controller;

import com.github.moacirlsj.citiesapi.entity.State;
import com.github.moacirlsj.citiesapi.repository.StateRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("api/v1/state")
public class StateController {

    private final StateRepository stateRepository;

    public StateController(StateRepository stateRepository) {
        this.stateRepository = stateRepository;
    }


    @GetMapping
    public Page<State> getAllState(final Pageable page) {
        return stateRepository.findAll(page);
    }

    @GetMapping("/{id}")
    public ResponseEntity getStateById(@PathVariable Long id) {
        Optional<State> optionalState = stateRepository.findById(id);
        if (optionalState.isPresent()) {
            return ResponseEntity.ok().body(optionalState.get());
        }else {
            return ResponseEntity.notFound().build();
        }
    }


}
