package org.example.homework.S19;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class LambdaExpressions {
    public static void main(String[] args) {
        // 1. Write a program that used lambda expressions to filter a list of integers and return only the even numbers.
        List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9,10);
        Predicate<Integer> isEven = number -> number % 2 == 0;
        for(int num:numbers) {
            System.out.println("Is " + num+ " even? " + isEven.test(num));
        }

        // 2. Write a program that uses lambda expressions to sort a list of strings in alphabetical order.
        List<String> strings = Arrays.asList("this", "is", "a", "random", "test");
        strings.sort((s1, s2) -> s1.compareToIgnoreCase(s2));
        System.out.println("Sorted strings: "+strings);

        // 3. Write a program that uses lambda expressions to calculate the sum of all the elements in a list of integers.
        List<Integer> numbers2 = List.of(2,4,6,8,10);
        MathOperations add = (a,b) -> a+b;
        int sum = 0;
        for(int num : numbers2) {
            sum=add.compute(num, sum);
        }
        System.out.println("The sum of all numbers is "+ sum);

        // 4. You are given a List<String? representing a list of words. Create a lambda expression to sort the list in alphabetical order. Next, modify your lambda expressions to sort the list in reverse alphabetical order.
        List<String> strings2 = Arrays.asList("this", "is", "a", "random", "test");
        strings2.sort((s1, s2) -> s1.compareToIgnoreCase(s2));
        System.out.println("Sorted strings alphabetically: "+strings2);
        strings2.sort((s1,s2)-> s2.compareToIgnoreCase(s1));
        System.out.println("Sorted strings in reverse alphabetical order: "+strings2);

        // 5. Create a functional interface that takes a list of integers and returns the maximum value from the list. Implement this interface using a lambda expression. Ensure your lambda correctly handles an empty list case.
        List<Integer> numbers3 = List.of(1,5,2,9,8,7);
        MaxValue maxFinder = (list) -> { if(list == null || list.isEmpty()) { return 0;} return Collections.max(list);};
        int max=maxFinder.findMax(numbers3);
        System.out.println("The maximum value is "+max);


    }
}
@FunctionalInterface
interface TextTransform {
    String transform(String text);
}
@FunctionalInterface
interface MathOperations {
    int compute(int a, int b);
}
@FunctionalInterface
interface MaxValue {
    int findMax(List<Integer> numbers);
}