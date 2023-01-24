package com.tweetroo.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tweetroo.api.models.tweetModel;

public interface tweetRepository extends JpaRepository<tweetModel, Long> {
    
}
