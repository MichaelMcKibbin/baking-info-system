package com.michaelmckibbin.baking;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.io.Serializable;

public class BakingManager extends Application implements Serializable {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(BakingManager.class.getResource("baking-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        scene.getStylesheets().add(getClass().getResource("styles.css").toExternalForm()); // add css stylesheet to scene
        stage.setTitle("Baking Information System");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();

        // Create a list of baked goods
        MyLinkedList<BakedGood> bakedGoods = new MyLinkedList<>();

        // Add some sample items
        // French Pastries
        bakedGoods.add(new BakedGood(
                "Classic Croissant",
                "Flaky, buttery layered French pastry in a crescent shape",
                60,  // weight in grammes
                230, // calories per item
                383, // calories per 100g
                "French",
                "Pastry",
                "images/croissant.jpg"

        ));

        bakedGoods.add(new BakedGood(
                "Pain au Chocolat",
                "Chocolate-filled rectangular French pastry made with laminated dough",
                75,  // weight in grammes
                300, // calories per item
                400, // calories per 100g
                "French",
                "Pastry",
                "images/pain-au-chocolat.jpg"

        ));

        // Breads
        bakedGoods.add(new BakedGood(
                "Sourdough Bread",
                "Artisanal bread made with natural fermentation, tangy flavor and crispy crust",
                800, // weight in grammes
                1960, // calories per item
                245, // calories per 100g
                "Global",
                "Bread",
                "images/sourdough.jpg"

        ));

        bakedGoods.add(new BakedGood(
                "Baguette",
                "Traditional French bread with crispy crust and soft interior",
                250, // weight in grammes
                650, // calories per item
                260, // calories per 100g
                "French",
                "Bread",
                "images/baguette.jpg"

        ));

        // Cakes
        bakedGoods.add(new BakedGood(
                "Black Forest Gateau",
                "Chocolate sponge cake with cherries, cream, and chocolate shavings",
                200, // weight in grammes
                600, // calories per item
                300, // calories per 100g
                "German",
                "Cake",
                "images/black-forest.jpg"

        ));

        bakedGoods.add(new BakedGood(
                "Victoria Sponge",
                "Classic British sandwich cake filled with jam and buttercream",
                150, // weight in grammes
                450, // calories per item
                300, // calories per 100g
                "British",
                "Cake",
                "images/victoria-sponge.jpg"

        ));

        // Cookies/Biscuits
        bakedGoods.add(new BakedGood(
                "Chocolate Chip Cookie",
                "Classic American cookie with chunks of chocolate",
                30,  // weight in grammes
                150, // calories per item
                500, // calories per 100g
                "American",
                "Cookie",
                "images/choc-chip-cookie.jpg"

        ));

        bakedGoods.add(new BakedGood(
                "Scottish Shortbread",
                "Traditional buttery Scottish biscuit",
                25,  // weight in grammes
                120, // calories per item
                480, // calories per 100g
                "Scottish",
                "Biscuit",
                "images/shortbread.jpg"

        ));

        // Sweet Buns
        bakedGoods.add(new BakedGood(
                "Cinnamon Roll",
                "Swirled sweet bun with cinnamon filling and cream cheese frosting",
                100, // weight in grammes
                350, // calories per item
                350, // calories per 100g
                "Swedish",
                "Sweet Bun",
                "images/cinnamon-roll.jpg"

        ));

        bakedGoods.add(new BakedGood(
                "Hot Cross Bun",
                "Spiced sweet bun with dried fruits marked with a cross",
                80,  // weight in grammes
                240, // calories per item
                300, // calories per 100g
                "British",
                "Sweet Bun",
                "images/hot-cross-bun.jpg"

        ));


        // Create sorter
        MySort<BakedGood> sorter = new MySort<>();

        // Sort by calories per item
        sorter.mergeSort(bakedGoods, new BakedGoodComparators.CaloriesComparator());
        printBakedGoods("Sorted by calories:", bakedGoods);

        // Sort by category then calories
        sorter.mergeSort(bakedGoods, new BakedGoodComparators.CategoryThenCaloriesComparator());
        printBakedGoods("Sorted by category then calories:", bakedGoods);

        // If you want to use MyArrayList instead
        MyArrayList<BakedGood> bakedGoodsArray = new MyArrayList<>();
        // Transfer items to ArrayList if needed
        for (int i = 0; i < bakedGoods.size(); i++) {
            bakedGoodsArray.add(bakedGoods.get(i));
        }
    }

    private static void printBakedGoods(String message, MyLinkedList<BakedGood> goods) {
        System.out.println(message);
        for (int i = 0; i < goods.size(); i++) {
            BakedGood item = goods.get(i);
            System.out.printf("%s (Category: %s, Calories: %.0f)%n",
                    item.getName(),
                    item.getCategory(),
                    item.getCaloriesPerBakedGood());
        }
        System.out.println();
    }
}
