package com.piovezanapaulo.cursomongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.piovezanapaulo.cursomongo.domain.User;
import com.piovezanapaulo.cursomongo.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repo;
	
	public List<User> findAll() {
		return repo.findAll();	
	}
}
