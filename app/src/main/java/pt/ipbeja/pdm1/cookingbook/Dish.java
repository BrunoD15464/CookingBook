package pt.ipbeja.pdm1.cookingbook;

/**
 * Created by Bruno on 08-11-2016.
 */

public class Dish {

    static String[] DishName= {
            "Dish One",
            "Dish Two"
    };

    static String[] DishDescription= {
            "Description One",
            "Description Two"
    };


    public static String[] getDishName() {
        return DishName;
    }

    public static void setDishName(String[] dishName) {
        DishName = dishName;
    }

    public static String[] getDishDescription() {
        return DishDescription;
    }

    public static void setDishDescription(String[] dishDescription) {
        DishDescription = dishDescription;
    }

    @Override
    public String toString() {
        return "Dish{}";
    }
}
