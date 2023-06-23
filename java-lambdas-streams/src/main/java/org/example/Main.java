package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        Greeting greeting = new HelloGreeting();
        greeting.sayHello();

        Greeting greeting1 = () -> System.out.println("Thanks Everyone");
        greeting1.sayHello();

        Calculator calculator = (int x, int y) -> {
            Random random = new Random();
            int randomNumber = random.nextInt(50);
            return x * y + randomNumber;
        };
        System.out.println(calculator.calculate(10, 20));

        Integer[] scores = new Integer[]{70, 20, 50, 10, 30};
        Arrays.stream(scores).sorted().forEach(
                System.out::println
        );

        List<String> shoppingList = new ArrayList<>();
        shoppingList.add("coffee");
        shoppingList.add("milk");
        shoppingList.add("tea");
        shoppingList.add("pasta");
      Stream<String>  shoppingListStream = shoppingList.stream();
       List<String> stringList = shoppingListStream.map(
                String::toUpperCase
        ).sorted().filter(x -> x.startsWith("C")).toList();

        System.out.println(stringList);
    }
}