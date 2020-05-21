package com.codeclan.example.breadboss.components;

import com.codeclan.example.breadboss.models.Ingredient;
import com.codeclan.example.breadboss.models.RawMaterial;
import com.codeclan.example.breadboss.models.Recipe;
import com.codeclan.example.breadboss.repositories.IngredientRepository;
import com.codeclan.example.breadboss.repositories.RawMaterialRepository;
import com.codeclan.example.breadboss.repositories.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

  @Autowired
  RawMaterialRepository rawMaterialRepository;

  @Autowired
  IngredientRepository ingredientRepository;

  @Autowired
  RecipeRepository recipeRepository;

  public void run(ApplicationArguments args) {

    RawMaterial rawMaterial1 = new RawMaterial("Flour - Ciabatta (T00)","Flour","Shipton Mill",10000, (float) 11.13);
    RawMaterial rawMaterial2 = new RawMaterial("Flour - Einkorn","Flour","Shipton Mill",1000, (float) 2.1);
    RawMaterial rawMaterial3 = new RawMaterial("Flour - Emmer","Flour","Shipton Mill",1000, (float) 1.75);
    RawMaterial rawMaterial4 = new RawMaterial("Flour - Extra Strong","Flour","Mungoswells",16000, (float) 13.55);
    RawMaterial rawMaterial5 = new RawMaterial("Flour - Granary","Flour","Shipton Mill",1000, (float) 1.3);
    RawMaterial rawMaterial6 = new RawMaterial("Flour - Khorasan","Flour","Shipton Mill",1000, (float) 1.75);
    RawMaterial rawMaterial7 = new RawMaterial("Flour - Rye Dark","Flour","Mungoswells",16000, (float) 11.17);
    RawMaterial rawMaterial8 = new RawMaterial("Flour - Rye Light","Flour","Shipton Mill",1000, (float) 1.3);
    RawMaterial rawMaterial9 = new RawMaterial("Flour - Spelt White","Flour","Shipton Mill",1000, (float) 2.0);
    RawMaterial rawMaterial10 = new RawMaterial("Flour - Spelt Wholemeal","Flour","Shipton Mill",1000, (float) 2.23);
    RawMaterial strongBreadFlour= new RawMaterial("Flour - Strong Bread","Flour","Mungoswells",16000, (float) 13.55);
    RawMaterial T85 = new RawMaterial("Flour - T85","Flour","Mungoswells",16000, (float) 13.48);
    RawMaterial wholewheatFlour = new RawMaterial("Flour - Wholewheat","Flour","Mungoswells",16000, (float) 13.01);
    RawMaterial rawMaterial14 = new RawMaterial("Flour - YQ","Flour","Hodemedods",1000, (float) 2.45);
    RawMaterial rawMaterial15 = new RawMaterial("Ale","Liquid","Lidl",500, (float) 1.25);
    RawMaterial water = new RawMaterial("Water","Liquid","N/A",0, (float) 0.0);
    RawMaterial rawMaterial19 = new RawMaterial("5 Grain Blend","Other","Shipton Mill",1000, (float) 1.3);
    RawMaterial rawMaterial20 = new RawMaterial("Beetroot - Dried","Other","Morrisons",200, (float) 1.7);
    RawMaterial rawMaterial21 = new RawMaterial("Miso","Other","Wholefoods online",300, (float) 3.0);
    RawMaterial rawMaterial22 = new RawMaterial("Olive Oil","Other","Lidl",750, (float) 2.39);
    RawMaterial rawMaterial23 = new RawMaterial("Olives - Green","Other","Lidl",340, (float) 0.59);
    RawMaterial rawMaterial24 = new RawMaterial("Olives - Kalamata","Other","Sainsburys",335, (float) 1.9);
    RawMaterial rawMaterial25 = new RawMaterial("Pearl Barley","Other","Morrisons",500, (float) 0.53);
    RawMaterial rawMaterial26 = new RawMaterial("Rosemary","Other","Morrisons",31, (float) 0.72);
    RawMaterial rawMaterial27 = new RawMaterial("Seeds - Black Sesame","Other","Wholefoods online",100, (float) 1.5);
    RawMaterial rawMaterial28 = new RawMaterial("Seeds - Brown Linseed","Other","Wholefoods online",1000, (float) 3.89);
    RawMaterial rawMaterial29 = new RawMaterial("Seeds - Chia","Other","Wholefoods online",1000, (float) 5.89);
    RawMaterial rawMaterial30 = new RawMaterial("Seeds - Cumin","Other","Morrisons",37, (float) 0.8);
    RawMaterial rawMaterial31 = new RawMaterial("Seeds - Pumpkin","Other","Wholefoods online",1000, (float) 6.47);
    RawMaterial rawMaterial32 = new RawMaterial("Seeds - Sunflower ","Other","Wholefoods online",1000, (float) 3.67);
    RawMaterial rawMaterial33 = new RawMaterial("Seeds - White Sesame","Other","Wholefoods online",1000, (float) 4.91);
    RawMaterial rawMaterial34 = new RawMaterial("Sesame Oil","Other","Morrisons",250, (float) 1.8);
    RawMaterial rawMaterial35 = new RawMaterial("Sweet Potato - Dried","Other","Morrisons",500, (float) 1.0);
    RawMaterial rawMaterial36 = new RawMaterial("Sweet Potato - Fresh","Other","Morrisons",1000, (float) 1.0);
    RawMaterial rawMaterial37 = new RawMaterial("Walnuts","Other","Wholefoods online",1000, (float) 8.99);
    RawMaterial salt = new RawMaterial("Sea Salt","Salt","Morrisons",350, (float) 0.8);
    RawMaterial ryeStarter = new RawMaterial("Starter - Rye","Starter","N/A",0, (float) 0.0);
    RawMaterial wheatStarter = new RawMaterial("Starter - Wheat","Starter","N/A",0, (float) 0.0);
    RawMaterial rawMaterial41 = new RawMaterial("Yeast - Fresh","Yeast","Morrisons",100, (float) 0.5);
    rawMaterialRepository.save(rawMaterial1);
    rawMaterialRepository.save(rawMaterial2);
    rawMaterialRepository.save(rawMaterial3);
    rawMaterialRepository.save(rawMaterial4);
    rawMaterialRepository.save(rawMaterial5);
    rawMaterialRepository.save(rawMaterial5);
    rawMaterialRepository.save(rawMaterial6);
    rawMaterialRepository.save(rawMaterial7);
    rawMaterialRepository.save(rawMaterial8);
    rawMaterialRepository.save(rawMaterial9);
    rawMaterialRepository.save(rawMaterial10);
    rawMaterialRepository.save(strongBreadFlour);
    rawMaterialRepository.save(T85);
    rawMaterialRepository.save(wholewheatFlour);
    rawMaterialRepository.save(rawMaterial14);
    rawMaterialRepository.save(rawMaterial15);
    rawMaterialRepository.save(water);
    rawMaterialRepository.save(rawMaterial19);
    rawMaterialRepository.save(rawMaterial20);
    rawMaterialRepository.save(rawMaterial21);
    rawMaterialRepository.save(rawMaterial22);
    rawMaterialRepository.save(rawMaterial23);
    rawMaterialRepository.save(rawMaterial24);
    rawMaterialRepository.save(rawMaterial25);
    rawMaterialRepository.save(rawMaterial26);
    rawMaterialRepository.save(rawMaterial27);
    rawMaterialRepository.save(rawMaterial28);
    rawMaterialRepository.save(rawMaterial29);
    rawMaterialRepository.save(rawMaterial30);
    rawMaterialRepository.save(rawMaterial31);
    rawMaterialRepository.save(rawMaterial32);
    rawMaterialRepository.save(rawMaterial33);
    rawMaterialRepository.save(rawMaterial34);
    rawMaterialRepository.save(rawMaterial35);
    rawMaterialRepository.save(rawMaterial36);
    rawMaterialRepository.save(rawMaterial37);
    rawMaterialRepository.save(salt);
    rawMaterialRepository.save(ryeStarter);
    rawMaterialRepository.save(wheatStarter);
    rawMaterialRepository.save(rawMaterial41);

    Recipe recipe1 = new Recipe("50:50 Wholewheat","Sourdough");
    recipeRepository.save(recipe1);
    Ingredient ingredient1 = new Ingredient(recipe1, wholewheatFlour, "Levain", 1000 );
    Ingredient ingredient2 = new Ingredient(recipe1, water, "Levain", 600 );
    Ingredient ingredient3 = new Ingredient(recipe1, ryeStarter, "Levain", 100 );
    Ingredient ingredient4 = new Ingredient(recipe1, strongBreadFlour, "Dough", 3500 );
    Ingredient ingredient5 = new Ingredient(recipe1, wholewheatFlour, "Dough", 2500 );
    Ingredient ingredient6 = new Ingredient(recipe1, salt, "Dough", 140 );
    Ingredient ingredient7 = new Ingredient(recipe1, water, "Dough", 4700 );
    ingredientRepository.save(ingredient1);
    ingredientRepository.save(ingredient2);
    ingredientRepository.save(ingredient3);
    ingredientRepository.save(ingredient4);
    ingredientRepository.save(ingredient5);
    ingredientRepository.save(ingredient6);
    ingredientRepository.save(ingredient7);











  }
}
