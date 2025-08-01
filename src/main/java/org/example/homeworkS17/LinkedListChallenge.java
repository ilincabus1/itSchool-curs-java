package org.example.homeworkS17;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListChallenge {
    public static void main(String[] args) {
        // 1. Write a Java program to append the specified element to the end of a linked list.
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Cherry");
        System.out.println("Linked List after adding elements: " + linkedList);
        linkedList.add("Watermelon");
        System.out.println("Linked List after appending 'Watermelon': " + linkedList);

        // 2. Write a Java program to iterate through all elements in a linked list.
        System.out.println("Iterating through linked list:");
        for (String fruit : linkedList) {
            System.out.println("Fruit: " + fruit);
        }

        // 3. Write a Java program to iterate through all elements in a linked list starting at the specified position.
        System.out.println("Iterating through linked list starting at index 1:");
        for (int i = 1; i < linkedList.size(); i++) {
            System.out.println("Fruit at index " + i + ": " + linkedList.get(i));
        }

        // 4. Write a Java program to iterate a linked list in reverse order.
        System.out.println("Iterating through linked list in reverse order:");
        for (int i = linkedList.size() - 1; i >= 0; i--) {
            System.out.println("Fruit at index " + i + ": " + linkedList.get(i));
        }

        // 5. Write a Java program to insert the specified element at the specified position in a linked list.
        linkedList.add(2, "Orange");
        System.out.println("Linked List after inserting 'Orange' at index 2: " + linkedList);

        // 6. Write a Java program to insert elements into the linked list at the first and last position.
        linkedList.addFirst("Grapes");
        linkedList.addLast("Pineapple");
        System.out.println("Linked List after adding 'Grapes' at the first position and 'Pineapple' at the last position: " + linkedList);

        //7. Write a Java program to insert the specified element at the front of a linked list.
        linkedList.addFirst("Strawberry");
        System.out.println("Linked List after adding 'Strawberry' at the front: " + linkedList);

        // 8. Write a Java program to insert the specified element at the end of a linked list.
        linkedList.addLast("Kiwi");
        System.out.println("Linked List after adding 'Kiwi' at the end: " + linkedList);

        // 9. Write a Java program to insert some elements at the specified position into a linked list.
        linkedList.add(3, "Mango");
        linkedList.add(3, "Peach");
        System.out.println("Linked List after inserting 'Mango' and 'Peach' at index 3: " + linkedList);

        // 10. Write a Java program to get the first and last occurence of the specified elements in a linked list.
        String firstElement = linkedList.getFirst();
        String lastElement = linkedList.getLast();
        System.out.println("First element in the linked list: " + firstElement);
        System.out.println("Last element in the linked list: " + lastElement);

        // 11. Write a Java program to display the elements and their positions in a linked list.
        System.out.println("Elements and their positions in the linked list:");
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println("Element at index " + i + ": " + linkedList.get(i));
        }

        // 12. Write a Java program to remove a specified element from a linked list.
        linkedList.remove("Banana");
        System.out.println("Linked List after removing 'Banana': " + linkedList);

        // 13. Write a Java program to remove the first and last elements from a linked list.
        linkedList.removeFirst();
        linkedList.removeLast();
        System.out.println("Linked List after removing the first and last elements: " + linkedList);

        // 14. Write a Java program to remove all elements from a linked list.
        linkedList.clear();
        System.out.println("Linked List after clearing all elements: " + linkedList);

        // 15. Write a Java program to swap two elements in a linked list.
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Cherry");
        System.out.println("Linked List before swapping: " + linkedList);
        Collections.swap(linkedList, 0, 1);
        System.out.println("Linked List after swapping first and second elements: " + linkedList);

        // 16. Write a Java program to shuffle the elements in a linked list.
        Collections.shuffle(linkedList);
        System.out.println("Linked List after shuffling: " + linkedList);

        // 17. Write a Java program to join two linked lists.
        LinkedList<String> anotherLinkedList = new LinkedList<>();
        anotherLinkedList.add("Orange");
        anotherLinkedList.add("Pineapple");
        linkedList.addAll(anotherLinkedList);
        System.out.println("Linked List after joining with another linked list: " + linkedList);

        // 18. Write a Java program to clone a linked list to another linked list.
        LinkedList<String> clonedLinkedList = (LinkedList<String>) linkedList.clone();
        System.out.println("Cloned Linked List: " + clonedLinkedList);

        // 19. Write a Java program to remove and return the first element of a linked list.
        String removedFirstElement = linkedList.removeFirst();
        System.out.println("Removed first element: " + removedFirstElement);
        System.out.println("Linked List after removing the first element: " + linkedList);

        // 20. Write a Java program to retrieve but does not remove the first element of a linked list.
        String firstElementRetrieved = linkedList.getFirst();
        System.out.println("First element retrieved without removal: " + firstElementRetrieved);
    }
}
