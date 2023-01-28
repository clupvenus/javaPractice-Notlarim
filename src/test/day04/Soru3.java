package test.day04;

import java.util.Scanner;

public class Soru3 {
    public static void main(String[] args) {
        //Girilen bir stringdeki a harfi sayısını bulunuz. ama c harfine gelirse
        // * döngüden çıkılsın
        // *
        // * Bugün hava oldukca güzel.-> 2
        // *

        Scanner scan=new Scanner(System.in);
        System.out.println("Bir cumle giriniz.");
        int sayac=0;
        String cumle=scan.nextLine().toUpperCase();
        for (int i = 0; i < cumle.length(); i++) {
            if(cumle.charAt(i)=='A'){
                sayac++;
            }if(cumle.charAt(i)=='C'){
                break;
            }

        }
        System.out.println(cumle+"-->"+sayac);

    }

}
