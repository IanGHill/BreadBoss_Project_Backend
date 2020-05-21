package com.codeclan.example.breadboss;

import com.codeclan.example.breadboss.models.Ingredient;
import com.codeclan.example.breadboss.models.RawMaterial;
import com.codeclan.example.breadboss.models.Recipe;
import com.codeclan.example.breadboss.repositories.IngredientRepository;
import com.codeclan.example.breadboss.repositories.RawMaterialRepository;
import com.codeclan.example.breadboss.repositories.RecipeRepository;
import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BreadbossApplicationTests {

	@Autowired
	RecipeRepository recipeRepository;

	@Autowired
	RawMaterialRepository rawMaterialRepository;

	@Autowired
	IngredientRepository ingredientRepository;


	@Test
	void contextLoads() {
	}

	@Test
	public void canCreateRecipe(){
		Recipe recipe1 = new Recipe("White Sourdough", "Sourdough");
		recipeRepository.save(recipe1);
	}

	@Test
	public void canUpdateRecipe(){
		Recipe recipe2 = new Recipe("Wholemeal Sourdough", "Yeasted");
		recipeRepository.save(recipe2);
		recipe2.setType("Sourdough");
		recipeRepository.save(recipe2);
	}

	@Test
	public void canAddRawMaterial(){
		RawMaterial rawMaterial = new RawMaterial("Wholemeal Flour", "Flour", "Mungoswells", 16000, (float) 18.50);
		rawMaterialRepository.save(rawMaterial);
	}

	@Test
	public void canAddIngredient(){
		RawMaterial rawMaterial = new RawMaterial("Wholemeal Flour", "Flour", "Mungoswells", 16000, (float) 18.50);
		rawMaterialRepository.save(rawMaterial);
		Recipe recipe2 = new Recipe("Wholemeal Sourdough", "Yeasted");
		recipeRepository.save(recipe2);
		Ingredient ingredient = new Ingredient(recipe2,rawMaterial,"Levain",50 );
		ingredientRepository.save(ingredient);
	}


}
