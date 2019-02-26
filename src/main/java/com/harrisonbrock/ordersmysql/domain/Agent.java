package com.harrisonbrock.ordersmysql.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import java.util.Set;

@Data
@Entity
@Table(name="agents")
public class Agent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private long agentcode;

    @OneToMany(cascade = CascadeType.DETACH, mappedBy = "agent")
    @JsonIgnore
    private Set<Customer> customers;

    @OneToMany( cascade = CascadeType.DETACH, mappedBy = "agent")
    @JsonIgnore
    private Set<Order> orders;

    @NotBlank
    private String agentname;

    private String workingarea;

    private double commission;

    private String phone;

    private String country;

    public Agent()
    {
    }
}