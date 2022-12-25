package test.day02;

import java.util.Scanner;

public class Q2_SwitchCaseHesapMakinesi {
    public static void main(String[] args) {
        /*
         * Kullanicidan iki tamsayi sayi ve islem cinsini alin
         * ve sayilari kullanicinin belirledigi isleme tabii tutup sonucu yazdirin.
         *
         * islem cinsi icin 1:toplama 2:cikarma 3:carpma 4: bolme
         *
         * Ornek : Inputs : sayilar : 18 , 10  islem : 3
         *         Output : 18 X 10 = 180
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen iki tane tam sayi giriniz.");
        int a = scan.nextInt();
        int b = scan.nextInt();
        System.out.println("Islem turunu seciniz:\n\t1:Toplama\n\t2:Cikarma\n\t3:Carpma\n\t4: Bolme");
        int islem = scan.nextInt();
        if (islem == 1) System.out.println(a + b);
        else if (islem == 2) System.out.println(a - b);
        else if (islem == 3) System.out.println(a * b);
        else if (islem == 4) {
            if (b != 0) System.out.println(a / b);
            else System.out.println("Tanimsiz sayi");
        } else System.out.println("Yanlis bir islem numarasi yazdiniz.");
        System.out.println("**********Switch case cozumu -1******");
        switch (islem) {
            case 1:
                System.out.println(a + b);
                break;
            case 2:
                System.out.println(a - b);
                break;
            case 3:
                System.out.println(a * b);
                break;
            case 4:
                if (b != 0) System.out.println(a / b);
                else System.out.println("Tanimsiz sayi");
                break;
            default:
                System.out.println("Yanlis bir islem numarasi yazdiniz.");


                System.out.println("**********Switch case cozumu -2******");
                char isaret = scan.next().charAt(0);

                System.out.println("Islem turunu seciniz:\n\t+:toplama\n\t-:cikarma\n\t*:Carpma\n\t/: Bolme");

                switch (islem) {
                    case '+':
                        System.out.println(a + b);
                        break;
                    case '-':
                        System.out.println(a - b);
                        break;
                    case '*':
                        System.out.println(a * b);
                        break;
                    case '/':
                        if (b != 0) System.out.println(a / b);
                        else System.out.println("Tanimsiz sayi");
                        break;
                    default:
                        System.out.println("Yanlis bir islem numarasi yazdiniz.");


                }
        }

    }}




