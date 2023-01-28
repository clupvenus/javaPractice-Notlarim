package test.day05Ayse;

import java.util.ArrayList;
import java.util.List;

public class Q1 {
    public static void main(String[] args) {
        /*
        iki array arasinda ayni olan elemanlari bir liste ekleyen program yaziniz
       (buyuk kucuk harf onemsiz)

       input: {"John","Brad","Ange","Sofia","Emily"}
       input2: {"Sofia", "Brad","Grace","Emily","Hazel"}

       Outpu:[sofia,brad,emily]


         */
      String[]  input={"John","Brad","Ange","Sofia","Emily"};
       String[] input2= {"Sofia", "Brad","Grace","Emily","Hazel"};

       arrayKarsilastir(input,input2);
       //[Brad, Sofia, Emily]

    }

    private static void arrayKarsilastir(String[]arr,String[]arr2) {
           List<String> stringList=new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
               if( arr[i].equalsIgnoreCase(arr2[j])){
                   stringList.add(arr[i]);
               }

            }

        }
        System.out.println(stringList);


    }
}
