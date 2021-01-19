package org.victor.chapter1;

@FunctionalInterface
public interface MyFunctionalInterface {

    int myMethod();

    default String sayHello(){
        return "Hello World";
    }

    static void myStaticMethod(){
        System.out.println("Static Hello World");
    }
}
