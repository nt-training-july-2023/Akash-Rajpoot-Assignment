package Map;

import com.sun.jdi.Value;

import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        // Creation
        HashMap<String,Integer> map = new HashMap();
        //Values
        map.put("Orange",10);
        map.put("Apple",30);
        map.put("Banana",90);
        map.put("Kiwi",10);
        //READ
        int quantity = map.get("Apple");
        //UPDATE
        map.put("apple",20);
        //DELETE
        map.remove("Orange");

        for(String value : map.keySet()){
            System.out.println(value);
        }
    }
}
