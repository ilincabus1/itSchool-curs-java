package org.example.homeworkS17;

import java.util.HashMap;

public class HashMapChallenge {
    public static void main(String[] args) {
        // 1. Write a Java program to associate the specified value with the specified key in a hash map.
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Apple", 1);
        hashMap.put("Banana", 2);
        hashMap.put("Cherry", 3);
        System.out.println("HashMap after adding elements: " + hashMap);
        hashMap.put("Watermelon", 4);
        System.out.println("HashMap after adding 'Watermelon': " + hashMap);

        // 2. Write a Java program to count the number of key-value (size) mappings in a hash map.
        System.out.println("Number of key-value mappings in the hash map: " + hashMap.size());

        // 3. Write a Java program to copy all of the mappings from the specified map to another map.
        HashMap<String, Integer> anotherHashMap = new HashMap<>();
        anotherHashMap.putAll(hashMap);
        System.out.println("Another HashMap after copying elements from the first HashMap: " + anotherHashMap);

        // 4. Write a Java program to remove all of the mappings from a hash map.
        hashMap.clear();
        System.out.println("HashMap after clearing all mappings: " + hashMap);

        // 5. Write a Java program to check whether a map contains key-value mappings (empty) or not.
        if (anotherHashMap.isEmpty()) {
            System.out.println("The anotherHashMap is empty.");
        } else {
            System.out.println("The anotherHashMap is not empty.");
        }

        // 6. Write a Java program to get a shallow copy of a HashMap instance.
        HashMap<String, Integer> shallowCopy = new HashMap<>(anotherHashMap);
        System.out.println("Shallow copy of anotherHashMap: " + shallowCopy);

        // 7. Write a Java program to test if a map contains a mapping for the specified key.
        String keyToCheck = "Apple";
        if (anotherHashMap.containsKey(keyToCheck)) {
            System.out.println("The key '" + keyToCheck + "' is present in the anotherHashMap.");
        } else {
            System.out.println("The key '" + keyToCheck + "' is not present in the anotherHashMap.");
        }

        // 8. Write a Java program to test if a map contains a mapping for the specified value.
        Integer valueToCheck = 2;
        if (anotherHashMap.containsValue(valueToCheck)) {
            System.out.println("The value '" + valueToCheck + "' is present in the anotherHashMap.");
        } else {
            System.out.println("The value '" + valueToCheck + "' is not present in the anotherHashMap.");
        }

        // 9. Write a Java program to create a set view of the mappings contained in a map.
        System.out.println("Set view of the mappings in anotherHashMap: " + anotherHashMap.entrySet());

        // 10. Write a Java program to get the value of a specified key in a map.
        String keyToGet = "Banana";
        Integer value = anotherHashMap.get(keyToGet);
        System.out.println("The value for the key '" + keyToGet + "' is: " + value);

        // 11. Write a Java program to get a set view of the keys contained in a map.
        System.out.println("Set view of the keys in anotherHashMap: " + anotherHashMap.keySet());

        // 12. Write a Java program to get a collection view of the values contained in this map.
        System.out.println("Collection view of the values in anotherHashMap: " + anotherHashMap.values());
    }
}
