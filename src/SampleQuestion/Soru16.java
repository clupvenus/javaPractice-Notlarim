package SampleQuestion;

import java.util.Scanner;

public class Soru16 {
    public static void main(String[] args) {
        /*
        Soru 16-)  Kullanıcıdan en az 5 harfli bir kelime alın.
        Alınan kelimenin son 3 harfinin 2 kopyasından oluşan yeni bir String oluşturun ve konsolda yazdırın
                  Kullanicidan alinan isim uzunluğu en az 5 değilse yeni bir kelime  girmesini isteyin.
                  Ipucu:  For/While/Do Loops konularını ve String Manipulation konularını hatırlayalım!
                               Loopun içerisinde StringM methodlarından  yararlanalım!
         */
        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen en az 5 harfli bir kelime girin.");
        String str = scan.next();
        String yeniStr="";
        if (str.length()>=5)
        {yeniStr=yeniStr.concat(str.substring(str.length()-3));
            System.out.println(str.substring(str.length()-3));
            }
        else System.out.println("Yeni bir kelime giriniz");


    }
}
