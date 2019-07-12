package io.ldnr.miamProject.miammiamproject.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import io.ldnr.miamProject.miammiamproject.dao.IngredientRepository;
import io.ldnr.miamProject.miammiamproject.model.Ingredient;



@Controller
public class IngredientController {
	@Autowired
	private IngredientRepository ingredientRepository;

	@GetMapping(value = "/addIngredient")
	public String addIngredient(Model model) {
		model.addAttribute("ingredient", new Ingredient());
		return "addIngredient";
	}

	@PostMapping(value = "/confirmAjoutIngredient")
	public String ingredientSubmit(@ModelAttribute("ingredient") Ingredient ingredient, Model model) {

		Ingredient ing1 = ingredientRepository.save(ingredient);
		model.addAttribute("ingredient", ing1);
		return "confirmAjoutIngredient";
	}

	@GetMapping(value = "/result")
	public ModelAndView listIngredients() {
			Collection<Ingredient> ingredients = ingredientRepository.findAll();
			return new ModelAndView("result", "ingredients", ingredients);
	}

}
