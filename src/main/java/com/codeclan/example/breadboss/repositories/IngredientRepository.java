package com.codeclan.example.breadboss.repositories;

import com.codeclan.example.breadboss.models.Ingredient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IngredientRepository extends JpaRepository<Ingredient, Long> {

  List<Ingredient> findAll();

  List<Ingredient> findByCategory(String category);

  List<Ingredient> findByRecipeName(String name);
}
