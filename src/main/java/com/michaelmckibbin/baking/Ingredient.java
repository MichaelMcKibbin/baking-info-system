package com.michaelmckibbin.baking;

public class Ingredient {
    private String name;
    private String description;
    private String category;
    private String unitType; // g, tsp, oz, ml, cup, etc.
    private double quantityPerUnit; // number of ml/mg in a unit. Work it out... external?
    private double caloriesPerUnit;
    private double caloriesPer100g;
    private String imageUrl;


    public Ingredient(String name, String description, String category, String unitType, double quantityPerUnit, double caloriesPerUnit, double caloriesPer100g, String imageUrl) {

        this.name = name;
        this.description = description;
        this.category = category;
        this.unitType = unitType;
        this.quantityPerUnit = quantityPerUnit;
        this.caloriesPerUnit = caloriesPerUnit;
        this.caloriesPer100g = caloriesPer100g;
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

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getUnitType() {
        return unitType;
    }

    public void setUnitType(String unitType) {
        this.unitType = unitType;
    }

    public double getQuantityPerUnit() {
        return quantityPerUnit;
    }

    public void setQuantityPerUnit(double quantityPerUnit) {
        this.quantityPerUnit = quantityPerUnit;
    }

    public double getCaloriesPerUnit() {
        return caloriesPerUnit;
    }

    public void setCaloriesPerUnit(double caloriesPerUnit) {
        this.caloriesPerUnit = caloriesPerUnit;
    }

    public double getCaloriesPer100g() {
        return caloriesPer100g;
    }

    public void setCaloriesPer100g(double caloriesPer100g) {
        this.caloriesPer100g = caloriesPer100g;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}

