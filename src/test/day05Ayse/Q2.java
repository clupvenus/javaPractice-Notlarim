package test.day05Ayse;

import java.util.Arrays;

public class Q2 {
    public static void main(String[] args) {
        //create an array of 5 floats and calculate their som
        Float[] arr=new Float[5];
        arr[0]=3.2f;
        arr[1]=5.56f;
        arr[2]=7.2f;
        arr[3]=12.4f;
        arr[4]=14.56f;
        System.out.println(Arrays.toString(arr));
        //[3.2, 5.56, 7.2, 12.4, 14.56]
        Float toplam=0f;
        for (Float each:arr
             ) {
            toplam+=each;

        }

        System.out.println("5 sayinin toplami: "+toplam);
        //5 sayinin toplami: 42.920002
    }
}
