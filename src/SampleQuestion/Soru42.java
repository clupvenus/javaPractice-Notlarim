package SampleQuestion;

public class Soru42 {
    public static void main(String[] args) {
/*
        -------------------------------------------------------------------------------------------------------------
                Soru 42-)
        Parametre olarak birden fazla tamsayı (integer) kabul eden ve bu integer sayıların toplamını yazdıran
        bir dönüş methodu (void) yazın
        Method name=sum
        eğer metodu bu şekilde çağırırsanız

        toplam(1,2,3) çıktı =6
        toplam(1,2,3,4,5) çıktı =15
        sum(1,2) output=3
        Ipucu:  varargs sorusu, varargs olusturalım*/


       int[]sayilar={5,4,6,8,9,7,11,5,6};
        sum(sayilar);
        sum(5,4,6,8,9,7,8);


    }

    private static void sum(int... sayilar) {
int top=0;
        for (int i = 0; i < sayilar.length; i++) {
            top+=sayilar[i];

        }

        System.out.println("Sayilarin toplami :"+top);




    }
}
