package org.example.homeworkS17;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListChallenge {
    public static void main(String[] args) {
        // 1. Write a Java program to create new array list, add some colors (string) and print out the collection.
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        System.out.println("Colors in the list: " + colors);

        // 2. Write a Java program to iterate through all elements in an array list.
        for(String color: colors) {
            System.out.println("Color: " + color);
        }
        // 3. Write a Java program to insert an element into the array list at the first position.
        colors.add(0, "Black");
        System.out.println(colors);

        // 4. Write a Java program to retrieve an element (at a specified index) from a given array list.
        System.out.println("Element at index 3: " + colors.get(3));

        // 5. Write a Java program to update specific array element by given element.
        colors.set(2, "Purple");
        System.out.println("Updated colors: " + colors);

        // 6. Write a Java program to remove the third element from an array list.
        colors.remove(2);
        System.out.println("Colors after removing the third element: " + colors);

        // 7. Write a Java program to search an element in an array list.
        String search = "Blue";
        if(colors.contains(search)) {
            System.out.println("The color " + search + " is in the list.");
        } else {
            System.out.println("The color " + search + " is not in the list.");
        }

        // 8. Write a Java program to sort a given array list.
        Collections.sort(colors);
        System.out.println("Sorted colors in alphabetical order: " + colors);

        // 9. Write a Java program to copy one array list into another.
        ArrayList<String> copiedColors = new ArrayList<>(colors); // creates a new ArrayList and copies the elements from colors
        System.out.println("Copied colors: " + copiedColors);

        // 10. Write a Java program to shuffle elements in an array list.
        Collections.shuffle(colors);
        System.out.println("Shuffled colors: " + colors);

        // 11. Write a Java program to reverse elements in an array list.
        Collections.reverse(colors);
        System.out.println("Reversed colors: " + colors);

        // 12. Write a Java program to extract a portion of an array list.
        ArrayList<String> subList = new ArrayList<>(colors.subList(0, 2)); // extracts elements from index 1 to 2
        System.out.println("Sublist of colors from index 1 to 2: " + subList);

        // 13. Write a Java program to compare two array lists.
        ArrayList<String> anotherColors = new ArrayList<>();
        anotherColors.add("Red");
        anotherColors.add("Green");
        anotherColors.add("Blue");
        anotherColors.add("Yellow");
        System.out.println("Are the two color lists equal? " + colors.equals(anotherColors));

        // 14. Write a Java program to swap two elements in an array list.
        Collections.swap(colors, 0, 1); // swaps the first and second elements
        System.out.println("Colors after swapping first and second elements: " + colors);

        // 15. Write a Java program to join two array lists.
        ArrayList<String> moreColors = new ArrayList<>();
        moreColors.add("Pink");
        moreColors.add("Orange");
        colors.addAll(moreColors); // joins moreColors to colors
        System.out.println("Colors after joining with more colors: " + colors);

        // 16. Write a Java program to clone an array list to another array list.
        ArrayList<String> clonedColors = (ArrayList<String>) colors.clone(); // clones the colors list
        System.out.println("Cloned colors: " + clonedColors);

        // 17. Write a Java program to empty an array list.
        colors.clear(); // removes all elements from the list
        System.out.println("Colors after clearing the list: " + colors);

        // 18. Write a Java program to test an array list is empty or not.
        if(colors.isEmpty()) {
            System.out.println("The colors list is empty.");
        } else {
            System.out.println("The colors list is not empty.");
        }

        // 19. Write a Java program to trim the capacity of an array list to the current list size.
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        ArrayList<String> trimmedColors = new ArrayList<>(colors);
        trimmedColors.trimToSize(); // trims the capacity to the current size
        System.out.println("Trimmed colors: " + trimmedColors);

        // 20. Write a Java program to increase the size of an array list.
        ArrayList<String> increasedColors = new ArrayList<>(colors);
        increasedColors.ensureCapacity(10); // increases the capacity to 10
        System.out.println("Increased colors capacity: " + increasedColors.size() + " (capacity is now 10)");
        // Note: ArrayList in Java automatically increases its size when needed, so ensureCapacity is not always necessary.

    }
}
