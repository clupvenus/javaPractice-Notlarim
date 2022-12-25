package SampleQuestion;

import java.util.Scanner;

public class Soru18 {
    public static void main(String[] args) {
      /*  Soru 18-)
        Girilen araç hızı ve yol kilometresinden, gidilen yere varış süresini hesaplayan bir method yazalım.
        Kullanıcıya hızını ve kilometreyi soralım, bunu methoda gönderelim ve bize varış süremizi hesaplasın
        İpucu:
        yol=Hız*zaman*/

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen hizinizi giriniz.");
        double hiz= scan.nextInt();
        System.out.println("Lutfen gidceginiz yere mesafenizi km cinsinden soyleyiniz.");
        int mesafe=scan.nextInt();
        varisSuresi(hiz,mesafe);

    }

    private static void varisSuresi(double km, int mesafe) {
        double zaman=  mesafe/km;
        System.out.println("gideceginiz yere "+zaman+" saat sonra ulasacaksin.");
    }



}
