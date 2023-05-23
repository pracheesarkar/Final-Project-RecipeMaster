package com.example.recipeapp.model;

import jakarta.persistence.Entity;
import lombok.Data;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Transient;
import java.util.List;


@Entity
@Data
public class Recipe {


    @Id
    private Long id;

    private String name;

    private String category;
    private String yield;


    @Transient
    private List<Ingredients> ingredientsList;
    @Transient
    private List<Directions> directionsList;


}