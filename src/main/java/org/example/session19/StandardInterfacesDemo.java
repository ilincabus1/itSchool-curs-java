package org.example.session19;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class StandardInterfacesDemo {
    public static void main(String[] args) {
        // no input, no return, simple action
        Runnable sayHello = () -> System.out.println("Hello from Runnable");
        sayHello.run();

        // input, no return, simple action
        Consumer<String> printMessage = msg -> System.out.println("Message: " + msg);
        printMessage.accept("Hello from Consumer");
        Person p1 = new Person();
        Consumer<String> setPersonName = (name) -> p1.setName(name);
        setPersonName.accept("Marcel");
        System.out.println(p1.getName());

        // input, return boolean, simple computation
        Predicate<Integer> isEven = number -> number % 2 == 0;
        System.out.println("Is 4 even? " + isEven.test(4));
        System.out.println("Is 5 even? " + isEven.test(5));

        // 2 inputs, return value, simple computation
        Function<String, Integer> stringLength = str -> str.length();
        System.out.println("Length of 'Lambda': " + stringLength.apply("Lambda"));

        // no input, return value, simple computation
        Supplier<Double> randomValue = () -> Math.random();
        System.out.println("Random value: " + randomValue.get());
    }
}
class Person{ private String name; public String getName() {return name;} public void setName(String name) {this.name=name;}}