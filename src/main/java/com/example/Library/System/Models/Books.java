package com.example.Library.System.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Books {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    Long id;
    String title;
    String category;

}
