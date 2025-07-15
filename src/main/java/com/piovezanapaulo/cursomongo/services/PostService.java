package com.piovezanapaulo.cursomongo.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.piovezanapaulo.cursomongo.domain.Post;
import com.piovezanapaulo.cursomongo.repository.PostRepository;
import com.piovezanapaulo.cursomongo.services.exception.ObjectNotFoundException;

@Service
public class PostService {

	@Autowired
	private PostRepository repo;

	public Post findById(String id) {
		Optional<Post> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
	}

}
