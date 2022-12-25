package SampleQuestion;

import java.util.Scanner;

public class Soru4 {
    public static void main(String[] args) {
        //Soru 4-)   SCANNER
        //Kullanıcıdan bir sayı alın ve aldiginiz bu sayının küpünün yarısını konsola yazdırin.
        //Ipuclari:
        //* Sayinin küpü: sayi*sayi*sayi
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir sayi girin.");
        int sayi=5;
        int sayininKupu=(sayi*sayi*sayi)/2;
        System.out.println(sayininKupu);

    }
}
