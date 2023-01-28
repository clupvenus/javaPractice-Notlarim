package test.day13;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
   /*
    ============= İŞLEMLER =============
		 1-EKLEME
		 2-ARAMA
		 3-LİSTELEME
		 4-SİLME
		 Q-ÇIKIŞ
	SEÇİMİNİZ:
  ŞEKLİNDE BİR MENÜ OLUŞTURULMALI.
3. ARAMA VE SİLME İŞLEMLERİ KİMLİK NO YA GÖRE YAPILMALIDIR.
NOT: PROJEYİ YAPARKEN MÜMKÜN OLAN EN KISA KODLARI YAZMAK İÇİN NESNE YÖNELİMLİ PROGRAMLAMANIN BİZE SAĞLADIĞI İMKANLARI KULLANMAYA DİKKAT EDİNİZ.
         */

    Scanner scan = new Scanner(System.in);
    static int numara=1000;

    ArrayList<Ogrenci> ogrLis=new ArrayList<>();

    void islemler() {
        System.out.print("============= İŞLEMLER =============\n" +
                "\t\t 1-EKLEME\n" +
                "\t\t 2-ARAMA\n" +
                "\t\t 3-LİSTELEME\n" +
                "\t\t 4-SİLME\n" +
                "\t\t Q-ÇIKIŞ\n" +
                "\tSEÇİMİNİZ:");

        try {
            int secim = scan.nextInt();
            switch (secim) {
                case 1: {
                    ekleme();
                }
                case 2: {
                    System.out.println("ARANACAK TC NO YU GIRINIZ.");
                  arama(scan.next());
                }
                case 3: {
                    listeleme();

                }
                case 4: {
                    silme();
                }
                default:{
                    System.out.println("HATALI DEGER GIRDINIZ");
                    islemler();
                }
            }

        } catch (InputMismatchException e) {
            String islem = scan.next();
            if (islem.equalsIgnoreCase("Q")) {
                System.out.println("*****Sistemden cikiliyor.****");
                System.exit(0);
            } else {
                System.out.println("Hatali giris yapildi.");
                islemler();
            }


        }

    }

    private void silme() {
        System.out.println("SILINECEK TC NOSUNU GIRINIZ.");
        String tcNo=scan.next();
        boolean kontrol=true;
        for (int i = 0; i <=ogrLis.size() ; i++) {
            if ((ogrLis.get(i).getTcNo()).equals(tcNo) )
            {
                ogrLis.remove(i);
                kontrol=false;
                listeleme();
                islemler();
            }
            }
            if (kontrol){
                System.out.println("BU TC NO YA AIT OGRENCI YOKTUR.");
                islemler();
            }
            
        }


    private void listeleme() {
        for (Ogrenci each:ogrLis
        ) {
            System.out.println(each);
            System.out.println("");

        }
        islemler();

    }

    private void arama(String tcNo) {
        boolean kontrol=true;
        for (Ogrenci each:ogrLis) {
            if (each.getTcNo().equals(tcNo)) {
                System.out.println("ARANAN OGRENCI: " + each);
                islemler();
            }
        }
                System.out.println("BU TC NO YA AIT OGRENCI YOKTUR.");
                islemler();


            //else {System.out.println(tcNo+"Bu tcno ya ait ogrenci bulunamadi." );
            islemler();}





    private void ekleme() {
       /*
    -AD SOYAD
	-KİMLİK NO
	-YAŞ
	-NUMARA
	-SINIF
     */
        scan.nextLine();
        System.out.print("Ogrencinin adi:");
        String ad = scan.nextLine();
        System.out.print("Ogrencinin soyadi:");
        String sAd = scan.nextLine();
        System.out.print("Ogrencinin kimlik no:");
        String tcNo = tcNoKontrol(scan.next());
        System.out.print("Ogrencinin yasi: ");
        int yas=scan.nextInt();
        System.out.print("Ogrencinin sinifi:");
        String sinif=scan.next();

        Ogrenci ogrenci= new Ogrenci(ad,sAd,tcNo,yas,++numara,sinif);
        
        ogrLis.add(ogrenci);
        listeleme();
        islemler();
        




    }

    private String tcNoKontrol(String tcNo) {
        String tcNoArr[] = tcNo.split("");
        boolean kontrol = true;
        for (String each : tcNoArr) {
            if (!Character.isDigit(each.charAt(0))) {
                kontrol = false;


            }
        }
        if (!kontrol) {
            System.out.println("Girilen TC NO hatali!!");
            tcNoKontrol(scan.next());
           // islemler();
        }
return tcNo;

}


}
