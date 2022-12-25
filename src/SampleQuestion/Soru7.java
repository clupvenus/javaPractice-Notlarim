package SampleQuestion;

import java.util.Scanner;

public class Soru7 {
    public static void main(String[] args) {
      //Soru 7-)  Kullanicidan Double türünde bir sayi alin. Alinan bu sayiyi tam sayiya cevirerek konsolda yazdirin.
        //(Istege bagli) Float degerinde bir sayi alin bu sayiyi da short degisken türünde bir sayiya döndürün
        //ipuclari:
        //Data Casting konusuna bakiniz. Auto Widening ve Explicit Narrowing konularini hatirlayalim.
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz.");
        float sayi= scan.nextFloat();
        short yeniSayi=(short) sayi;
        System.out.println(yeniSayi);



        /*
        double sayi= scan.nextDouble();
        int yeniSayi=(int)sayi;
        System.out.println(yeniSayi);*/


    }
}
