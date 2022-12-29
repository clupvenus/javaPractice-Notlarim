package SampleQuestion;

import java.util.Arrays;
import java.util.Scanner;

public class Soru32 {
    /*------------------------------------------------------------------------------------------------------------------
    Soru 32-)
    Kullanıcıdan alacagınız bilgilerle oluşturdugunuz bir Integer Array dizesini Reverse olarak (tersten) yazdırınız.
    İpucu:  int arrReverse[] diye bir array oluşturun ve kullancıya oluşturdugunuz arrayi buna tersten assign edin...
        */

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen arrayin uzunlugunu giriniz");
        int arrLeng= scan.nextInt();
        int[] arr=new int[arrLeng];
        for (int i = 0; i <arr.length; i++) {
            System.out.println("Lutfen bir deger giriniz.");

            arr[i]=scan.nextInt();

        }
        int[] tersArr=new int[arr.length];
        for (int i = arr.length-1; i >=0 ; i--) {
            for (int j = 0; j < arrLeng; j++) {
                tersArr[j]=arr[i];

            }

        }
        System.out.println(Arrays.toString(tersArr));
    }

}
