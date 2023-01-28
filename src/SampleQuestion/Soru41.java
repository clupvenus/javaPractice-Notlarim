package SampleQuestion;

import java.sql.Array;
import java.util.Arrays;

public class Soru41 {
    public static void main(String[] args) {
        /*
Soru 41-)
Parametre olarak 2 Int Array kabul eden ve 2 Array listesini yeni bir Arraye ekleyen ve yazdıran bir method yazın.
		 * Input1={1,2,3,4}
		 * Input2={5,6}
		 * Çıktı={1,2,3,4,5,6}*/
        int[] input1={1,2,3,4} ;
        int[] input2={5,6};

        IkiArrayToplami(input1,input2);

    }

    private static void IkiArrayToplami(int[] arr1,int[] arr2) {
        int[]toplamArrayi=new int[arr1.length+ arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            toplamArrayi[i]=arr1[i];

        }
        for (int i = 0; i < arr2.length; i++) {
            toplamArrayi[i+ arr1.length]=arr2[i];


        }

        System.out.println(Arrays.toString(toplamArrayi));

        }

    }

