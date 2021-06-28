package com.juliogarcia.bookstoremanager.book.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.juliogarcia.bookstoremanager.book.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long> {
}
