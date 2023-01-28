package test.day15;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class OgretmenIslemler implements IIslemler{
Scanner scan= new Scanner(System.in);
static int sicilno=1000;
static  ArrayList<Ogretmen> ogretmenList=new ArrayList<>();
void ogrtMenu(){
    System.out.println("============= Ogretmen İŞLEMLERI =============\n" +
            "\t\t 1-EKLEME\n" +
            "\t\t 2-ARAMA\n" +
            "\t\t 3-LİSTELEME\n" +
            "\t\t 4-SİLME\n" +
            "\t\t Q-ÇIKIŞ"+
            "\n"
    +"\t Seciminiz :");

    try {
        int secim=scan.nextInt();
        switch (secim){
            case 1:{ekleme();}
            case 2:{arama();}
            case 3:{listeleme();}
            case 4:{silme();}

        }
    } catch (InputMismatchException e) {
        String secim=scan.next();
        if (secim.equalsIgnoreCase("q"))
        {
            System.out.println("Sistemden cikiliyor.");
            AnaMenu anaMenu=new AnaMenu();
            anaMenu.menu();
        }else {
            System.out.println("Hatali giris yaptiniz.");
            ogrtMenu();
        }
    }


}
  @Override
    public void ekleme() {
      System.out.println("ogretmenin adini giriniz.");
      String ad=scan.nextLine();
      scan.nextLine();
      System.out.println("ogretmenin soy adini giriniz.");
      String sad=scan.nextLine();
      System.out.println("Ogretmenin Tc nosunu giriniz.");
      String tcNo=scan.next();
      System.out.println("Ogretmenin yasini giriniz.");
      int yas= scan.nextInt();
      scan.nextLine();
      System.out.println("Ogretmenin bolumunu giriniz.");
      String bolum=scan.nextLine();
   Ogretmen ogretmen=new Ogretmen(ad,sad,tcNo,yas,bolum,sicilno++);
   ogretmenList.add(ogretmen);
   ogrtMenu();
    }

    @Override
    public void arama() {

        System.out.println("Aranacak kisinin tc sini giriniz");
        String tcNo=scan.next();
        int kontrol=0;
        for (Ogretmen each:ogretmenList
             ) {
            if (each.getTcNo().equals(tcNo)) {
                System.out.println(each);
                kontrol=1;
            }

        }
        if (kontrol==0){
            System.out.println(tcNo+" tc no kisi bulunamadi.");
        }
        ogrtMenu();
    }

    @Override
    public void listeleme() {
        for (Ogretmen each:ogretmenList
             ) {
            System.out.println(each+" ");
        }

    }

    @Override
    public void silme() {

        System.out.println("Silinecek kisinin tcNosunu giriniz.");
        String tcNo = scan.next();
        int kontrol = 0;
        for (int i = 0; i < ogretmenList.size(); i++) {
            if (ogretmenList.get(i).getTcNo().equals(tcNo)) {
                System.out.println("Silinen kisi : " + ogretmenList.get(i));
                ogretmenList.remove(i);
                kontrol = 1;
            }

        }
        if (kontrol == 0) System.out.println("Bu tc no ya ait ogretmen bulunamadi.");
        listeleme();

        ogrtMenu();
    }
}
