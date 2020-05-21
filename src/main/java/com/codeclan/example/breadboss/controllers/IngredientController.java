package com.codeclan.example.breadboss.controllers;

import com.codeclan.example.breadboss.repositories.IngredientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IngredientController {

  @Autowired
  IngredientRepository ingredientRepository;
}
