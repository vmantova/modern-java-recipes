package org.victor.chapter1;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ConstructorReferenceExample {
    public static void main(String[] args) {
        var names = Arrays.asList("Karl Marx", "Friedrich Engels", "Frantz Fanon");

        var people = names
                .stream()
                .map(name -> new Person(name))
                .collect(Collectors.toList());

        var people2 = names
                .stream()
                .map(Person::new)
                .collect(Collectors.toList());

    }
}
