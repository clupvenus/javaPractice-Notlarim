package test.day04;

import java.util.Scanner;

public class Soru4 {
    public static void main(String[] args) {
        // Bir sayinin mükemmel olup olmadiğini bulan bir method yaziniz.
        //        Mükemmel sayi : bir sayinin kendisi hariç bölenlerinin toplamı, kendisine eşitse o sayi mükemmeldir.
        //        ORNEK:
        //        INPUT     : 6
        //        OUTPUT : 1,2,3
        //                      1+2+3 = 6 = 6 (Mükemmel)
        //
        // */
        System.out.println("Bir sayi giriniz.");
        Scanner scan=new Scanner(System.in);
        int sayi=scan.nextInt();
        if(mukemmelSayi(sayi)){
            System.out.println(sayi+" mikemmel sayidir.");
        }else{
            System.out.println(sayi+" mikemmel degildir.");
        }

    }
    public static boolean mukemmelSayi(int sayi){
        int toplam=0;
        for (int i = 1; i < sayi; i++) {
            if(sayi%i==0){
                toplam+=i;
            }

        }
        if(toplam==sayi){
            return true;
        }else
            return false;
    }
}
