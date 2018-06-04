package com.example.Recipes;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RecipesController {

    Recipes recipes = new Recipes();

    @RequestMapping(value = "/recipes", method = RequestMethod.GET)
    public List<RecipesItem> getRecipesItems(@RequestParam(value = "searchstring", defaultValue = "") String searchString) {

        return recipes.getRecipes(searchString);
    }


    @RequestMapping(value = "/recipes/{id}", method = RequestMethod.DELETE)
    public String deleteRecipeWithId(@PathVariable("id") int id)  {



        return recipes.deleteRecipe(id);

    }



        @RequestMapping(value = "/recipes", method = RequestMethod.POST)
        public RecipesItem postRecipesItem (@RequestBody RecipesItem item){

            recipes.addItem(item);
            return item;
        }

    }

