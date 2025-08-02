package org.example.homework.S17;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class HashSetChallenge {
    public static void main(String[] args) {
        // 1. Write a Java program to append the specified element to the end of a hash set.
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Cherry");
        System.out.println("HashSet after adding elements: " + hashSet);
        hashSet.add("Watermelon");
        System.out.println("HashSet after appending 'Watermelon': " + hashSet);

        // 2. Write a Java program to iterate through all elements in a hash set.
        System.out.println("Iterating through hash set:");
        for (String fruit : hashSet) {
            System.out.println("Fruit: " + fruit);
        }

        // 3. Write a Java program to get the number of elements in a hash set.
        System.out.println("Number of elements in the hash set: " + hashSet.size());

        // 4. Write a Java program to empty a hash set.
        hashSet.clear();
        System.out.println("HashSet after clearing: " + hashSet);

        // 5. Write a Java program to test a hash set is empty or not.
        if (hashSet.isEmpty()) {
            System.out.println("The hash set is empty.");
        } else {
            System.out.println("The hash set is not empty.");
        }

        // 6. Write a Java program to clone a hash set to another hash set.
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Cherry");
        HashSet<String> clonedHashSet = new HashSet<>(hashSet);
        System.out.println("Cloned HashSet: " + clonedHashSet);

        // 7. Write a Java program to convert a hash set into an array.
        String[] arrayFromHashSet = hashSet.toArray(new String[0]);
        System.out.println("Array from HashSet: ");
        for (String element : arrayFromHashSet) {
            System.out.println(element);
        }

        // 8. Write a Java program to convert a hash set into a tree set.
        TreeSet<String> treeSet = new TreeSet<>(hashSet);
        System.out.println("TreeSet from HashSet: " + treeSet);

        // 9. Write a Java program to convert a hash set into a List/ArrayList.
        ArrayList<String> arrayListFromHashSet = new ArrayList<>(hashSet);
        System.out.println("ArrayList from HashSet: " + arrayListFromHashSet);

        // 10. Write a Java program to compare two hash sets.
        HashSet<String> anotherHashSet = new HashSet<>();
        anotherHashSet.add("Apple");
        anotherHashSet.add("Banana");
        anotherHashSet.add("Cherry");
        System.out.println("Are the two hash sets equal? " + hashSet.equals(anotherHashSet));

        // 11. Write a Java program to compare two sets and retain elements which are same on both sets.
        HashSet<String> set1 = new HashSet<>();
        set1.add("Apple");
        set1.add("Banana");
        set1.add("Cherry");
        HashSet<String> set2 = new HashSet<>();
        set2.add("Banana");
        set2.add("Cherry");
        set2.add("Fig");
        set1.retainAll(set2);
        System.out.println("Elements retained in set1 after comparing with set2: " + set1);

        // 12. Write a Java program to remove all elements from a hash set.
        System.out.println("HashSet before removing all elements: " + hashSet);
        hashSet.clear();
        System.out.println("HashSet after removing all elements: " + hashSet);
    }
}
