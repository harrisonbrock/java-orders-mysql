package com.harrisonbrock.ordersmysql.services;

import com.harrisonbrock.ordersmysql.domain.Agent;
import com.harrisonbrock.ordersmysql.repositories.AgnetRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AgentService {

    private final AgnetRepository repository;

    public AgentService(AgnetRepository repository) {
        this.repository = repository;
    }

    public Agent saveOrUpdateAgent(Agent agent) {
        return repository.save(agent);
    }

    public List<Agent> finddAllAgents() {
        return repository.findAll();
    }
}
