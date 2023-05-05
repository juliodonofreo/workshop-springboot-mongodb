package com.juliodonofreo.workshopmongo.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.juliodonofreo.workshopmongo.domain.User;

public interface UserRepository extends MongoRepository<User, String>{

}
