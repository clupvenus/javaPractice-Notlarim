package SampleQuestion;

public class soru9 {
    public static void main(String[] args) {
        //Soru 9-)  Girilen zamanı saniyeye çeviriniz.
        //               Örnek: 2 saat 3 dakika 10 saniye ==>	 7390 saniye
        //         Ipucu:
        //         Saati alıp saniyeye cevirebilirsiniz.  Kullanıcıdan ayrı ayrı alabilirsiniz veya
        //         kullanıcıdan hepsini birlikte alabilirsiniz.

        int saat=5;
        int dakika=25;
        int saniye=18;
        int top=(saat*60*60)+(dakika*60)+saniye;
        System.out.println("Toplam saniye : "+top);
    }
}
