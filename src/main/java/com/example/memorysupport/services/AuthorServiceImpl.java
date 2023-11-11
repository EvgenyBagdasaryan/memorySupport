package com.example.memorysupport.services;

import com.example.memorysupport.domain.Author;
import com.example.memorysupport.repositories.AuthorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class AuthorServiceImpl implements AuthorService {

    private final AuthorRepository authorRepo;

    @Transactional
    @Override
    public void saveAuthor(Author author)
    {
        authorRepo.save(author);
    };

    @Transactional
    @Override
    public String readTable(){

        String resAuthor = "";
        for(Author item : authorRepo.findAll())
            resAuthor += item.getId() + " " + item.getName() + " \n ";

        return resAuthor;
    };

    @Transactional
    @Override
    public void deleteById(long id){
        authorRepo.deleteById(id);
    };
}
