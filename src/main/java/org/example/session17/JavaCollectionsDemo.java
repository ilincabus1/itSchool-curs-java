package org.example.session17;

import java.util.*;

public class JavaCollectionsDemo {
    public static void main(String[] args) {
 //       listDemo();
 //       setDemo();
        mapDemo();
    }
    public static void listDemo() {
        List<Integer>  numbers = new ArrayList<>();
        for(int i=0; i<=5; i++) {
            numbers.add(i*10);
        }
        System.out.println(numbers);
        numbers.add(3, 25);
        System.out.println(numbers);

        numbers.set(3, 26); // modifica valoarea
        System.out.println(numbers);

        System.out.println(numbers.contains(26));
        System.out.println(numbers.contains(25));

        for(int number: numbers) {
            System.out.println("Number: " + number);
        }
        System.out.println(numbers.get(2));
    }

    enum Day {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }
    public static void setDemo() {
        Set<String> students = new HashSet<>();
        students.add("Marcel");
        students.add("Marcela");
        students.add("Mihai");
        students.add("Marcel"); // nu se adauga, deoarece HashSet nu permite duplicate
        System.out.println(students);
        students.remove("Mihai");
        System.out.println(students);
        System.out.println("Is Marcel in the set? " + students.contains("Mihai"));

        EnumSet<Day> days = EnumSet.range(Day.MONDAY,Day.FRIDAY);
        System.out.println("Days of the week: " + days);
        days.add(Day.FRIDAY);
        System.out.println(days);
        days.add(Day.SUNDAY);
        System.out.println(days);

    }

    public static void mapDemo() {
        Map<String, Integer> students = new HashMap<>();
        students.put("Marcel", 29);
        students.put("Marcela", 30);
        students.put("Mihai", 82);
        System.out.println(students);
        students.put("Marcel",31);
        System.out.println(students); // actualizeaza valoarea lui Marcel, suprascrie valoarea intrucat cheia este unica
        System.out.println("Marcel's age: " + students.get("Marcel"));
        for(String name : students.keySet()) {
            System.out.println("Student: " + name + ", Age: " + students.get(name));
        }
        for(Map.Entry<String, Integer> entry : students.entrySet()) {
            System.out.println("Student: " + entry.getKey() + ", Age: " + entry.getValue());
        }
        students.remove("Mihai");
        System.out.println("After removing Mihai: " + students);

    }
}
