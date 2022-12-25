package SampleQuestion;

import java.util.Scanner;

public class Soru5 {
    public static void main(String[] args) {
        //Soru 5-)   SCANNER
        //Kullanıcıdan karenin kenar uzunluğunu alın. Aldiginiz uzunluklarla karenin alanını ve çevresini hesaplayan kodu yazın.
        //Ipuclari:
        //Google yaparak karenin alaninin ve cevresinin nasil bulundugunu ögrenin :-)
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen karenin kenar uzunlugunu giriniz.");
        int kenar= scan.nextInt();
        int alan=kenar*kenar;
        int cevre=4*kenar;
        System.out.println("karenin alani : "+alan);
        System.out.println("karenin cevresi: "+cevre);
    }
}
