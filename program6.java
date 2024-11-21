package collectionpreactice;

import java.util.ArrayList;
import java.util.Iterator;

public class program6 {
    public static void main(String[] args) {
        ArrayList<String>tdit=new ArrayList<String>();

        tdit.add("apppple");
        tdit.add("banana");
        tdit.add("graps");
        tdit.add("cherry");
        Iterator<String>iterator=tdit.iterator();
        while(iterator.hasNext()){
            String fruit= iterator.next();
            if(fruit.equals("banana")){
                iterator.remove();
            }
        }
        System.out.println(tdit);


    }
}
