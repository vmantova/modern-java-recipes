package org.victor.chapter1;

public class RunnableDemo {
    public static void main(String[] args) {
        new Thread(
                new Runnable() {
                    @Override
                    public void run() {
                        System.out.println("Implementing Runnable with a anonymous inner class");
                    }
                }
        ).start();

        new Thread(() -> System.out.println("Implementing Runnable with lambda expression")).start();

        Runnable runnable = () -> System.out.println("Assigning a lambda to a reference");
        new Thread(runnable).start();

    }
}
