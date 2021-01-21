package org.victor.chapter3;

import java.util.stream.IntStream;

public class ReducerExample {
    public static void main(String[] args) {
        var sum = IntStream.rangeClosed(1,10)
                .reduce((x,y) -> {
                    System.out.printf("x = %d, y = %d\n",x,y);
                    return x + y;
                }).orElse(0);

        System.out.printf("Sum is = %d",sum);
    }
}
