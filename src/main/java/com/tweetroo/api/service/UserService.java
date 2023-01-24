package com.tweetroo.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tweetroo.api.dto.UserDTO;
import com.tweetroo.api.models.userModel;
import com.tweetroo.api.repository.userRepository;

@Service
public class UserService {

    @Autowired
    private userRepository repository;

    public void save( UserDTO req){
        repository.save(new userModel(req));
    }

}
