package com.devsuperior.dsmovie.services;

import com.devsuperior.dsmovie.entities.User;
import com.devsuperior.dsmovie.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    @Transactional
    public User findOrCreateByEmail(String email) {
        return repository.findByEmail(email)
                .orElse(repository.saveAndFlush(new User(email)));
    }
}
