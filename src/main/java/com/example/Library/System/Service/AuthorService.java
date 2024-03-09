package com.example.Library.System.Service;

import ch.qos.logback.classic.util.CopyOnInheritThreadLocal;
import com.example.Library.System.Models.Author;
import com.example.Library.System.Repository.AuthorRepo;
import com.example.Library.System.Repository.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class AuthorService {
    @Autowired
    private AuthorRepo authorRepo;
    @Autowired
    private BookRepo bookRepo;

    public void getAllAuthors(){
        authorRepo.findAll();
    }

    public void getAuthorByID(Long id){
       authorRepo.findById(id);
    }

    public void createAuthor(Author createdAuthor){
    }

    public void updateAuthor(Author author,Long id){
        Optional<Author> authorOptional = authorRepo.findAuthorById(id);
        if (authorOptional.isPresent()) {
            Author author1 = authorOptional.get();

        }else{
            throw new RuntimeException("No Author Found");
        }
    }

}
