package com.juliogarcia.bookstoremanager.users.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.juliogarcia.bookstoremanager.users.entity.User;

public interface UsersRepository extends JpaRepository<User, Long> {
}
