package SampleQuestion;

public class Soru20 {
    public static void main(String[] args) {
/*
Soru 20-)
Kullanıcıdan bir isim yazmasını isteyin, İsim uzunluğu 3 olmalıdır. Daha sonra ismin aynı karakterlere sahip olup olmadığını kontrol edin.
Dize aynı karakterlere sahipse:  "Dizede yinelenen karakterler var" ; aynı karakterlere sahip degilse  "String benzersiz karakterlere sahip"
yazdırın. İsim 3 karakterden uzunsa "Bu kadar uzun cümleyi anlayamam ben agam" yazdırın.

                Örnek:
                giriş: ama
		çıkış: Dizede yinelenen karakterler var

                İpucu: İf Else ve Char kullanarak çözebiliriz.

 */
        String str= "aba";
        String ilkharf=str.substring(0,1);
        String ikinci=str.substring(1,2);
        String ucuncu=str.substring(2,3);

        if (str.length()>3) System.out.println("Bu kadar uzun cümleyi anlayamam ben agam");
        else {
            if(ilkharf.equalsIgnoreCase(ikinci)||ikinci.equalsIgnoreCase(ucuncu)||ilkharf.equalsIgnoreCase(ucuncu))
            System.out.println("Dizide yenilenen karakterler var");
            else System.out.println("String benzersiz karakterlere sahip");}


    }
}
