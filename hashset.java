package hashset;

import java.util.HashSet;
import java.util.Iterator;

public class hashset {
    public static void main(String[] args) {
        HashSet<String> hset= new HashSet<String>();
        hset.add("red");
        hset.add("white");
        hset.add("blue");
        hset.add("black");
        hset.add("pink");
        hset.add("brown");
        Iterator<String>p=hset.iterator();
        while(p.hasNext()){
            System.out.println(p.next());
        }


    }
}
