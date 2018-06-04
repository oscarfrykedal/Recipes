package com.example.Recipes;

public class Ingredients {

    public String meat;
    public String vegitables;
    public String Salt;
    public String pepper;

    public Ingredients(){}

    public Ingredients(String meat, String vegitables, String salt, String pepper) {
        this.meat = meat;
        this.vegitables = vegitables;
        this.Salt = salt;
        this.pepper = pepper;
    }

    public String getMeat() {
        return meat;
    }

    public String getVegitables() {
        return vegitables;
    }

    public String getSalt() {
        return Salt;
    }

    public String getPepper() {
        return pepper;
    }
}
