package com.harrisonbrock.ordersmysql.controllers;

import com.harrisonbrock.ordersmysql.domain.Agent;
import com.harrisonbrock.ordersmysql.repositories.AgnetRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/agents")
public class AgentController {

    private final AgnetRepository repository;

    public AgentController(AgnetRepository repository) {
        this.repository = repository;
    }

    @PostMapping("")
    public ResponseEntity<?> createNewAgent(@RequestBody Agent agent) {
        Agent newAgent = repository.save(agent);
        return new ResponseEntity<>(newAgent, HttpStatus.CREATED);
    }
}
