package com.example.mybatis_example.service;

public class NoSuchUserException extends RuntimeException {
    public NoSuchUserException(Long id) {
        super(String.format("No user with id: %s", id));
    }
}
