package org.example.session19;

import org.w3c.dom.Text;

public class LambdaExpressionDemo {
    public static void main(String[] args) {
        Hello hello = () -> System.out.println("Salut!");
        hello.sayHello();
        HelloName helloName = name -> System.out.println("Salut, "+name);
        helloName.sayHello("Marcel");

        MathOperations addition = (a,b) -> a+b;
        MathOperations subtraction = (a,b) -> a-b;
        MathOperations multiplication = (a,b) -> a*b;
        MathOperations division = (a,b) -> a/b;

        System.out.println(addition.compute(10,5));
        System.out.println(subtraction.compute(10,5));
        System.out.println(multiplication.compute(10,5));
        System.out.println(division.compute(10,5));

        TextTransform toUpper = text -> text.toUpperCase();
        System.out.println(toUpper.transform("Marcel"));
    }
}

@FunctionalInterface
interface Hello {
     void sayHello();
}
@FunctionalInterface
interface HelloName {
    void sayHello(String name);
}
@FunctionalInterface
interface MathOperations {
    int compute(int a, int b);
}
@FunctionalInterface
interface TextTransform {
    String transform(String text);
}