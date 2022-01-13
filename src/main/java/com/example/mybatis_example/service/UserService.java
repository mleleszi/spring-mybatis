package com.example.mybatis_example.service;

import com.example.mybatis_example.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();
    User getUserById(Long id);
    void save(User user);
    void delete(Long id);
    void update(User user);
}
