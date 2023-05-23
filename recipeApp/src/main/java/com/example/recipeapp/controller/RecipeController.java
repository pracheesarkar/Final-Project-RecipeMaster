package com.example.recipeapp.controller;

import com.example.recipeapp.model.Recipe;
import com.example.recipeapp.service.RecipeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/recipe")
public class RecipeController {
    final RecipeService recipeService;

    public RecipeController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @GetMapping("/getRecipe")
    public Recipe getRecipe(@RequestParam Long id){
        Recipe recipe = recipeService.getRecipe(id);
        return recipe;

    }

    @GetMapping("/getRecipeByCategory")
    public List<Recipe> getRecipeByCategory(@RequestParam String category){
        return recipeService.getRecipeByCategory(category);
    }



    @GetMapping("/getAllRecipes")
    public List<Recipe> getAllRecipes(){
        return recipeService.getAllRecipes();
    }
}
