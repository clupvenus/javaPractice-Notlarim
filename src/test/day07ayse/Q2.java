package test.day07ayse;

import java.util.Arrays;

public class Q2 {
    public static void main(String[] args) {
         /*
         * create a custom return type method accepts a name as parameter
         * and prints the name as a char array
         *
         * (do not use toCharArray() method)
         *
         * Input : John
         * Output : [J, o, h, n]
         *
         Parametre olarak String bir isim girdiginiz, size o ismin harflerini
         bir char Array olarak yazdiran bir method olusturunuz.

         toCharArray() methodunu kullanmayiniz!

         * Input : John
         * Output : [J, o, h, n]

         */
        String input="John";
        CharArrayiYap(input);


    }

    private static void CharArrayiYap(String str) {
        char[] chr=new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            chr[i]=str.charAt(i);

        }
        System.out.println(Arrays.toString(chr));
    }
}
