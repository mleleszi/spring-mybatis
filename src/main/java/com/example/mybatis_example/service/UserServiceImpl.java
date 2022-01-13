package com.example.mybatis_example.service;

import com.example.mybatis_example.model.User;
import com.example.mybatis_example.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User getUserById(Long id) {
        Optional<User> optionalUser = userRepository.findById(id);
        if(optionalUser.isEmpty())
            throw new NoSuchUserException(id);
        return optionalUser.get();
    }

    @Override
    public void save(User user) {
        userRepository.insert(user);
    }


    @Override
    public void delete(Long id) {
        Optional<User> optionalUser = userRepository.findById(id);
        if(optionalUser.isEmpty())
            throw new NoSuchUserException(id);
        userRepository.delete(id);
    }

    @Override
    public void update(User user) {
        Optional<User> optionalUser = userRepository.findById(user.getId());
        if(optionalUser.isEmpty())
            throw new NoSuchUserException(user.getId());
        userRepository.update(user);
    }


}
