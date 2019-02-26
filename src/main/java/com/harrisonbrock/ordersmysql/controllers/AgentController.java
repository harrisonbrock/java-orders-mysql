package com.harrisonbrock.ordersmysql.controllers;

import com.harrisonbrock.ordersmysql.domain.Agent;
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
        Agent newAgent = agentService.saveAgent(agent);
        return new ResponseEntity<>(newAgent, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<?>  getAllAgents() {
        List<Agent> agents = agentService.getAllAgents();
        return new ResponseEntity<>(agents, HttpStatus.OK);
    }

    @GetMapping("agentcode/{id}")
    public ResponseEntity<?> getAgentById(@PathVariable long id) {

        Agent agent = agentService.findAgentById(id);
        return new ResponseEntity<>(agent, HttpStatus.OK);
    }

    @PutMapping("/agentcode/{id}")
    public ResponseEntity<?> updateAgentById(@PathVariable long id, @RequestBody Agent updateAgent) {
        Agent currentAgent = agentService.updateAgentById(id, updateAgent);
        return new ResponseEntity<>(currentAgent, HttpStatus.OK);
    }

}
