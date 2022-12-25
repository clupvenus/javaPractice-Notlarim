package SampleQuestion;

import java.util.Scanner;

public class Soru19 {
    public static void main(String[] args) {
       /* Soru 19-)
        Kullanıcıdan doğum tarihini alınız. Burcunu hesaplayan bir method yazınız.
                ipucu:
        Switch Case kullanabilirsiniz. Veya Method yazarak Method aracılıgı ile de yapabilirsiniz.*/
        int ay=2;
        int gun=18;

        burcHesapla(gun,ay);
    }

    private static void burcHesapla(int gun,int ay) {
        switch (ay) {
            case 1:
                if (gun > 22)
                    System.out.println("Kova");
                else System.out.println("oglak");
                break;
            case 2:
                if (gun > 19)
                    System.out.println("balik");
                else System.out.println("kova");
                break;
            case 3:
                if (gun > 22)
                    System.out.println("koc");
                else System.out.println("balik");
                break;
            case 4:
                if (gun > 22)
                    System.out.println("boga");
                else System.out.println("koc");
                break;
            case 5:
                if (gun > 22)
                    System.out.println("ikizler");
                else System.out.println("boga");
                break;
            case 6:
                if (gun > 22)
                    System.out.println("yengec");
                else System.out.println("ikizler");
                break;
            case 7:
                if (gun > 22)
                    System.out.println("aslan");
                else System.out.println("yengec");
                break;
            case 8:
                if (gun > 22)
                    System.out.println("basak");
                else System.out.println("aslan");
                break;
            case 9:
                if (gun > 22)
                    System.out.println("terazi");
                else System.out.println("basak");
                break;
            case 10:
                if (gun > 22)
                    System.out.println("akrep");
                else System.out.println("terazi");
                break;
            case 11:
                if (gun > 22)
                    System.out.println("yay");
                else System.out.println("terazi");
                break;
            case 12:
                if (gun > 22)
                    System.out.println("oglak");
                else System.out.println("yay");
                break;
            default:
                System.out.println("Yanlis ay sayisi girdiniz.");


        }
    }
}
