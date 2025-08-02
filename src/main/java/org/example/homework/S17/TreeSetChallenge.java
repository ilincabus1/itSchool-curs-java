package org.example.homework.S17;

import java.util.TreeSet;

public class TreeSetChallenge {
    public static void main(String[] args) {
        // 1. Write a Java program to create a TreeSet and add some colors (string) to it, then print out the collection.
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Red");
        treeSet.add("Green");
        treeSet.add("Blue");
        System.out.println("Colors in the TreeSet: " + treeSet);

        // 2. Write a Java program to iterate through all elements in a TreeSet.
        System.out.println("Iterating through TreeSet:");
        for (String color : treeSet) {
            System.out.println("Color: " + color);
        }

        // 3. Write a Java program to add all the elements of a specified tree set to another tree set.
        TreeSet<String> anotherTreeSet = new TreeSet<>();
        anotherTreeSet.add("Yellow");
        anotherTreeSet.add("Purple");
        anotherTreeSet.addAll(treeSet);
        System.out.println("Another TreeSet after adding elements from the first TreeSet: " + anotherTreeSet);

        // 4. Write a Java program to create a reverse order view of the elements contained in a given tree set.
        TreeSet<String> reverseTreeSet = (TreeSet<String>) anotherTreeSet.descendingSet();
        System.out.println("Reverse order view of the TreeSet: " + reverseTreeSet);

        // 5. Write a Java program to get the first and last elements of a tree set.
        String firstElement = anotherTreeSet.first();
        String lastElement = anotherTreeSet.last();
        System.out.println("First element in the TreeSet: " + firstElement);
        System.out.println("Last element in the TreeSet: " + lastElement);

        // 6. Write a Java program to clone a tree set list to another tree set.
        TreeSet<String> clonedTreeSet = new TreeSet<>(anotherTreeSet);
        System.out.println("Cloned TreeSet: " + clonedTreeSet);

        // 7. Write a Java program to get the number of elements in a tree set.
        int size = anotherTreeSet.size();
        System.out.println("Number of elements in the TreeSet: " + size);

        // 8. Write a Java program to compare two tree sets.
        TreeSet<String> treeSet1 = new TreeSet<>();
        treeSet1.add("Apple");
        treeSet1.add("Banana");
        TreeSet<String> treeSet2 = new TreeSet<>();
        treeSet2.add("Apple");
        treeSet2.add("Banana");
        treeSet2.add("Cherry");
        boolean areEqual = treeSet1.equals(treeSet2);
        System.out.println("Are treeSet1 and treeSet2 equal? " + areEqual);

        // 9. Write a Java program to find the numbers less than 7 in a tree set.
        TreeSet<Integer> numberSet = new TreeSet<>();
        numberSet.add(1);
        numberSet.add(3);
        numberSet.add(5);
        numberSet.add(7);
        numberSet.add(9);
        System.out.println("Numbers less than 7 in the TreeSet: ");
        for (Integer number : numberSet.headSet(7)) {
            System.out.println(number);
        }

        // 10. Write a Java program to get the element in a tree set which is greater than or equal to a given element.
        Integer givenElement = 5;
        Integer greaterOrEqualElement = numberSet.ceiling(givenElement);
        System.out.println("Element in the TreeSet greater than or equal to " + givenElement + ": " + greaterOrEqualElement);

        // 11. Write a Java program to get the element in a tree set which is less than or equal to a given element.
        Integer lessOrEqualElement = numberSet.floor(givenElement);
        System.out.println("Element in the TreeSet less than or equal to " + givenElement + ": " + lessOrEqualElement);

        // 12. Write a Java program to get the element in a tree set which is strictly greater than or equal to a given element.
        Integer strictlyGreaterElement = numberSet.higher(givenElement);
        System.out.println("Element in the TreeSet strictly greater than " + givenElement + ": " + strictlyGreaterElement);

        // 13. Write a Java program to get the element in a tree set which is strictly less than the given element.
        Integer strictlyLessElement = numberSet.lower(givenElement);
        System.out.println("Element in the TreeSet strictly less than " + givenElement + ": " + strictlyLessElement);

        // 14. Write a Java program to retrieve and remove the first element of a tree set.
        String removedFirstElement = anotherTreeSet.pollFirst();
        System.out.println("Removed first element from the TreeSet: " + removedFirstElement);
        System.out.println("TreeSet after removing the first element: " + anotherTreeSet);

        // 15. Write a Java program to retrieve and remove the last element of a tree set.
        String removedLastElement = anotherTreeSet.pollLast();
        System.out.println("Removed last element from the TreeSet: " + removedLastElement);
        System.out.println("TreeSet after removing the last element: " + anotherTreeSet);

        // 16. Write a Java program to remove a given element from a tree set.
        String elementToRemove = "Red";
        boolean isRemoved = anotherTreeSet.remove(elementToRemove);
        System.out.println("Was the element '" + elementToRemove + "' removed? " + isRemoved);
        System.out.println("TreeSet after removing '" + elementToRemove + "': " + anotherTreeSet);
    }
}
