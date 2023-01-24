package com.tweetroo.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.tweetroo.api.dto.TweetDTO;
import com.tweetroo.api.models.tweetModel;
import com.tweetroo.api.repository.tweetRepository;

@Service
public class TweetService {
    @Autowired
    private tweetRepository repository;

    public Page<tweetModel> findAll(String pageable){
        int page = Integer.parseInt(pageable);

        Pageable pages = PageRequest.of(page, 5, Sort.by("id").descending());
        return repository.findAll(pages);
    }

    public void save( TweetDTO req){
        repository.save(new tweetModel(req));
    }

    public List<tweetModel> findByUsername(String username) {
        return repository.findByUsername(username);
    }
}
