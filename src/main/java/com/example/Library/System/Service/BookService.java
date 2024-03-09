package com.example.Library.System.Service;

import com.example.Library.System.Repository.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    @Autowired
    BookRepo bookRepo;

}
