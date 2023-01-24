package com.tweetroo.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.tweetroo.api.dto.UserDTO;
import com.tweetroo.api.service.UserService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/sign-up")
public class Users {

    @Autowired
    private UserService service;

    @PostMapping
    @ResponseStatus(code = HttpStatus.OK)
    public void create(@RequestBody @Valid UserDTO req){
        service.save(req);
    }
}
