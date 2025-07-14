package com.piovezanapaulo.cursomongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.piovezanapaulo.cursomongo.domain.Post;
import com.piovezanapaulo.cursomongo.domain.User;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {

}
