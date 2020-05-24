package com.codeclan.example.breadboss.repositories;

import com.codeclan.example.breadboss.models.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RecipeRepository extends JpaRepository<Recipe, Long> {

  List<Recipe> findAllByOrderByName();

  Recipe findFirstByOrderByUpdatedDesc();

  List<Recipe> findByName(String name);


}
