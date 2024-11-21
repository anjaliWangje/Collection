package collectionpreactice;

import java.util.ArrayList;

public class swapping {
    public static void main(String[] args) {
        ArrayList<Integer>number=new ArrayList<Integer>();
        number.add(3);
        number.add(4);
        number.add(5);
        number.add(2);
        number.add(1);
        for(int i=0;i<number.size();i++){
            for(int j=0;j<number.size();j++){
                if(number.get(i)> number.get(j)){
                    int temp=number.get(i);
                    number.set(i,number.get(j));
                    number.set(j,temp);

                }

                }
            }
        System.out.println("sorted number:"+number);


    }
}
