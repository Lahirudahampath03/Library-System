package com.example.Library.System.Repository;

import com.example.Library.System.Models.Author;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AuthorRepo extends JpaRepository<Author,Long> {

    Optional<Author>findAuthorById(Long id);
}
