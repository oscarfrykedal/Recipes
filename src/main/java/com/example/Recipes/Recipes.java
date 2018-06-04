package com.example.Recipes;

import java.util.ArrayList;
import java.util.List;

public class Recipes {

    private List<RecipesItem> recipes;

    public Recipes() {
        this.recipes = new ArrayList<>();
//        addMockData();
    }

    public String deleteRecipe(int id){

        for (RecipesItem r : recipes) {
            if (r.getId() == id) {
                recipes.remove(r);
                return "Recipe for " + r.getName() + " has been deleted.";
            }
        }
        return ("No recipe with that id " + String.valueOf(id));
    }


    public List<RecipesItem> getRecipes(String searchString) {
        if (searchString == "")

            return recipes;

        ArrayList<RecipesItem> items = new ArrayList<>();
        for (RecipesItem item : recipes ) {
            if(item.getName().contains(searchString))
                items.add(item);
        }
         return items;
    }

    public void addItem(RecipesItem item) {
        recipes.add(item);
    }

    private void addMockData() {
        Ingredients ingredients = new Ingredients("minced meat", "1tomato, 2 onions", "7dl", "4tsp");
        RecipesItem item = new RecipesItem(1, "mormors köttbullar", "3/5", "30 min", ingredients);
        addItem(item);

        ingredients = new Ingredients("goat", "1 broccoli, 50 carrots", "1dl", "1tsp");
        item = new RecipesItem(2, "inlagd get", "2/5", "100 min", ingredients);
        addItem(item);

    }
}


