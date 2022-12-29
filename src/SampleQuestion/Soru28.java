package SampleQuestion;

public class Soru28 {


    public static void main(String[] args) {

           /*Soru-28)
    Kullanıcının girdiği sayıyı tersine çeviren bir program yazın.
    Örnek:
    Sayı: 1238
    Sayının Tersi: 8321
    İpucu:  Loop kullanabilirsiniz.*/
    StringBuilder sayi=new StringBuilder("1238");
    sayi.reverse();
        System.out.println(sayi);
        String sayi1="1238";
        String tersSayi="";
        for (int i = sayi1.length()-1; i >=0 ; i--) {
            tersSayi+=sayi1.substring(i,i+1);


        }
        System.out.println(tersSayi);







}

}