package com.harrisonbrock.ordersmysql.controllers;

import com.harrisonbrock.ordersmysql.domain.Agent;
import com.harrisonbrock.ordersmysql.repositories.AgnetRepository;
import com.harrisonbrock.ordersmysql.services.AgentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/agents")
public class AgentController {

    private final AgentService agentService;

    public AgentController(AgentService agentService) {
        this.agentService = agentService;
    }

    @PostMapping("")
    public ResponseEntity<?> createNewAgent(@RequestBody Agent agent) {
        Agent newAgent = agentService.saveOrUpdateAgent(agent);
        return new ResponseEntity<>(newAgent, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<?>  getAllAgents() {
        List<Agent> agents = agentService.finddAllAgents();
        return new ResponseEntity<>(agents, HttpStatus.OK);
    }

}
