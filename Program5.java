package collectionpreactice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Program5 {
    public static void main(String[] args) {

        ArrayList<String> a1= new ArrayList<String>();
        a1.add("red");
        a1.add("blue");
        a1.add("white");
        a1.add("pink");
        a1.add("black");
        System.out.println("arraylist after swapping");
        for(String aa:a1){
            System.out.println(aa);
        }
        Collections.swap(a1,0,2);
        System.out.println("arraylist list after swapping");
        for(String bb:a1){
            System.out.println(bb);
        }

    }
}
