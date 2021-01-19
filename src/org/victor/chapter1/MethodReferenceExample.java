package org.victor.chapter1;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MethodReferenceExample {
    public static void main(String[] args) {
        //lambda expression
        Stream.of(1, 2, 3, 4, 5).forEach(x -> System.out.println(x));

        //Method reference
        Stream.of(1, 2, 3, 4, 5).forEach(System.out::println);

        //Assign method reference to a functional interface variable
        Consumer<Integer> print = System.out::println;
        Stream.of(1, 2, 3, 4, 5).forEach(print);

        //Method reference with static methods
        Stream.generate(Math::random).limit(10).forEach(System.out::println);


        var strings = Arrays.asList("This", "is", "a", "list", "of", "Strings");
        var sorted = strings
                .stream()
                .sorted((s1, s2) -> s1.compareTo(s2))
                .collect(Collectors.toList());

        var sortedWithMethodReference = strings
                .stream()
                .sorted(String::compareTo)
                .collect(Collectors.toList());

        System.out.println(sorted);
        System.out.println(sortedWithMethodReference);

        //Difference between using method reference calling a instance method via class name and object reference
        Stream.of("this", "is", "a", "stream", "of", "strings")
                .map(String::length)
                .forEach(System.out::println);
    }
}
