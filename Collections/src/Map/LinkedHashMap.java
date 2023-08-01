package Map;

import java.util.Map;

public class LinkedHashMap {
    public static void main(String[] args) {
        // Create
        Map<String, Integer> myMap = new java.util.LinkedHashMap<>();
        myMap.put("apple", 10);
        myMap.put("banana", 5);
        myMap.put("orange", 8);

        // Read
        int quantity = myMap.get("apple");
        System.out.println(quantity); // Output: 10

        // Update
        myMap.put("apple", 15);

        // Delete
        myMap.remove("orange");

        // Get all keys and values
        for (String key : myMap.keySet()) {
            System.out.println(key + ": " + myMap.get(key));
        }
    }
}
