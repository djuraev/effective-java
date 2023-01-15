package streams.chp5;

import streams.chp4.Dish;
import streams.chp5.exercise.Trader;
import streams.chp5.exercise.Transaction;

import javax.swing.text.html.Option;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {
    //
    public static void main(String[] args) {
        //
        /*List<Integer> numbers = Arrays.asList(2,2,4,5,4,5,6,7,7,8,6,5,5,1,3,1,2,3,3);
        numbers.stream()
                .filter(number -> number %2 == 0)
                .distinct()
                .forEach(System.out::println);

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

        List<Dish> meatDishes = menu.stream()
                .filter(dish -> dish.getType() == Dish.Type.MEAT)
                .limit(2)
                .collect(Collectors.toList());
        System.out.println(meatDishes);

        List<String> words = List.of("Hello", "New", "World");
        List<String> uniqueChars = words.stream()
                .map(word -> word.split(""))
                .flatMap(Arrays::stream)
                .distinct()
                .collect(Collectors.toList());
        System.out.println("=====================================================");
        System.out.println(uniqueChars);

        List<Integer> ls1 = List.of(1, 2, 3);
        List<Integer> ls2 = List.of(3, 4);

        List<Integer[]> combined = ls1.stream()
                .flatMap(i -> ls2.stream().map(j -> new Integer[]{i, j}))
                .collect(Collectors.toList());
        System.out.println(combined);

        List<Integer> divByThree = ls1.stream()
                .flatMap(i ->
                    ls2.stream().filter(j -> (i+j) %3 ==0)
                )
                .collect(Collectors.toList());
        List<Integer> nums = List.of(1,2,3,4,45,5,6);
        int sum = nums.stream().reduce(0, Integer::sum);
        Optional<Integer> max = nums.stream().reduce(Integer::max);
        Optional<Integer> min = nums.stream().reduce(Integer::min);

        System.out.println(sum);*/

        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario","Milan");
        Trader alan = new Trader("Alan","Cambridge");
        Trader brian = new Trader("Brian","Cambridge");

        List<Transaction> transactions = Arrays.asList(
            new Transaction(brian, 2011, 300),
            new Transaction(raoul, 2012, 1000),
            new Transaction(raoul, 2011, 400),
            new Transaction(mario, 2012, 710),
            new Transaction(mario, 2012, 700),
            new Transaction(alan, 2012, 950)
        );

        List<Transaction> in2011 = transactions.stream()
                .filter(tr->tr.getYear() == 2011)
                .sorted(Comparator.comparing(Transaction::getValue))
                .collect(Collectors.toList());

        List<String> cities = transactions.stream()
                .map(tr->tr.getTrader().getCity())
                .distinct()
                .collect(Collectors.toList());
        System.out.println(cities);

        List<Trader> camTraders = transactions.stream()
                .map(Transaction::getTrader)
                .filter(tr->tr.getCity().equals("Cambridge"))
                .distinct()
                .sorted(Comparator.comparing(Trader::getName))
                .collect(Collectors.toList());

        System.out.println(camTraders);

        List<String> names = transactions.stream()
                .map(tr->tr.getTrader().getName())
                .distinct()
                .sorted(Comparator.comparing(a->a))
                .collect(Collectors.toList());

        boolean milanBased = transactions.stream()
                .anyMatch(tr->tr.getTrader().getCity().equals("Milan"));

         transactions.stream()
                .filter(tr->("Milan").equals(tr.getTrader().getCity()))
                .map(Transaction::getValue)
                .forEach(System.out::println);

         Optional<Integer> max = transactions.stream().
                map(tr->tr.getValue())
                 .reduce(Integer::max);

        Optional<Transaction> tr = transactions.stream().reduce(
                (tr1, tr2) -> tr1.getValue() < tr2.getValue() ? tr1 : tr2);

        System.out.println(names);
    }
}
