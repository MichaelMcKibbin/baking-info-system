package com.michaelmckibbin.baking;

public class IngredientsController {

    // create MyLinkedList of Ingredients
    private MyLinkedList<Ingredient> ingredientsList = new MyLinkedList<>();

    // add ingredient to list
    public void addIngredient(Ingredient ingredient) {
        ingredientsList.add(ingredient);
    }
    // remove ingredient from list
    public void removeIngredient(Ingredient ingredient) {
        ingredientsList.remove(ingredient);
    }

    // get ingredient from list
    public Ingredient getIngredient(int index) {
        return ingredientsList.get(index);
    }

    // get list of ingredients
    public MyLinkedList<Ingredient> getIngredientsList() {
        return ingredientsList;
    }

}
