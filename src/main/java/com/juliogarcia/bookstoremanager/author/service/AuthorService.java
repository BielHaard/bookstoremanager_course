package com.juliogarcia.bookstoremanager.author.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.juliogarcia.bookstoremanager.author.mapper.AuthorMapper;
import com.juliogarcia.bookstoremanager.author.repository.AuthorRepository;

@Service
public class AuthorService {

	private final static AuthorMapper autoMapper = AuthorMapper.INSTANCE;

	private AuthorRepository  authorRepository;

	@Autowired
	public AuthorService(AuthorRepository authorRepository) {
		this.authorRepository = authorRepository;
	}


}
