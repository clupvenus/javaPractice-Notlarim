package test.day03;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Q2_bolmeOperatoruKullanmadanBolme {
    public static void main(String[] args) {
        //Kullanicidan bolunen ve bolen seklinde 2 sayi alalim ve bolme operatoru
        //// kullanmadan bolme islemini gerceklestirip bolumu hesaplayan method create ediniz.
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bolmek istediginiz sayiyi giriniz");
        int bolunen=scan.nextInt();
        System.out.println("Lutfen bolen sayiyi giriniz.");
        int bolen=scan.nextInt();
        System.out.println(bol(bolunen, bolen));

    }

    public static int bol(int bolunen, int bolen){
    int bolum=0;
    while(bolunen>=bolen){
     bolunen-=bolen;
     bolum++;
     //her cikardigimizda bolum bir artar.

    }

    return bolum;


    }
}
