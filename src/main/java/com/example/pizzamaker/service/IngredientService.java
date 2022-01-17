package com.example.pizzamaker.service;

import com.example.pizzamaker.model.Ingredient;

import java.util.List;

public interface IngredientService {

    Ingredient read(int id);

    List<Ingredient> readAll();

    void create();

    Ingredient update(int id, Ingredient ingredient);

    void delete(int id);
}
