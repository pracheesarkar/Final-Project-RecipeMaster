package com.example.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
public class Ingredients implements Serializable{
    @SerializedName("ingredientAmt")
    private String ingredientAmt;
    @SerializedName("ingredientName")
    private String ingredientName;

    public String getIngredientAmt() {
        return ingredientAmt;
    }

    public String getIngredientName() {
        return ingredientName;
    }

    public void setIngredientAmt(String ingredientAmt) {
        this.ingredientAmt = ingredientAmt;
    }

    public void setIngredientName(String ingredientName) {
        this.ingredientName = ingredientName;
    }
}

