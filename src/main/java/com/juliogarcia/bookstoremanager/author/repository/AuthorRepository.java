package com.juliogarcia.bookstoremanager.author.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.juliogarcia.bookstoremanager.author.entity.Author;

public interface AuthorRepository extends JpaRepository<Author, Long> {
}
