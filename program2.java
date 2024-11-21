package hashset;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class program2 {
    public static void main(String[] args) {
        HashMap<String,String>map=new HashMap<>();
        map.put("anjali","girl");
        map.put("pranali","girl");
        map.put("aboli","girl");
        Iterator<Map.Entry<String,String>>iterator=map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String,String>entry=iterator.next();
            System.out.println(entry.getKey()+":"+entry.getValue());
        }


    }
}
