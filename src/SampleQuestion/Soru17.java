package SampleQuestion;

public class Soru17 {
    public static void main(String[] args) {
        /*
        Soru 17-)
Kullanıcıdan bir isim ve bir karakter girmesini isteyin, ardından isimde karakterin kaç kez tekrarlandığını kontrol edelim.
Örnek:
 char ch1=            'a'
 String name =     "Ali bakkala geç gitti."
Beklenen Çıktı=    a sayısı = 3
Ipucu:
Loop döngülerini hatırlayalım. While döngüsü kullanabilirsiniz!
Sayac adlı bir int variable oluşturarak bunun ile kelimenin kaç defa geçtigini Loop içindeki İf ile bulabilirsiniz!
         */

        char ch1='a';
        String name ="Ali bakkala geç gittiaaakkj,jsshkdhslkanlkjlasalaakjnkj,nnanaknlanbkjkj.";
        int sayac=0;
        name= name.toLowerCase();
        for (int i = 0; i <name.length() ; i++) {
         if(name.charAt(i)==ch1) {
             sayac++;}
        }
        System.out.println("Aranilan a karakteri cumlemizde "+sayac+" tane vardir.");



    }
}
