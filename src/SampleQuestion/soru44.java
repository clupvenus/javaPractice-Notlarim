package SampleQuestion;

import java.util.InputMismatchException;
import java.util.Scanner;

public class soru44 {
/*
   -------------------------------------------------------------------------------------------------------------
    Soru 44-)
    Main methodda ögrenci bilgileri oluşturun ve bu verileri kullanın.
    Changename adında bir method oluşturun, parametre olarak öğrenci bilgileri alın ve methodda tüm bilgileri değiştirin ve
    yeni bilgileri ekleyip yazdırın.
    Main Methoddaki Rename methodunu çağırdığımız satırda öğrenci bilgilerini tekrardan yazdırın
    Changesurname adlı bir method oluşturun ,
    bu method lastname'i parametre olarak alsın. Methodda kullanıcıya yeni bir lastname sorulsun ve eski lastname degiştirilsin.
            -------------------------------------------------------------------------------------------------------------
   */


    public static void main(String[] args) {

        String ad="Azra";
        String sAd="Uysal";
        int yas=9;
        int grup=6;
        ChangeName(ad,sAd,yas,grup);

    }

    private static void ChangeName(String ad,String sAd ,int yas, int grup) {
        System.out.println("Eski bilgiler soyleydi: "+ad+", "+sAd+", "+yas+", "+grup);

        Scanner scan=new Scanner(System.in);
        System.out.println("Yeni isim giriniz.");
        ad=scan.next();
        System.out.println("Soy ismi giriniz.");
        sAd=scan.next();
        scan.next();
        try {
            System.out.println("Yasini giriniz.");
            yas=scan.nextInt();

        } catch (InputMismatchException e) {
            System.out.println("Yanlis bir deger girdiniz.");
            scan.next();
            System.out.println("Yasini giriniz.");
            yas=scan.nextInt();
        }
        try {
            System.out.println("Grup giriniz.");
            grup=scan.nextInt();
        } catch (Exception e) {
            System.out.println("Yanlis bir deger girdiniz.");
            scan.next();
            System.out.println("Grup giriniz.");
            grup=scan.nextInt();
        }

        System.out.println("ad: "+ad+"\n Soyad: "+sAd+"\n yas: "+yas+"\ngrup: "+grup);


    }
   /*
   Sevilayin cozumu

 //soru 44
​
        String firstName="Zeki";
        int age=15;
        String classRoom="11-B";
        String lastName="Muren";
​
        Changename(firstName,lastName,age,classRoom);
​
    }private static void Changename(String firstName, String lastName, int age, String classRoom) {
        firstName="Baris";
        lastName="Manco";
        age=14;
        classRoom="10-C";
​
        System.out.println("First Name= "+ firstName + "\nLast Name= "+lastName+"\nage = " + age + "\nClassRoom= " + classRoom);
        System.out.println("First Name= "+ firstName + "\nLast Name= "+Changesurname( lastName)+"\nage = " + age + "\nClassRoom= " + classRoom);
​
    }private static String Changesurname(String lastName) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Lutfen yeni soyadinizi giriniz");
       return lastName=sc.next();
​
    }
    */
}
