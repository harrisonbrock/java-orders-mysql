package com.harrisonbrock.ordersmysql.repositories;

import com.harrisonbrock.ordersmysql.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
