package com.harrisonbrock.ordersmysql.exceptions;

public class AgentIdExceptionResponse {
    private String agnetId;

    public AgentIdExceptionResponse(String agnetId) {
        this.agnetId = agnetId;
    }

    public String getAgnetId() {
        return agnetId;
    }

    public void setAgnetId(String agnetId) {
        this.agnetId = agnetId;
    }
}
