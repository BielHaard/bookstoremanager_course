package com.juliogarcia.bookstoremanager.publishers.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.juliogarcia.bookstoremanager.publishers.entity.Publisher;

public interface PublishersRepository extends JpaRepository<Publisher, Long> {
}
