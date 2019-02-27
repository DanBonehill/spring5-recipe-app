package com.danbonehill.recipe.services;

import com.danbonehill.recipe.domain.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();
}
