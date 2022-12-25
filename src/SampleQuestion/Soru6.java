package SampleQuestion;

import java.util.Scanner;

public class Soru6 {
    public static void main(String[] args) {
        //Soru 6-)  Kullanıcıya günde ne kadar çay içtiğini ve ne kadar şeker kullandığını sorun.
        // Yılda kaç çay içtigini ve kaç kg şeker kullandığını hesaplayın ve bunları ekranda yazdırın.
        // 1 şeker = 1.5 gr
        //1 kg = 1000 gram      olarak hesaplayınç
        //
        // Ipuclari:
        //·        Önce gram cinsinden yıllık ne kadar seker kullandıgını bulun ve kiloya çevirin

        Scanner scan= new Scanner(System.in);
        System.out.println("Gunde kac bardak cay icersiniz.");
        int bardak= scan.nextInt();
        System.out.println("Bir bardak caya kac kup seker atarsin. ");
        int seker=scan.nextInt();
        double yillikSeker=((seker*bardak*1.5)*365)/1000;
        System.out.println("Yilda "+yillikSeker+" kg seker kullaniyorsunuz.");

    }
}
