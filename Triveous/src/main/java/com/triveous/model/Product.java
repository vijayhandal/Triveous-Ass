package com.triveous.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Positive;

import lombok.Data;

@Entity
@Data
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id; 

    @NotBlank(message = "Title cannot be blank")
    private String title;

    @Positive(message = "Price must be a positive value")
    private double price;

    @NotBlank(message = "Description cannot be blank")
    private String description;

    private boolean availability;

    @NotBlank(message = "Category ID cannot be blank")
    private String categoryId;

}


