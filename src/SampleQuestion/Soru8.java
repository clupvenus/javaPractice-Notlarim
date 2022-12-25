package SampleQuestion;

import java.util.Scanner;

public class Soru8 {
    public static void main(String[] args) {
       //Soru-8)  Kullanicidan üc basamaklı bir sayı alin.
        //               Kullanicidan alinan bu sayinin basamaklari toplamini ekranda yazdirin.
        //ipuclari:
        //Matematiksel Islemler konusuna bakalim. Bölme islemi kullanarak sayinin
        // basamaklarini alalim ve toplam adli bir konteynira (Variable) atalim.
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen uc basamakli bir sayi giriniz.");
        int sayi=scan.nextInt();//385
        int top=(sayi%10)+((sayi/10)%10)+(sayi/100);
        System.out.println("uc basamakli sayinin toplami : "+top);
    }
}
