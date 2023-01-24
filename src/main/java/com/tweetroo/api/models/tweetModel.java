package com.tweetroo.api.models;

import com.tweetroo.api.dto.TweetDTO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
public class tweetModel {
    
    public tweetModel( TweetDTO data ){
        this.username = data.username();
        this.tweet = data.tweet();
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(length = 20, nullable = false)
    private String username;

    @Column(length = 200, nullable = false)
    private String tweet;
    
}
