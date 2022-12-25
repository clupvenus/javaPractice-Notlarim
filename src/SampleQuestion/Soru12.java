package SampleQuestion;

import java.util.Scanner;

public class Soru12 {
    public static void main(String[] args) {
     /*   Soru 12-)
        Verilen iki sayının toplamını -sıfırdan büyük veya eşit olabilir- hesaplamak ve yazdırmak için bir program oluşturalım
        Eğer verilen tamsayıların veya toplamın 10'dan fazla basamağı varsa, "Fazla Yüklenme" yazdıralım

        Ipucu:  IF/Else kullanabilirsiniz.
                Örnek:
        İki tamsayı girin:
        25  veya  4567986321453
        46   veya 123456
        Konsolda Çıktı :
        Sayıların toplamı: 71  veya  Fazla Yüklenme (edited)*/
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz.");
        long sayi=scan.nextLong();
        System.out.println("Lutfen ikinci sayiyi giriniz.");
        long sayi2=scan.nextLong();
        long top=sayi2+sayi;
        if (top>=1000000000) System.out.println("Fazla yukleme");
        else System.out.println("Sayilarin toplami : "+top);
        }
    }
