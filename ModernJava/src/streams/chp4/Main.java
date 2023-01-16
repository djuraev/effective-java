package streams.chp4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    //
    public static void main(String[] args) {
        //
        List<Dish> menu = Arrays.asList(
                new Dish("pork", false, 800, Dish.Type.MEAT),
                new Dish("beef", false, 700, Dish.Type.MEAT),
                new Dish("chicken", false, 400, Dish.Type.MEAT),
                new Dish("french fries", true, 530, Dish.Type.OTHER),
                new Dish("rice", true, 350, Dish.Type.OTHER),
                new Dish("season fruit", true, 120, Dish.Type.OTHER),
                new Dish("pizza", true, 550, Dish.Type.OTHER),
                new Dish("prawns", false, 300, Dish.Type.FISH),
                new Dish("salmon", false, 450, Dish.Type.FISH)
        );
        List<String> names = new ArrayList<>();
        for (Dish dish: menu) {
            names.add(dish.getName());
        }

        names.clear();
        Iterator<Dish> iterator = menu.iterator();
        while (iterator.hasNext()) {
            Dish dish = iterator.next();
            names.add(dish.getName());
        }

        names.clear();

        names = menu.stream()
                .map(Dish::getName)
                .collect(Collectors.toList());

        names.clear();

        List<String> highCalories = new ArrayList<>();
        highCalories = menu.stream()
                .filter(dish -> dish.getCalories() > 300)
                .map(Dish::getName)
                .collect(Collectors.toList());
    }

}
