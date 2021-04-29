package com.juliogarcia.bookstoremanager.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/books")
class BookController {

    @GetMapping
    public String hello() {
        return "Hello Bookstore Manager";
    }
}