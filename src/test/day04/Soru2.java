package test.day04;

public class Soru2 {
    public static void main(String[] args) {
        //// 0-255 e kadar olan harflerin , sayı ve harf değerini konsola yazdırınız.
        for (int i = 65; i < 91; i++) {
            System.out.print(i+":"+(char)(i)+" - ");

        }
    }
}
