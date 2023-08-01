package Map;

import java.util.HashMap;
import java.util.Map;

public class MapHandler {
    HashMap<String,Integer> map ;
    int threshold;
    public MapHandler(int threshold) {
        map = new HashMap<>();
        this.threshold = threshold;
    }
    public void addElement(String key,Integer value){
        checkAndClear();
        map.put(key, value);

    }
    public void checkAndClear(){
        if(map.size() >= threshold){
            System.out.println("Elements of maps are as follows");
            for(Map.Entry<String,Integer> element: map.entrySet()){
                System.out.println(element.getKey() + " " + element.getValue());
                map.clear();
            }
        }
    }
    public static void main(String[] args) {
        int thresholdSize = 5;
        MapHandler handler = new MapHandler(thresholdSize);
        try{
            handler.addElement("One", 1);
            handler.addElement("Two", 2);
            handler.addElement("Three", 3);
            handler.addElement("Four", 4);
            handler.addElement("Five", 5);
            handler.addElement("Six", 6); // This will trigger the map to be cleared
            handler.addElement("Seven", 7);
            handler.addElement("Eight", 8);
        }catch (Exception ex){

        }

    }


}
