package SampleQuestion;

import java.util.Scanner;

public class Soru11 {
    public static void main(String[] args) {
        //Soru 11-) Kullanıcıya Adını, Soyadını ve kredi kartı numaralarını sorup bunları özel forma dönüştürün.
        //                 Ad ve soyadın baş harfleri büyük olmalıdır
        //                 Kredi kartı numarasını kontrol edin, 16 hane yoksa "Geçersiz kredi kartı numarası" yazdırın.
        //                 Kredi Kartı 16 Hane ise aşagıda belirtilen şekilde çıktı alın.
        //	Ipucu: IF ile çözebilirsiniz. Baş harfleri alın gerisi zaten * işareti ;-)
        //Giriş :
        //		 > Gandalf Grey 563245879632
        //Çıktı :
        //		 > İsim : G****** G***
        //		 > CCN : **** **** 9632
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen adinizi giriniz.");
        String ad= scan.nextLine();
        System.out.println("Lutfen bir soyad giriniz.");
        String soyad=scan.nextLine();
        System.out.println("Lutfen kredi karti numarasini giriniz. 16 haneli");
        String krediKartNo=scan.nextLine();
        ad=ad.substring(0,1).toUpperCase().concat(ad.substring(1).replaceAll("\\w","*"));
        soyad=soyad.substring(0,1).toUpperCase().concat(soyad.substring(1).replaceAll("\\w","*"));
        krediKartNo=krediKartNo.substring(0,12).replaceAll("\\w","*").concat(krediKartNo.substring(12,16));

         if (krediKartNo.length()==16) {
            System.out.println("Isim:"+ad+" "+soyad);
            System.out.println("CCN :"+(krediKartNo));

        }
         else System.out.println("Kredi karti numaranizi 16 haneli giriniz.");


    }
}
