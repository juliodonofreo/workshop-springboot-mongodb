package com.juliodonofreo.workshopmongo.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.juliodonofreo.workshopmongo.domain.Post;

public interface PostRepository extends MongoRepository<Post, String>{
}
