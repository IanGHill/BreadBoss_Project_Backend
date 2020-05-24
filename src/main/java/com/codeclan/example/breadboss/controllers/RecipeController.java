package com.codeclan.example.breadboss.controllers;

import com.codeclan.example.breadboss.models.Recipe;
import com.codeclan.example.breadboss.repositories.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RecipeController {

  @Autowired
  RecipeRepository recipeRepository;

  @GetMapping(value = "/recipes")
  public ResponseEntity<List<Recipe>> getAllRecipes(

    @RequestParam(name = "name", required = false) String recipeName
  )
  {

    if(recipeName != null){
      return  new ResponseEntity<>(recipeRepository.findByName(recipeName), HttpStatus.OK);
    }

    List<Recipe> foundRecipes = recipeRepository.findAll();
    return new ResponseEntity<>(foundRecipes, HttpStatus.OK);
  }

  @GetMapping(value = "recipes/latest")
  public ResponseEntity getLatestRecipe(){
    return new ResponseEntity(recipeRepository.findFirstByOrderByUpdatedDesc(), HttpStatus.OK);
  }

  @GetMapping(value = "/recipes/{id}")
  public ResponseEntity getRecipe(@PathVariable Long id){
    return new ResponseEntity<>(recipeRepository.findById(id), HttpStatus.OK);
  }

  @PostMapping(value = "/recipes")
  public ResponseEntity<Recipe> postRecipe(@RequestBody Recipe Recipe){
    recipeRepository.save(Recipe);
    return new ResponseEntity<>(Recipe, HttpStatus.CREATED);
  }

  @PutMapping(value = "/recipes/{id}")
  public ResponseEntity<Recipe> putRecipe(@RequestBody Recipe Recipe, @PathVariable Long id){
    recipeRepository.save(Recipe);
    return new ResponseEntity<>(Recipe, HttpStatus.CREATED);
  }

  @DeleteMapping(value = "/recipes/delete/{id}")
  public ResponseEntity<List<Recipe>> deleteRecipe(@PathVariable Long id){
    recipeRepository.deleteById(id);
    return new ResponseEntity<>(recipeRepository.findAll(), HttpStatus.OK);
  }
}
