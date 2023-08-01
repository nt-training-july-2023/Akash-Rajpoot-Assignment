package Map;

import java.util.HashMap;
import java.util.Map;

public class MapPrintKeysAndValuesExample {
    public static void main(String[] args) {
        // Create a HashMap and add some key-value pairs
        Map<String, Integer> myMap = new HashMap<>();
        myMap.put("apple", 10);
        myMap.put("banana", 20);
        myMap.put("orange", 15);


        System.out.println("Keys in the map:");
        for (String key : myMap.keySet()) {
            System.out.println(key);
        }


        System.out.println("Values in the map:");
        for (int value : myMap.values()) {
            System.out.println(value);
        }
    }
}
