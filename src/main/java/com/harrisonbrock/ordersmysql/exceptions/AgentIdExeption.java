package com.harrisonbrock.ordersmysql.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class AgentIdExeption extends RuntimeException{

    public AgentIdExeption(String message) {
        super(message);
    }
}
