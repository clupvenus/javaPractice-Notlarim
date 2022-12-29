package SampleQuestion;

import java.util.Arrays;

public class Soru33 {
    public static void main(String[] args) {
        /*
                ------------------------------------------------------------------------------------------------------------------
    Soru 33-)
    Array kullanarak String bir cümleyi Reverse eden (tersine çeviren) bir Java programı yazın (boşluklar ve özel karakterler dahil).
    Örnek:
    String str=''Kodlama harika.''
    String arr[]: ".etaerg si gnidoC"
    İpucu: Önce Split kullanarak Arraye çevirin ardından Loop kullanarak son karakterden başlayıp tersten yazdırın
    */

        String str="Kodlama harika.";
        String[] arr=str.split("");
        String[] tersArr=new String[arr.length];
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length ; i++){

                tersArr[i]=arr[arr.length-1-i];


        }

        for (int i = 0; i <tersArr.length ; i++) {
            System.out.print(tersArr[i]);


        }
        System.out.println("");
        System.out.println(Arrays.toString(tersArr));
    }
}
