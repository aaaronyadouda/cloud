package com.ijilad.spring_cloud.employee.exception;

public class EntityNotFound extends RuntimeException {
    
    public EntityNotFound(String message) {
        super(message);
    }
}
