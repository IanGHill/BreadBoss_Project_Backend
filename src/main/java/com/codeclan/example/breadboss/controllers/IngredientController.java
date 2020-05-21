package com.codeclan.example.breadboss.controllers;

import com.codeclan.example.breadboss.models.Ingredient;
import com.codeclan.example.breadboss.repositories.IngredientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class IngredientController {

  @Autowired
  IngredientRepository ingredientRepository;

  @GetMapping(value = "/ingredients")
  public ResponseEntity<List<Ingredient>> getAllIngredients(

    @RequestParam(name = "category", required = false) String category,
    @RequestParam(name = "recipe-name", required = false) String recipeName
  )
  {

    if(category != null){
      return  new ResponseEntity<>(ingredientRepository.findByCategory(category), HttpStatus.OK);
    }
    if(recipeName != null){
      return  new ResponseEntity<>(ingredientRepository.findByRecipeName(recipeName), HttpStatus.OK);
    }

    List<Ingredient> foundIngredients = ingredientRepository.findAll();
    return new ResponseEntity<>(foundIngredients, HttpStatus.OK);
  }

  @GetMapping(value = "/ingredients/{id}")
  public ResponseEntity getIngredient(@PathVariable Long id){
    return new ResponseEntity<>(ingredientRepository.findById(id), HttpStatus.OK);
  }

  @PostMapping(value = "/ingredients")
  public ResponseEntity<Ingredient> postIngredient(@RequestBody Ingredient ingredient){
    ingredientRepository.save(ingredient);
    return new ResponseEntity<>(ingredient, HttpStatus.CREATED);
  }

  @PutMapping(value = "/ingredients/{id}")
  public ResponseEntity<Ingredient> putIngredient(@RequestBody Ingredient ingredient, @PathVariable Long id){
    ingredientRepository.save(ingredient);
    return new ResponseEntity<>(ingredient, HttpStatus.CREATED);
  }

  @DeleteMapping(value = "/ingredients/{id}")
  public ResponseEntity<List<Ingredient>> deleteIngredient(@PathVariable Long id){
    ingredientRepository.deleteById(id);
    return new ResponseEntity<>(ingredientRepository.findAll(), HttpStatus.OK);
  }
}
