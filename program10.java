package collectionpreactice;

import java.util.ArrayList;
import java.util.Iterator;

public class program10 {
    public static void main(String[] args) {
        ArrayList<String>list=new ArrayList<String>();
        list.add("aboli");
        list.add("shivam");
        list.add("pranali");
        list.add("anjali");
        Iterator<String>iterator= list.iterator();
        while (iterator.hasNext()){
            String name= iterator.next();
        }
        System.out.println(list);
    }
}
