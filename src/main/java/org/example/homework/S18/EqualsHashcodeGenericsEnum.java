package org.example.homework.S18;

import java.awt.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class EqualsHashcodeGenericsEnum {
    public static void main(String[] args) {

        // 1. Implement the equals() and hashCode() methods for a Rectangle class with width and height fields. Test that two instances with the same width and height return true for equals() and have the same hashCode().
        Rectangle rect1 = new Rectangle(5, 10);
        Rectangle rect2 = new Rectangle(5, 10);
        Rectangle rect3 = new Rectangle(3, 6);

        System.out.println("rect1 equals rect2: " + rect1.equals(rect2)); // should return true
        System.out.println("rect1's hashCode is equal to rect2's hashCode: " + (rect1.hashCode() == rect2.hashCode())); // should return true
        System.out.println("rect1 equals rect3: " + rect1.equals(rect3)); // should return false
        System.out.println("rect1's hashCode is equal to rect3's hashCode: " + (rect1.hashCode() == rect3.hashCode())); // should return false

        // 2. Create a Person class with name, age and email fields. Implement the equals() method to check only the name and age fields. Implement the hashCode() method to use the name and age fields to calculate the hashCode. Test that two instances with the same name and age return true for equals() and have the same hashCode().
        Person person = new Person("Matthew", 28, "matthew.doe@jobs.com");
        Person person2 = new Person("Matthew", 28, "matthew.gane.com");
        Person person3 = new Person("John", 39, "john.doe@jobs.com");
        System.out.println("person equals person2: " + person.equals(person2)); // should return true
        System.out.println("person's hashCode is equal to person2's hashCode: " + (person.hashCode() == person2.hashCode())); // should return true
        System.out.println("person equals person3: " + person.equals(person3)); // should return false
        System.out.println("person's hashCode is equal to person3's hashCode: " + (person.hashCode() == person3.hashCode())); // should return false

        // 3. Create a Student class with name, age, studentId, and email fields. Implement the equals() method to check all fields except the studentId. Implement the hashCode() method to use all fields except the studentId to calculate the hash code. Test that two instances with the same name, age, and email return true for equals() and have the same hash code.
        Student student1 = new Student("Amelia", 21, 123456, "amelia.jane@uni.com");
        Student student2 = new Student("Amelia", 21, 123456, "amelia.jane@uni.com");
        Student student3 = new Student("Zoe", 29, 678678, "zoe.deschanel@uni.com");
        System.out.println("student1 equals student2: " + student1.equals(student2)); // should return true
        System.out.println("student1's hashCode is equal to student2's hashCode: " + (student1.hashCode() == student2.hashCode())); // should return true
        System.out.println("student1 equals student3: " + student1.equals(student3)); // should return false
        System.out.println("student1's hashCode is equal to student3's hashCode: " + (student1.hashCode() == student3.hashCode())); // should return false

        // 4. Create a Song class with title, artist and length fields. Implement the equals() method to check only the title and artist fields. Implement the hashCode() method to use the title and artist fields to calculate the hash code. Test that two instances with the same title and artist return true for equals() and have the same hash code.
        Song song1 = new Song("Shape of You", "Ed Sheeran", 3.53);
        Song song2 = new Song("Shape of You", "Ed Sheeran", 3.53);
        Song song3 = new Song("Blinding Lights", "The Weeknd", 3.20);
        System.out.println("song1 equals song2: " + song1.equals(song2)); // should return true
        System.out.println("song1's hashCode is equal to song2's hashCode: " + (song1.hashCode() == song2.hashCode())); // should return true
        System.out.println("song1 equals song3: " + song1.equals(song3)); // should return false
        System.out.println("song1's hashCode is equal to song3's hashCode: " + (song1.hashCode() == song3.hashCode())); // should return false

        // 5. Create a Product class with nane, price and id fields. Implement the equals() method to check only the id field. Implement the hashCode() method to use the id field to calculate the hash code. Test that two instances with the same id return true for equals() and have the same hash code. Then change the id of one instance and test that they are no longer equal and have different hash codes.
        Product product1 = new Product("Laptop", 999.99, "P12345");
        Product product2 = new Product("Laptop", 999.99, "P12345");
        Product product3 = new Product("Smartphone", 499.99, "P67890");
        System.out.println("product1 equals product2: " + product1.equals(product2)); // should return true
        System.out.println("product1's hashCode is equal to product2's hashCode: " + (product1.hashCode() == product2.hashCode())); // should return true
        System.out.println("product1 equals product3: " + product1.equals(product3)); // should return false
        System.out.println("product1's hashCode is equal to product3's hashCode: " + (product1.hashCode() == product3.hashCode())); // should return false
        // Changing the id of product1
        product1 = new Product("Laptop", 999.99, "P54321");
        System.out.println("After changing product1's id:");
        System.out.println("product1 equals product2: " + product1.equals(product2)); // should return false
        System.out.println("product1's hashCode is equal to product2's hashCode: " + (product1.hashCode() == product2.hashCode())); // should return false

        // 6. Create an enum called LightColor that represents the three colors of a traffic light: red, yellow and green. Each color should have a string representation and a duration (in seconds) associated with it (e.g. Red = "Stop", 30 seconds; Yellow = "Caution", 5 seconds; Green = "Go", 45 seconds).
        enum LightColor {
            RED("Stop", 30),
            YELLOW("Caution", 5),
            GREEN("Go", 45);

            private final String action;
            private final int duration;

            LightColor(String action, int duration) {
                this.action = action;
                this.duration = duration;
            }

            public String getAction() {
                return action;
            }

            public int getDuration() {
                return duration;
            }
        }

        // 7. Given a list of objects representing database entities with fields such as id, name, and timestamp, ensure that no two entities are considered equal if their id fields are different.
        class DatabaseEntity {
            private final String id;
            private final String name;
            private final long timestamp;

            public DatabaseEntity(String id, String name, long timestamp) {
                this.id = id;
                this.name = name;
                this.timestamp = timestamp;
            }

            @Override
            public boolean equals(Object obj) {
                if (this == obj) return true;
                if (!(obj instanceof DatabaseEntity)) return false;
                DatabaseEntity entity = (DatabaseEntity) obj;
                return id.equals(entity.id);
            }

            @Override
            public int hashCode() {
                return id.hashCode();
            }
        }
        DatabaseEntity entity1 = new DatabaseEntity("E001", "Entity One", System.currentTimeMillis());
        DatabaseEntity entity2 = new DatabaseEntity("E001", "Entity Two", System.currentTimeMillis() + 1000);
        DatabaseEntity entity3 = new DatabaseEntity("E002", "Entity Three", System.currentTimeMillis() + 2000);
        System.out.println("entity1 equals entity2: " + entity1.equals(entity2)); // should return true
        System.out.println("entity1's hashCode is equal to entity2's hashCode: " + (entity1.hashCode() == entity2.hashCode())); // should return true
        System.out.println("entity1 equals entity3: " + entity1.equals(entity3)); // should return false
        System.out.println("entity1's hashCode is equal to entity3's hashCode: " + (entity1.hashCode() == entity3.hashCode())); // should return false

        // 8. Simulate a cache where objects are stored. Objects with the same hashcode should overwrite existing objects in the cache. Consider how would you design the hashcode method to facilitate this.
        class CacheObject {
            private final String key;
            private final String value;

            public CacheObject(String key, String value) {
                this.key = key;
                this.value = value;
            }

            @Override
            public boolean equals(Object obj) {
                if (this == obj) return true;
                if (!(obj instanceof CacheObject)) return false;
                CacheObject cacheObject = (CacheObject) obj;
                return key.equals(cacheObject.key);
            }

            @Override
            public int hashCode() {
                return key.hashCode();
            }
        }
        Map<Integer, CacheObject> cache = new HashMap<>();
        CacheObject cacheObject1 = new CacheObject("key1", "value1");
        CacheObject cacheObject2 = new CacheObject("key1", "value2"); // Same key, different value
        cache.put(cacheObject1.hashCode(), cacheObject1);
        cache.put(cacheObject2.hashCode(), cacheObject2); // This will overwrite the previous entry
        System.out.println("Cache size after adding two objects with the same key: " + cache.size()); // should return 1
        System.out.println("Cache contains key1: " + cache.containsKey(cacheObject1.hashCode())); // should return true
        System.out.println("Cache contains key2: " + cache.containsKey(cacheObject2.hashCode())); // should return true

        // 9. Create a method that returns a JSON representation of an object. The method should make use of the toString method to facilitate this.
        class JsonObject {
            private final String name;
            private final int age;

            public JsonObject(String name, int age) {
                this.name = name;
                this.age = age;
            }

            @Override
            public String toString() {
                return "{" +
                        "\"name\":\"" + name + "\"," +
                        "\"age\":" + age +
                        "}";
            }
        }
        JsonObject jsonObject = new JsonObject("Alice", 30);
        System.out.println("JSON representation of jsonObject: " + jsonObject.toString()); // should return {"name":"Alice","age":30}

        // 10. Implement the toString method in a class holding a large dataset to print a "summary" version of the dataset, facilitating debugging and logging.
        class LargeDataset {
            private final String datasetName;
            private final int recordCount;
            private final String description;

            public LargeDataset(String datasetName, int recordCount, String description) {
                this.datasetName = datasetName;
                this.recordCount = recordCount;
                this.description = description;
            }

            @Override
            public String toString() {
                return "LargeDataset{" +
                        "datasetName='" + datasetName + '\'' +
                        ", recordCount=" + recordCount +
                        ", description='" + description + '\'' +
                        '}';
            }
        }
        LargeDataset largeDataset = new LargeDataset("Sales Data", 1000000, "Monthly sales data for the year 2023");
        System.out.println("Summary of largeDataset: " + largeDataset.toString());

        // 11. Create a generic method to swap the positions of two elements in an array.
        Integer[] intArray = {1, 2, 3, 4, 5};
        System.out.println("Array before swap: " + Arrays.toString(intArray));
        SwapElements.swapElements(intArray, 1, 3);
        System.out.println("Array after swap: " + Arrays.toString(intArray));
        String[] strArray = {"A", "B", "C", "D", "E"};
        System.out.println("String array before swap: " + Arrays.toString(strArray));
        SwapElements.swapElements(strArray, 0, 4);
        System.out.println("String array after swap: " + Arrays.toString(strArray));

        // 12. Create a class Pair which can hold a pair of objects, the objects can be of any type.
        class Pair<T, U> {
            private final T first;
            private final U second;

            public Pair(T first, U second) {
                this.first = first;
                this.second = second;
            }

            public T getFirst() {
                return first;
            }

            public U getSecond() {
                return second;
            }

            @Override
            public String toString() {
                return "Pair{" +
                        "first=" + first +
                        ", second=" + second +
                        '}';
            }
        }
        Pair<String, Integer> pair1 = new Pair<>("One", 1);
        Pair<Double, String> pair2 = new Pair<>(3.14, "Pi");
        System.out.println("Pair1: " + pair1); // should return Pair{first=One, second=1}
        System.out.println("Pair2: " + pair2); // should return Pair{first=3.14, second=Pi}

        // 13. Create a day scheduler application that uses an enum to represent the days of the week. The application should be able to assign and retrieve activities for each day.
        DayScheduler scheduler = new DayScheduler();

        scheduler.assignActivity(DayOfWeek.MONDAY, "Gym");
        scheduler.assignActivity(DayOfWeek.TUESDAY, "Work on project");
        scheduler.assignActivity(DayOfWeek.FRIDAY, "Movie night");

        System.out.println("Monday: " + scheduler.getActivity(DayOfWeek.MONDAY));
        System.out.println("Tuesday: " + scheduler.getActivity(DayOfWeek.TUESDAY));
        System.out.println("Wednesday: " + scheduler.getActivity(DayOfWeek.WEDNESDAY));
        System.out.println("Friday: " + scheduler.getActivity(DayOfWeek.FRIDAY));

        // 14. Create a simulation of a traffic light system using an enum to represent the different states of a traffic light.
        for (LightColor color : LightColor.values()) {
            System.out.println("Traffic Light Color: " + color.name() +
                    ", Action: " + color.getAction() +
                    ", Duration: " + color.getDuration() + " seconds");
        }

        // 15. Create a generic repository class for storing objects. The repository should use a HashMap internally. Override equals and hashcode methods to ensure the correct behavior of the repository.
        class GenericRepository<T> {
            private final Map<Integer, T> repository;

            public GenericRepository() {
                this.repository = new HashMap<>();
            }

            public void add(T item) {
                repository.put(item.hashCode(), item);
            }

            public T get(int hashCode) {
                return repository.get(hashCode);
            }

            @Override
            public boolean equals(Object obj) {
                if (this == obj) return true;
                if (!(obj instanceof GenericRepository)) return false;
                GenericRepository<?> that = (GenericRepository<?>) obj;
                return repository.equals(that.repository);
            }

            @Override
            public int hashCode() {
                return repository.hashCode();
            }
        }
        GenericRepository<String> stringRepository = new GenericRepository<>();
        stringRepository.add("Hello");
        stringRepository.add("World");
        System.out.println("String Repository contains 'Hello': " + (stringRepository.get("Hello".hashCode()) != null)); // should return true
        System.out.println("String Repository contains 'World': " + (stringRepository.get("World".hashCode()) != null)); // should return true

        // 17. Extend an enum representing car types to include properties such as average price and manufacturer. Override the toString method to provide a descriptive string representing each enum constant.
        enum CarType {
            SEDAN("Sedan", 30000, "Toyota"),
            SUV("SUV", 40000, "Ford"),
            TRUCK("Truck", 50000, "Chevrolet");

            private final String type;
            private final int averagePrice;
            private final String manufacturer;

            CarType(String type, int averagePrice, String manufacturer) {
                this.type = type;
                this.averagePrice = averagePrice;
                this.manufacturer = manufacturer;
            }

            @Override
            public String toString() {
                return "CarType{" +
                        "type='" + type + '\'' +
                        ", averagePrice=" + averagePrice +
                        ", manufacturer='" + manufacturer + '\'' +
                        '}';
            }
        }
    }
}

class DayScheduler {
    private final Map<DayOfWeek, String> activities;

    public DayScheduler() {
        activities = new HashMap<>();
    }

    public void assignActivity(DayOfWeek day, String activity) {
        activities.put(day, activity);
    }

    public String getActivity(DayOfWeek day) {
        return activities.getOrDefault(day, "No activity assigned");
    }

}

