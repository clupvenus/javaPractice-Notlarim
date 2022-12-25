package test.day03;

import java.util.Scanner;

public class Q01_Dikucgen {
    public static void main(String[] args) {
      /*
      Kullanicidan uc adet sayi alarak bu sayilarin
   bir dik ucgenin kenar uzunluklari olup olmadigini hesaplatan bir kod yaziniz
   NOT:
   Bir ucgenin dik oldugunu anlamak icin a2+b2=c2 pisagor
   denkleminden yararlanabilirsiniz.
   -----Ornek Ekran Ciktisi-----
   ilk kenari giriniz: 2
   ikinci kenari giriniz 15
   üçüncü kenari giriniz: 7
   Bu bir dik ucgen degildir.
   Bu bir dik ucgendir.
       */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen kenar uzunluklarini sira ile giriniz.");
        System.out.println("ilk kenari giriniz.");
        int a=scan.nextInt();
        System.out.println("ikinci kenari giriniz.");
        int b=scan.nextInt();
        System.out.println("ucuncu kenar uzunlugunu giriniz.");
        int c=scan.nextInt();

        if(a*a+b*b==c*c) System.out.println("dik ucgen");
        else if(a*a+c*c==b*b)System.out.println("dik ucgen");
        else if (b*b+c*c==a*a) System.out.println("dik ucgen");
        else System.out.println("dik ucgen degildir");

        System.out.println("******  2. cozum  *******");

        if(a*a+b*b==c*c||b*b+c*c==a*a||a*a+c*c==b*b) System.out.println("dik ucgen");
        else System.out.println("dik ucgen degil");

        }


    }

