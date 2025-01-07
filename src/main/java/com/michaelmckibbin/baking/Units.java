package com.michaelmckibbin.baking;

public class  Units {
    public static final String GRAMS = "g";
    public static final String KILOGRAMS = "kg";
    public static final String TEASPOON = "tsp";
    public static final String TABLESPOON = "tbsp";
    public static final String MILLILITER = "ml";
    public static final String LITER = "l";
    public static final String FLUID_OUNCE="fl.oz";
    public static final String CUP = "cup";
    public static final String PINT = "pint";
    public static final String OUNCE = "oz";
    public static final String POUND = "lb";

// convert units to grams/ml
    public static double convertToGrams(double quantity, String unit) {
        switch (unit) {
            case GRAMS:
                return quantity;
            case KILOGRAMS:
                return quantity * 1000;
            case TEASPOON:
                return quantity * 5.69;
            case TABLESPOON:
                return quantity * 14.79;
            case MILLILITER:
                return quantity;
            case LITER:
                return quantity * 1000;
            case FLUID_OUNCE:
                return quantity * 28.35;
            case CUP:
                return quantity * 236.59;
            case PINT:
                return quantity * 473.18;
            case OUNCE:
                return quantity * 28.35;
            case POUND:
                return quantity * 453.59;
            default:
                return 0;
        }
    }
}
