package com.tweetroo.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.tweetroo.api.dto.TweetDTO;
import com.tweetroo.api.models.tweetModel;
import com.tweetroo.api.service.TweetService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/tweets")
public class Tweets {
    
    @Autowired
    private TweetService service;

    @GetMapping
    @ResponseStatus(code = HttpStatus.OK)
    public Page<tweetModel> listAll(@PageableDefault(page = 0, size = 5) @RequestParam String page){
      return service.findAll(page);
    }

    @GetMapping("/{username}")
    @ResponseStatus(code = HttpStatus.OK)
    public List<tweetModel> findByUsername(@PathVariable String username) {
        return service.findByUsername(username);
    }

    @PostMapping
    @ResponseStatus(code = HttpStatus.OK)
    public void create(@RequestBody @Valid TweetDTO req){
        service.save(req);
    }
}