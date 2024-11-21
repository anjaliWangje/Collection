package collectionpreactice;

import java.util.ArrayList;
import java.util.List;

public class program4 {
    public static void main(String[] args) {
        List<String>aa=new ArrayList<String>();
        aa.add("red");
        aa.add("blue");
        aa.add("pink");
        aa.add("yellow");
        aa.add("skyblue");
        aa.add("brown");
        System.out.println(aa);
        String element=aa.get(1);
        System.out.println("first elmeent:"+element);
        element=aa.get(4);
        System.out.println("fourth elment:"+element);

    }
}
