package com.tweetroo.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.tweetroo.api.dto.TweetDTO;
import com.tweetroo.api.models.tweetModel;
import com.tweetroo.api.repository.tweetRepository;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/tweets")
public class Tweets {
    
    @Autowired
    private tweetRepository repository;

    @GetMapping
   public List<tweetModel> listAll(){
      return repository.findAll();
   }

    @GetMapping("/{id}")
    public String GetTweetsByUsername(){
        return "gettweetsbyusername is going to be implemented soon";
    } 

    @PostMapping
    @ResponseStatus(code = HttpStatus.OK)
    public void create(@RequestBody @Valid TweetDTO req){
        repository.save(new tweetModel(req));
    }
}