package com.piovezanapaulo.cursomongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.piovezanapaulo.cursomongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{

}
