package test.day15;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AnaMenu {

    Scanner scan=new Scanner(System.in);
    void menu(){
        System.out.println("====================================\n" +
                "\t ÖĞRENCİ VE ÖĞRETMEN YÖNETİM PANELİ\n" +
                " \t ====================================\n" +
                "\t1- ÖĞRENCİ İŞLEMLERİ\n" +
                "\t2- ÖĞRETMEN İŞLEMLERİ\n" +
                "\tQ- ÇIKIŞ\n"+
                "\t Seciminiz: ");

        try{int secim =scan.nextInt();
        switch (secim){
            case 1:{
                OgrenciIslemler ogrenciMenu=new OgrenciIslemler();
                ogrenciMenu.ogrcMenu();

            }
            case 2:{
                OgretmenIslemler ogretmenMenu= new OgretmenIslemler();
                ogretmenMenu.ogrtMenu();
            }
        }


        } catch (InputMismatchException e) {
            String secim=scan.next();
            if (secim.equalsIgnoreCase("q")){
                System.out.println("Sistemde cikiliyor.");
                System.exit(0);

            }else {
                System.out.println("Hatali giris yaptiniz.");
                menu();
            }

        }


    }



}
