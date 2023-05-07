package com.juliodonofreo.workshopmongo.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.juliodonofreo.workshopmongo.domain.Post;

public interface PostRepository extends MongoRepository<Post, String>{

	
	List<Post> findByTitleContainingIgnoreCase(String text);
}
