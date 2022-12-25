package test.day06;

import java.util.ArrayList;
import java.util.Scanner;

public class Soru2 {
    public static void main(String[] args) {
        //kullanicidan alinan bir tamsayi kadar Fibonacci dizisi olusturun.
        //1 1 2 3  5 8 13 21 34

        Scanner scan= new Scanner(System.in);
        System.out.println("Bir sayi giriniz.");
        int sayi= scan.nextInt();
        ArrayList<Integer> fibo=new ArrayList<>();
        fibo.add(1);
        fibo.add(1);
        int toplam=0;
        for (int i = 2; i <sayi ; i++) {
            toplam=(fibo.get((fibo.size()-2))+ (fibo.get(fibo.size()-1)));
            fibo.add(toplam);


        }
        System.out.println(fibo);



    }

}
