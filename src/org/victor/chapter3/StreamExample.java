package org.victor.chapter3;

import java.time.LocalDate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {

        //Create stream using Stream.of()
        var names = Stream.of("Gomez", "Morticia", "Wednesday", "Pugsley")
                .collect(Collectors.joining(", "));

        System.out.println(names);

        //Create stream using Stream.iterate(), always use limit to not execute indefinitely
        Stream.iterate(LocalDate.now(), date -> date.plusDays(1l))
                .limit(10)
                .forEach(System.out::println);

        //Create stream using Stream.generate()

        Stream.generate(Math::random).limit(10).forEach(System.out::println);

    }
}
