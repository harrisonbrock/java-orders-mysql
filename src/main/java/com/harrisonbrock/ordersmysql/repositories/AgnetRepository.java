package com.harrisonbrock.ordersmysql.repositories;

import com.harrisonbrock.ordersmysql.domain.Agent;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AgnetRepository extends JpaRepository<Agent, Long> {

}
