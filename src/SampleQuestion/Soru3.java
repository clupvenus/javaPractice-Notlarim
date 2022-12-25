package SampleQuestion;

import java.util.Scanner;

public class Soru3 {
    public static void main(String[] args) {
        //Soru 3-)   SCANNER
        //Kullanicidan 5 tane sayi alin,alinan bu sayilarin ortalamasini hesaplayan java kodunu yaziniz.
        //Ipuclari:
        //* Sayilarin ortalamasi: toplam/5 (edited)

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen 5 tane sayi giriniz.");

        int sayi1= scan.nextInt();
        int sayi2= scan.nextInt();
        int sayi3= scan.nextInt();
        int sayi4= scan.nextInt();
        int sayi5= scan.nextInt();
        double ortalama=(sayi1+sayi2+sayi3+sayi4+sayi5)/5;
        System.out.println("girdiginiz 5 sayinin ortalamasi :"+ortalama);

    }


}
