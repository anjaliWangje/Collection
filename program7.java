package collectionpreactice;

import java.util.ArrayList;
import java.util.Iterator;

public class program7 {
    public static void main(String[] args) {
        ArrayList<String>list=new ArrayList<String>();
        list.add("anjali");
        list.add("shivam");
        list.add("aboli");
        list.add("prnali");
        Iterator<String>iterator= list.iterator();
        while (iterator.hasNext()){
            String name=iterator.next();
            list.remove(name);
        }
        System.out.println(list);
    }
}
