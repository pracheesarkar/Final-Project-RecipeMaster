package com.example.service;

import com.example.model.Recipe;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface RecipeService {
    @GET("recipe/getAllRecipes")
    Call<List<Recipe>> getRecipes();

    @GET("recipe/getRecipe")
    Call<Recipe> getRecipe(@Path("id") Long id);

    @GET("recipe/getRecipeByCategory")
    Call<List<Recipe>> getRecipe(@Path("category") String category);
}

