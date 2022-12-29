package SampleQuestion;

public class Soru29 {
    public static void main(String[] args) {
        /*
     Soru29) 1'den 100'e kadar olan doğal sayıların toplamını bulmak için bir Program yazın.
            İpucu: Loop kulanabilirsiniz

         */
        int top=0;
        for (int i = 1; i <100 ; i++) {
            top+=i;

        }
        System.out.println("Toplam sayi :"+top);

    }
}
