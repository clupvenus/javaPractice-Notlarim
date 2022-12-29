package SampleQuestion;

import java.util.ArrayList;
import java.util.List;

public class Soru30 {
    public static void main(String[] args) {
        /*
        --------------------------------------------------------------------------------------------------------------
    Soru 30-)
    Bir Stringdeki yinelenen karakterleri Array String olarak döndüren bir kod yazın.
            ( mülakat sorusu )
    Örnek:
    String str="Javacokkolay"
    Yinelenen karakterler : [a, o, k]
    İpucu: İçiçe for looplar, String Manupulations ve ifler kullanrak çözebilrsiniz.
    Stringdeki bir harfi Stringde bulunan diger harfler ile karşılaştırıpkonteynıra atacaksınız bu yüzden iç içe loop kullanmak mantıklı duruyor


         */
        String str="Javacokkolay";
        List<String> yenilenler= new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            for (int j = i+1; j <str.length() ; j++) {
                if(str.substring(i,i+1).equalsIgnoreCase(str.substring(j,j+1)))
                    if(!yenilenler.contains(str.substring(i,i+1))){
                    yenilenler.add(str.substring(i,i+1));}


            }

            }
        System.out.println(yenilenler);

        }

    }
