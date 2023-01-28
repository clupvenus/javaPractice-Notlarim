package test.day06_arrays;

public class Q4 {
    /*
    Stringlerden olusan bir arrayde ogeler 'n' veya 'k' ile bitiyorsa, o ogelerin bas harflerini ekrana yazdiran metodu yaziniz.
    Ornek={"Kemal","Jonathan","Mark","Jackson","Ali"}==> cikti JMJ
     */
    public static void main(String[] args) {
        String[] str={"Kemal","Jonathan","Mark","Jackson","Ali"};
        basHarfYazdir(str);
    }
//cikti: JMJ
    private static void basHarfYazdir(String[] arr) {
String cikti="";
        for (String each:arr
             ) {
          if( each.endsWith("n")||each.endsWith("k"))
              cikti+=each.substring(0,1).toUpperCase();
        }

        System.out.println("cikti: "+cikti);


    }


}
