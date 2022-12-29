package SampleQuestion;

public class Soru22 {
    public static void main(String[] args) {
        /*
        Soru 22-)
Kullanıcıdan 2 tamsayı girmesini isteyin, ardından GCD (En Büyük Ortak Bölen) ve LCM'yi bulun (En Küçük Ortak Kat)
Giriş :
30 ve 40

Beklenen Çıktı:
30 ve 40 için EBOB= 10
30 ve 40 için EKOK= 120
ipucu:
Loopları kullanarak çözebiliriz. İki sayının EKOK'u sayıların çarpımının sayıların EBOB'una bölünerek bulunabilir.
         */
        int sayi1=30;
        int sayi2=40;
        int ebob=1;
        int ekok=1;

        int kucukSayi=1;

        if (sayi1>sayi2) {kucukSayi=sayi2;}
        else kucukSayi=sayi1;


        for (int i = 1; i <=kucukSayi; i++) {
            if(sayi1 %i==0 && sayi2 %i==0)

            {   sayi1=sayi1/i;
                sayi2=sayi2/i;
                 ebob*=i;}


        }


        ekok=sayi1*sayi2*ebob;
        /*
        sayi bir ve sayi ikinin degeri degistigi icin tekrar ebobla cartik
        sayi1 in yeni degeri sayi1/ebob
        sayinin yeni degeri sayi2/ebob
         */
        System.out.println("Ekok : "+ekok);
        System.out.println("Ebob : "+ebob);
    }
}
