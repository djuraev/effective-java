package streams.chp6;

import streams.chp4.Dish;
import streams.chp4.DishMaker;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class Main {
    public static void main(String[] args) {
        //
        List<Dish> dishes = DishMaker.getSampleDishes();
        /*Counting*/
        long dishesCount = dishes.stream().collect(Collectors.counting());
        dishesCount = dishes.stream().count();


        Comparator<Dish> dishComparator = Comparator.comparingInt(Dish::getCalories);

        Optional<Dish> minCaloryDish = dishes.stream().collect(minBy(dishComparator));
        Optional<Dish> maxCaloryDish = dishes.stream().collect(maxBy(dishComparator));

        String shortMenu = dishes.stream().map(Dish::getName).collect(Collectors.joining());
        System.out.println(shortMenu);

        Map<CaloricLevel, List<Dish>> dishedByCalories = dishes.stream()
                .collect(
                        groupingBy(dish -> {
                            if (dish.getCalories() <= 400) return CaloricLevel.DIET;
                            else if (dish.getCalories() <= 700) return CaloricLevel.NORMAL;
                            else return CaloricLevel.FAT;
                        })
                );
        System.out.println(dishedByCalories);
    }
}
