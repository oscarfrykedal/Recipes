package com.example.Recipes;

public class RecipesItem extends Recipes {

    private int id;
    private String name;
    private String level;
    private String time;
    private Ingredients ingredients;

    public RecipesItem() {
    }

    public RecipesItem(int id, String name, String level, String time, Ingredients ingredients) {

        this.id = id;
        this.name = name;
        this.level = level;
        this.time = time;
        this.ingredients = ingredients;

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLevel() {
        return level;
    }

    public String getTime() { return time;
    }

    public Ingredients getIngredients() {
        return ingredients;
    }


}
