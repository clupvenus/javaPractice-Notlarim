package test.day15;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class OgrenciIslemler implements IIslemler {
    Scanner scan = new Scanner(System.in);
    static int numara = 100;
    static ArrayList<Ogrenci> ogrenciList = new ArrayList<>();

    void ogrcMenu() {
        System.out.println("\t============= İŞLEMLER =============\n" +
                "\t\t 1-EKLEME\n" +
                "\t\t 2-ARAMA\n" +
                "\t\t 3-LİSTELEME\n" +
                "\t\t 4-SİLME\n" +
                "\t\t Q-ÇIKIŞ");


        try {
            int secim = scan.nextInt();
            switch (secim) {
                case 1:
                    ekleme();
                case 2:
                    arama();
                case 3:
                    listeleme();
                case 4:
                    silme();
            }
        } catch (InputMismatchException e) {
            String secim = scan.next();
            if (secim.equalsIgnoreCase("q")) {
                System.out.println("Sistemden cikiliyor");
                AnaMenu anaMenu = new AnaMenu();
                anaMenu.menu();
            } else {
                System.out.println("Yanlis secim yaptiniz");
                ogrcMenu();
            }
        }
    }

    @Override
    public void ekleme() {
        System.out.println("Ogrencinin adini giriniz.");
        scan.next();
        String ad = scan.nextLine();
        System.out.println("Ogrencinin soy adini giriniz.");
        scan.next();
        String sAd = scan.nextLine();
        System.out.println("Ogrencinin TC nosunu giriniz.");
        String tcNo = scan.nextLine();
        System.out.println("Ogrencinin yasini giriniz.");
        int yas = scan.nextInt();
        System.out.println("Ogrencinin sinifini giriniz.");
        scan.next();
        String sinif = scan.nextLine();
        Ogrenci ogrenci = new Ogrenci(ad, sAd, tcNo, yas, numara++, sinif);
        ogrenciList.add(ogrenci);
        listeleme();


    }

    @Override
    public void arama() {
        scan.next();
        System.out.println("Lutfen aranacak ogrencinin tc nosunu giriniz.");
        String tcNo=scan.nextLine();
        int kontrol = 0;
        for (Ogrenci each : ogrenciList
        ) {
            if (each.getTcNo().equals(tcNo)) {
                System.out.println(each);
                kontrol = 1;
                ogrcMenu();
            }

        }
        if (kontrol == 0) {
            System.out.println(tcNo+ " tc no kisi bulunamadi.");
        }
listeleme();
    }



    @Override
    public void listeleme() {
        for (Ogrenci each:ogrenciList
             ) {
            System.out.println(ogrenciList);

        }
    }

    @Override
    public void silme() {
        System.out.println("Silinecek kisinin TcNosunu giriniz");
        String tcNo=scan.nextLine();
        boolean kontrol=true;
        for (int i = 0; i <ogrenciList.size() ; i++) {
            if (ogrenciList.get(i).getTcNo().equalsIgnoreCase(tcNo)){
                System.out.println("Silinecek kisi : "+ogrenciList.get(i));
                ogrenciList.remove(i);
                kontrol=false;
                ogrcMenu();
            }

        }if (kontrol){
            System.out.println(tcNo+"Bu tc no ya ait kisi bulunamadi.");
            ogrcMenu();
        }

    }
}
