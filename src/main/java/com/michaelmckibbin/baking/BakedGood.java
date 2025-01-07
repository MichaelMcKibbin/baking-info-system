package com.michaelmckibbin.baking;

public class BakedGood {
    private String name;
    private String description;
    private double weightInGrammes;
    private double caloriesPerBakedGood;
    private double caloriesPer100g;
    private String origin;
    private String category;
    private String imageUrl;
    private MyLinkedList recipe;


    public BakedGood(String name, String description, double weightInGrammes, double caloriesPerBakedGood, double caloriesPer100g, String origin, String category, String imageUrl) {
        this.name = name;
        this.description = description;
        this.weightInGrammes = weightInGrammes;
        this.caloriesPerBakedGood = caloriesPerBakedGood;
        this.caloriesPer100g = caloriesPer100g;
        this.origin = origin;
        this.category = category;
        this.imageUrl = imageUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getWeightInGrammes() {
        return weightInGrammes;
    }

    public void setWeightInGrammes(double weightInGrammes) {
        this.weightInGrammes = weightInGrammes;
    }

    public double getCaloriesPerBakedGood() {
        return caloriesPerBakedGood;
    }

    public void setCaloriesPerBakedGood(double caloriesPerBakedGood) {
        this.caloriesPerBakedGood = caloriesPerBakedGood;
    }

    public double getCaloriesPer100g() {
        return caloriesPer100g;
    }

    public void setCaloriesPer100g(double caloriesPer100g) {
        this.caloriesPer100g = caloriesPer100g;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}