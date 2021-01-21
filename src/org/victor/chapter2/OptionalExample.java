package org.victor.chapter2;

import java.util.Arrays;
import java.util.stream.Collectors;

public class OptionalExample {
    public static void main(String[] args) {
        var names = Arrays.asList("Victor", "Pedro", "Karl", "Marcelo");
        var first = names.stream().filter(n -> n.startsWith("C")).findFirst();

     /*   System.out.println(first);
        System.out.println(first.orElse("None"));*/

        System.out.println(first.orElse(String.format("No result found in %s", names.stream().collect(Collectors.joining(", ")))));
        System.out.println(first.orElseGet(() -> String.format("No result found in %s", names.stream().collect(Collectors.joining(", ")))));



    }
}
