package test.day04;

public class Soru1 {
    public static void main(String[] args) {
        //soru= 100`den0 a kadar 13 etam bolunebilen sayilari ve toplmalarini ekrana yaziniz.
        //
        //
        //
        int toplam=0;
        for (int i =100 ; i >0 ; i--) {
            if(i%13==0) {
                System.out.println(i + " sayisi 13 e tam bolunur.");
                toplam+=i;
            }
        }

        System.out.println("toplam ="+toplam);

    }


}
