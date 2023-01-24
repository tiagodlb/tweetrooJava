package com.tweetroo.api.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.tweetroo.api.models.tweetModel;

public interface tweetRepository extends JpaRepository<tweetModel, Long> {
    public List<tweetModel> findByUsername(String username);
    Page<tweetModel> findAll(Pageable pageable);
}
