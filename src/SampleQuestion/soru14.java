package SampleQuestion;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class soru14 {
    public static void main(String[] args) {
/*
Kullanıcıdan bir isim isteyelim. Bu isim 3 harfli olmalıdır. Ardından ismin aynı karakterlere sahip olup olmadığını kontrol edelim.
İsim aynı karakterlere sahipse konsolda "Dize yinelenen karakterlere sahip"  değil ise konsolda "Dize benzersiz karakterlere sahip" yazdıralım.
Ipucu:
IF/Else veya Ternary kullanabilirsiniz. Harfleri Char ile alıp karşılaştırabilirsiniz.
 */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen uc harfli bir kelime giriniz.");
        String str=scan.next();
        if(!(str.substring(0,1).equalsIgnoreCase(str.substring(1,2))||str.substring(0,1).equalsIgnoreCase(str.substring(2,3)))
                ||str.substring(1,2).equalsIgnoreCase(str.substring(2,3))) System.out.println("Dize benzersiz karakterlere sahip");
        else System.out.println("Dize yinelenen karakterlere sahip");

    }
}
