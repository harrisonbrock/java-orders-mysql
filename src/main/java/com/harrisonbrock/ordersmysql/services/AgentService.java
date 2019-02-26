package com.harrisonbrock.ordersmysql.services;

import com.harrisonbrock.ordersmysql.domain.Agent;
import com.harrisonbrock.ordersmysql.exceptions.AgentIdExeption;
import com.harrisonbrock.ordersmysql.repositories.AgnetRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AgentService {

    private final AgnetRepository repository;

    public AgentService(AgnetRepository repository) {
        this.repository = repository;
    }

    public Agent saveAgent(Agent agent) {
        return repository.save(agent);
    }

    public List<Agent> getAllAgents() {
        return repository.findAll();
    }

    public Agent findAgentById(long id) {
        Optional<Agent> agent = repository.findById(id);

        if (agent.isEmpty()) {
            throw new AgentIdExeption("Agent Id '" + id + "' does not exist");
        }
        else {

            return agent.get();
        }
    }

    public Agent updateAgentById(long id, Agent updatedAgent) {
        Optional<Agent> agent = repository.findById(id);

        if (agent.isEmpty()) {
            throw new AgentIdExeption("Cannot Update Agent Id '" + id + "' because it does not exist");
        }
        else  {
            updatedAgent.setAgentcode(id);
            repository.save(updatedAgent);
            System.out.println(updatedAgent);
            return updatedAgent;
        }
    }

    public Agent deleteAgentById(long id) {
        Optional<Agent> agent = repository.findById(id);

        if (agent.isEmpty()) {
            throw new AgentIdExeption("Cannot Delete Agent Id '" + id + "' because it does not exist");
        }
        else {
            repository.deleteById(id);
            return agent.get();
        }
    }
}
