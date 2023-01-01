package SampleQuestion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Soru37 {
    public static void main(String[] args) {
        /*------------------------------------------------------------------------------------------------------------------
    Soru 37-)
            --BONUS--  ---SORU AŞKIYLA YANIP TUTUŞANLAR İÇİN :-))---
            (Eliminate duplicates)
    ENG:
    Write a method that returns a new array by eliminating the duplicate values in the array using the following method header
    Write a test program that reads in ten integers, invokes the method, and displays the result.
            (Tekrarlananları çıkar)
    TÜR:
    Tekrarlanan kayıtların çıkarıldığı yeni bir dizi döndüren aşağıdaki başlıga sahip bir metot yazınız.
    On tane tamsayı alan ve bu metodu çağırarak sonucu gösteren bir test programı yazınız.
            ---->>>
    public static int[] eliminateDuplicates(int[] list)
    ÖRNEK:
    On sayi giriniz:
            1 2 3 2 1 6 3 4 5 2
    ÇIKTI:
    Birbirinden farkli girilen sayilar: 1 2 3 6 4 5
         */
        Scanner scan = new Scanner(System.in);
        int sayac=1;
        List<Integer> sayilar= new ArrayList<>();
        while(sayac<11) {
            System.out.println("Lutfen sayi giriniz.");
            if(!sayilar.contains(scan.nextInt())){
                sayilar.add(scan.nextInt());}
            sayac++;

        }
        System.out.println(sayilar);


    }
}
