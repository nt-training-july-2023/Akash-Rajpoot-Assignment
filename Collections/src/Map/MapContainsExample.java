package Map;

import java.util.HashMap;
import java.util.Map;

public class MapContainsExample {
    public static void main(String[] args) {
        // Create a HashMap and add some key-value pairs
        Map<String, Integer> myMap = new HashMap<>();
        myMap.put("apple", 10);
        myMap.put("banana", 20);
        myMap.put("orange", 15);

        // Check if the map contains a specific key
        String keyToCheck = "banana";
        if (myMap.containsKey(keyToCheck)) {
            System.out.println("The key '" + keyToCheck + "' exists in the map.");
        } else {
            System.out.println("The key '" + keyToCheck + "' does not exist in the map.");
        }

        // Check if the map contains a specific value
        int valueToCheck = 15;
        if (myMap.containsValue(valueToCheck)) {
            System.out.println("The value '" + valueToCheck + "' exists in the map.");
        } else {
            System.out.println("The value '" + valueToCheck + "' does not exist in the map.");
        }
    }
}
