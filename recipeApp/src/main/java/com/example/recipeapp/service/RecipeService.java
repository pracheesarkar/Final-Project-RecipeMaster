package com.example.recipeapp.service;

import com.example.recipeapp.model.Recipe;
import com.google.gson.Gson;

import com.google.gson.reflect.TypeToken;
import org.springframework.stereotype.Service;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

@Service
public class RecipeService {

    public Recipe getRecipe(Long id)  {
        List<Recipe> recipes = getAllRecipes();

        for (Recipe recipe: recipes
        ) {
            if (recipe.getId() == id){
                return recipe;
            }
        }
        return null;
    }

    public List<Recipe> getAllRecipes()  {
        try {
            return readRecipesFromFile();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }

    public List<Recipe> getRecipeByCategory(String category) {
        List<Recipe> recipes = getAllRecipes();
        List<Recipe> tempRecipes = new ArrayList<>();
        for (Recipe recipe : recipes) {
            String type = recipe.getCategory();
            if (type.equals(category)){
                tempRecipes.add(recipe);
            }
        }
        return tempRecipes;
    }



    public List<Recipe> readRecipesFromFile() throws FileNotFoundException {
        Gson gson = new Gson();

        Type listType = new TypeToken<List<Recipe>>(){}.getType();
        List<Recipe> recipeList = gson.fromJson(new FileReader("src/main/resources/recipe.json"), listType);

        return recipeList;
    }
}