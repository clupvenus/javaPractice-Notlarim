package SampleQuestion;

import java.util.Scanner;

public class Soru45 {/*
    Soru 45-)
    StudentMaın adında bir class olusturun, ögrenci bilgilerini alın. (ad soyad yas cınsiyet okul)
    Ardından Student adlı bir class olusturun
     ve içine parametreli constructor koyun, bu parametreler Maın classdaki bılgılerı ıstesın.
    Bu parametreli constructor icinde kullanıcıya ögrenci bilgilerini doldurtun. Ardından consolda giriilen bilgileri yazdırın
    Ipucu:
    Bu soruda iki classa ihtiyacımız olacak.
    Birinci main classda ögrenci bilgilerini tanımlayacagımız variablerı olusturacagız. String isim, int yas, char cinsiyet gibi...
    Ardından baska bir class olusturacagız ve bu classa parametrelı bir constructor koyacagız,
    bu parametrelı constructor az önce olusturdugumuz classdaki parametreleri kabul edecek sekılde olmalı.
    Ardından Main classda, parametreli constructoru olan classtan bir obje olusturacagız
    ve tabi ki constructor parametrelı oldugu ıcın bızden parametre yazmamızı ısteycek,
    bızde yukarıda olusturdugumuz variable adlarını ekleyecegız.
                ------------------------------------------------------------------------------------------------------------- (edited)
*/
}
    class StudentMain {
        String ad = "Humeyra";
        String sAd = "Uysal";
        int yas = 36;
        char cinsiyet ='K';
        String okul = "Wise Quarter";

        public StudentMain(String ad, String sAd, int yas, char cinsiyet, String okul) {
            this.ad = ad;
            this.sAd = sAd;
            this.yas = yas;
            this.cinsiyet = cinsiyet;
            this.okul = okul;
        }

        @Override
        public String toString() {
            return "StudentMain{" +
                    "ad='" + ad + '\'' +
                    ", sAd='" + sAd + '\'' +
                    ", yas=" + yas +
                    ", cinsiyet=" + cinsiyet +
                    ", okul='" + okul + '\'' +
                    '}';
        }
    }
    class Student {


        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Lutfen adini  giriniz");
            String ogrencininAdi = sc.nextLine();
            System.out.println("Lutfen soyadini  giriniz");
            String ogrencininSoyAdi = sc.nextLine();

            System.out.println("Lutfen yasinizi giriniz");
            byte age = sc.nextByte();
            System.out.println("Lutfen cinsiyetinizi giriniz");
            char gender = sc.next().charAt(0);
            System.out.println("Lutfen okulunuzun adini giriniz");
            sc.nextLine();
            String school = sc.nextLine();

            StudentMain student1 = new StudentMain(ogrencininAdi,ogrencininSoyAdi,age, gender, school);
            System.out.println(student1.toString());


        }

    }






 /*  SEVILAYIN COZUMU
    public class Student {
      //soru45-
         String ogrencininAdiSoyadi;
         byte age;
        char gender;
        String school = "";
​
        public Student(String ogrencininAdiSoyadi, byte age, char gender, String school) {
           this.ogrencininAdiSoyadi = ogrencininAdiSoyadi;
           this.age = age;
           this.gender = gender;
           this.school = school;
        }
​
      @Override
      public String toString() {
          return "Student{" +
                  "ogrencininAdiSoyadi='" + ogrencininAdiSoyadi + '\'' +
                  ", age=" + age +
                  ", gender=" + gender +
                  ", school='" + school + '\'' +
                  '}';
      }
  }
​
public class StudentMain {
​
        //soru45-
​
        public static void main(String[] args) {
​
            Scanner sc = new Scanner(System.in);
            System.out.println("Lutfen ad ve soyadinizi giriniz");
            String ogrencininAdiSoyadi = sc.nextLine();
            System.out.println("Lutfen yasinizi giriniz");
            byte age = sc.nextByte();
            System.out.println("Lutfen cinsiyetinizi giriniz");
            char gender = sc.next().charAt(0);
            System.out.println("Lutfen okulunuzun adini giriniz");
            sc.nextLine();
            String school = sc.nextLine();
​
            Student student1 = new Student(ogrencininAdiSoyadi, age, gender, school);
           System.out.println(student1.toString());
​
        }
     */



