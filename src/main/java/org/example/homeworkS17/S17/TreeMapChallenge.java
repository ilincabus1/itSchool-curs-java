package org.example.homeworkS17.S17;

import java.util.TreeMap;

public class TreeMapChallenge {
    public static void main(String[] args) {
        // 1. Write a Java program to associate the specified value with the specified key in a tree map.
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("Apple", 1);
        treeMap.put("Banana", 2);
        treeMap.put("Cherry", 3);
        System.out.println("TreeMap after adding elements: " + treeMap);
        treeMap.put("Watermelon", 4);
        System.out.println("TreeMap after adding 'Watermelon': " + treeMap);

        // 2. Write a Java program to copy a Tree Map content to another Tree Map.
        TreeMap<String, Integer> anotherTreeMap = new TreeMap<>();
        anotherTreeMap.putAll(treeMap);
        System.out.println("Another TreeMap after copying elements from the first TreeMap: " + anotherTreeMap);

        // 3. Write a Java program to search a key in a tree map.
        String keyToSearch = "Banana";
        if (treeMap.containsKey(keyToSearch)) {
            System.out.println("The key '" + keyToSearch + "' is present in the TreeMap.");
        } else {
            System.out.println("The key '" + keyToSearch + "' is not present in the TreeMap.");
        }

        // 4. Write a Java program to search a value in a tree map.
        Integer valueToSearch = 2;
        if (treeMap.containsValue(valueToSearch)) {
            System.out.println("The value '" + valueToSearch + "' is present in the TreeMap.");
        } else {
            System.out.println("The value '" + valueToSearch + "' is not present in the TreeMap.");
        }

        // 5. Write a Java program to get all keys from a given tree map.
        System.out.println("Keys in the TreeMap: " + treeMap.keySet());

        // 6. Write a Java program to delete all elements from a given tree map.
        treeMap.clear();
        System.out.println("TreeMap after clearing all elements: " + treeMap);

        // 7. Write a Java program to sort keys in tree map by using Comparator.
        TreeMap<String, Integer> sortedTreeMap = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);
        sortedTreeMap.put("Apple", 1);
        sortedTreeMap.put("banana", 2);
        sortedTreeMap.put("Cherry", 3);
        System.out.println("Sorted TreeMap (case insensitive): " + sortedTreeMap);

        // 8. Write a Java program to get a key-value mapping associated with the greatest key and least key in a tree map.
        String greatestKey = sortedTreeMap.lastKey();
        String leastKey = sortedTreeMap.firstKey();
        System.out.println("Greatest key in the TreeMap: " + greatestKey + " with value: " + sortedTreeMap.get(greatestKey));
        System.out.println("Least key in the TreeMap: " + leastKey + " with value: " + sortedTreeMap.get(leastKey));

        // 9. Write a Java program to get the first (lowest) key and the last (highest) key currently in a tree map.
        String firstKey = sortedTreeMap.firstKey();
        String lastKey = sortedTreeMap.lastKey();
        System.out.println("First key in the TreeMap: " + firstKey);
        System.out.println("Last key in the TreeMap: " + lastKey);

        // 10. Write a Java program to get a reverse order view of the keys contained in a tree map.
        TreeMap<String, Integer> reverseTreeMap = new TreeMap<>(sortedTreeMap.descendingMap());
        System.out.println("Reverse order view of the TreeMap: " + reverseTreeMap);

        // 11. Write a Java program to get a key-value mapping associated with the greatest key less than or equal to a given key in a tree map.
        String givenKey = "banana";
        String greatestKeyLessThanOrEqual = sortedTreeMap.floorKey(givenKey);
        System.out.println("Greatest key less than or equal to '" + givenKey + "': " + greatestKeyLessThanOrEqual + " with value: " + sortedTreeMap.get(greatestKeyLessThanOrEqual));

        // 12. Write a Java program to the greatest key less than or equal to a given key in a tree map.
        String leastKeyGreaterThanOrEqual = sortedTreeMap.ceilingKey(givenKey);
        System.out.println("Least key greater than or equal to '" + givenKey + "': " + leastKeyGreaterThanOrEqual + " with value: " + sortedTreeMap.get(leastKeyGreaterThanOrEqual));

        // 13. Write a Java program to the portion of a map whose keys are strictly less than a given key in a tree map.
        String portionKey = "Cherry";
        TreeMap<String, Integer> portionMap = new TreeMap<>(sortedTreeMap.headMap(portionKey));
        System.out.println("Portion of the TreeMap with keys strictly less than '" + portionKey + "': " + portionMap);

        // 14. Write a Java program to get the portion of this map whose keys are less than (or equal to, if inclusive is true) a given key.
        boolean inclusive = true;
        TreeMap<String, Integer> portionMapInclusive = new TreeMap<>(sortedTreeMap.headMap(portionKey, inclusive));
        System.out.println("Portion of the TreeMap with keys less than or equal to '" + portionKey + "': " + portionMapInclusive);
        inclusive = false;
        TreeMap<String, Integer> portionMapExclusive = new TreeMap<>(sortedTreeMap.headMap(portionKey, inclusive));
        System.out.println("Portion of the TreeMap with keys less than '" + portionKey + "': " + portionMapExclusive);

        // 15. Write a Java program to get the least key strictly greater than the given key. Return null if there is no such key.
        String leastKeyGreaterThan = sortedTreeMap.higherKey(givenKey);
        if (leastKeyGreaterThan != null) {
            System.out.println("Least key strictly greater than '" + givenKey + "': " + leastKeyGreaterThan + " with value: " + sortedTreeMap.get(leastKeyGreaterThan));
        } else {
            System.out.println("There is no key strictly greater than '" + givenKey + "'.");
        }

        // 16. Write a Java program to get a key-value mapping associated with the greatest key strictly less than a given key in a tree map. Return null if there is no such key.
        String greatestKeyLessThan = sortedTreeMap.lowerKey(givenKey);
        if (greatestKeyLessThan != null) {
            System.out.println("Greatest key strictly less than '" + givenKey + "': " + greatestKeyLessThan + " with value: " + sortedTreeMap.get(greatestKeyLessThan));
        } else {
            System.out.println("There is no key strictly less than '" + givenKey + "'.");
        }

        // 17. Write a Java program to get the greatest key strictly less than the given key. Return null if there is no such key.
        String greatestKeyStrictlyLessThan = sortedTreeMap.lowerKey(givenKey);
        if (greatestKeyStrictlyLessThan != null) {
            System.out.println("Greatest key strictly less than '" + givenKey + "': " + greatestKeyStrictlyLessThan);
        } else {
            System.out.println("There is no key strictly less than '" + givenKey + "'.");
        }
    }
}
