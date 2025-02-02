package com.ijilad.spring_cloud.departement.exception;

public class EntityNotFound extends RuntimeException {
    
    public EntityNotFound(String message) {
        super(message);
    }
}
