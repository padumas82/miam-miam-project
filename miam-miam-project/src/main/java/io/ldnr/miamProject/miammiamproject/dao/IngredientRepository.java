package io.ldnr.miamProject.miammiamproject.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import io.ldnr.miamProject.miammiamproject.model.Ingredient;

public interface IngredientRepository extends JpaRepository<Ingredient, Integer> {
}
