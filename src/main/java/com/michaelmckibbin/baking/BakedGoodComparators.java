package com.michaelmckibbin.baking;

import java.util.Comparator;

public class BakedGoodComparators {
    // Compare by calories per item
    public static class CaloriesComparator implements Comparator<BakedGood> {
        @Override
        public int compare(BakedGood b1, BakedGood b2) {
            return Double.compare(b1.getCaloriesPerBakedGood(), b2.getCaloriesPerBakedGood());
        }
    }

    // Compare by calories per 100g
    public static class CaloriesDensityComparator implements Comparator<BakedGood> {
        @Override
        public int compare(BakedGood b1, BakedGood b2) {
            return Double.compare(b1.getCaloriesPer100g(), b2.getCaloriesPer100g());
        }
    }

    // Compare by weight
    public static class WeightComparator implements Comparator<BakedGood> {
        @Override
        public int compare(BakedGood b1, BakedGood b2) {
            return Double.compare(b1.getWeightInGrammes(), b2.getWeightInGrammes());
        }
    }

    // Compare by origin
    public static class OriginComparator implements Comparator<BakedGood> {
        @Override
        public int compare(BakedGood b1, BakedGood b2) {
            return b1.getOrigin().compareTo(b2.getOrigin());
        }
    }

    // Compare by category
    public static class CategoryComparator implements Comparator<BakedGood> {
        @Override
        public int compare(BakedGood b1, BakedGood b2) {
            return b1.getCategory().compareTo(b2.getCategory());
        }
    }

    // Multi-field comparator (example: by category, then calories)
    public static class CategoryThenCaloriesComparator implements Comparator<BakedGood> {
        @Override
        public int compare(BakedGood b1, BakedGood b2) {
            int categoryCompare = b1.getCategory().compareTo(b2.getCategory());
            if (categoryCompare != 0) {
                return categoryCompare;
            }
            return Double.compare(b1.getCaloriesPerBakedGood(), b2.getCaloriesPerBakedGood());
        }
    }
}

