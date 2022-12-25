package SampleQuestion;

import java.util.Scanner;

public class Soru10 {
    public static void main(String[] args) {
        //Soru 10-)  Klasik Soru :slightly_smiling_face:
        //                    Kullanıcıdan kilosunu ve boyunu isteyin ve kütleyi hesaplayan bir program yazın
        //
        //                    **indeks Hesaplama: İPUCU : Vücut Kitle İndeksi = Ağırlık (kg) / Boy uzunluğunun karesi (m)
        // If konusunu hatırlayın!***
        //                   Kullanıcıya aşağıdaki gibi mesaj verin:
        //
        //                    Eğer VKİ 18.5'ten az ise --> zayıfsınız
        //                    Eğer VKİ 18.5 ile 25 arasında ise --> kilo idealdir
        //                    Eğer VKİ 25 ila 30 arasındaysa --> şişmansınız
        //                    VKİ 30'a eşit veya daha fazlaysa --> obez
        //
        //                ÖRNEK :
        //
        //		 Ağırlık : 71
        //		 Yükseklik : 1,72
        //
        //		ÇIKTI :
        //   VKİ değeriniz : 23.99945916711736 Kilonuz ideal

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen kilonuzu giriniz.");
        int kilo= scan.nextInt();
        System.out.println("Lutfen boyunuzu giriniz. metre cinsinden giriniz.");
        double boy= scan.nextDouble();
        double vik=kilo/(boy*boy);
        if (vik<=18.5) System.out.println("Kilonuz normalin altinda. zayifsiniz");
        else if (vik>18.5&& vik<=25) System.out.println("'Kilonuz normal");
        else if (vik>25) System.out.println("Kilonuz normalin ustunde");
        else System.out.println("Yanlis bilgi");



    }
}
