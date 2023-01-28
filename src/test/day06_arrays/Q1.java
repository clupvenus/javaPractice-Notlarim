package test.day06_arrays;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;

public class Q1 {
    public static void main(String[] args) {
        //Kullanici tarafindan girilen string bir ifadenin icindeki sayisal degerleri yoplayan methodu yaziniz.
        String str="ahmet pazara gitti 3 ekmek aldink5689 ve 18 lira odedi.";
        sayilariTopla("ahmet pazara gitti 3 ekmek aldink5689 ve 18 lira odedi.");
  ikinciYol(str);


    }
//Hocanin cozumu....
    private static void ikinciYol(String str) {
        String[] arr=str.split("");
        int top=0;

        for (String each:arr) {
            if(Character.isDigit(each.charAt(0))){
                top+=Integer.valueOf(each);

            }
            
        }
        System.out.println("Sayilarin toplami: "+top);



    }

//Benim cozumum.......
    private static void sayilariTopla(String str) {


        str = str.replaceAll("\\D", "");
        int sayi = Integer.parseInt(str);

        int rakamlarToplami = 0;

        while (sayi > 0) { // 318
            rakamlarToplami += sayi % 10;

            sayi = sayi / 10;


        }
        System.out.println("Stringdeki rakamlar toplami: " + rakamlarToplami);
    }
//2. cozum





}
