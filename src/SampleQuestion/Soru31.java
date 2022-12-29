package SampleQuestion;

import java.util.Arrays;
import java.util.Scanner;

public class Soru31 {
    public static void main(String[] args) {
        /*
        -----------------------------------------------------------------------------------------------------------------
    Soru 31-)
    Kullanıcıdan Arrayin uzunlugunu isteyin.
    Ardından kullanıcıdan Arrayin elemanlarını girmesini isteyin.
    İpucu:  Önce uzunluk alıp arrayi oluştur daha sonra loop ile kullancııya doldurt
    */


Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen arrayin uzunlugunu giriniz");
        int arrLeng= scan.nextInt();
        int[] arr=new int[arrLeng];
        for (int i = 0; i <arr.length; i++) {
            System.out.println("Lutfen bir deger giriniz.");

            arr[i]=scan.nextInt();

        }
        System.out.println(Arrays.toString(arr));

    }
}
