package com.tweetroo.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tweetroo.api.models.userModel;

public interface userRepository extends JpaRepository<userModel, Long> {
    
}
