package com.example.memorysupport.services;


import com.example.memorysupport.domain.Author;

public interface AuthorService {

    void saveAuthor(Author author);
    String readTable();
    void deleteById(long id);
}
