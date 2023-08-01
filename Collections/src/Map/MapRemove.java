package Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapRemove {
    public static void main(String[] args) {
        HashMap<Integer,String> hashContainer = new HashMap<>();
        hashContainer.put(1,"BOB");
        hashContainer.put(2,"ALICE");
        hashContainer.put(4,"SMITH");
        hashContainer.put(5,"RAHUL");

        String valueToRemove = "BOB";
        Iterator<Map.Entry<Integer,String>> it = hashContainer.entrySet().iterator();

        while(it.hasNext()){
            Map.Entry<Integer,String> entry = it.next();
            if(entry.getValue()==valueToRemove){
                it.remove();
            }
        }

        System.out.println(hashContainer);
    }
}
