package SampleQuestion;

public class Soru43 {
    /*

                -------------------------------------------------------------------------------------------------------------
                Soru 43-)
        Biri parametreli, diğeri parametresiz 2 constructor oluşturun.
        Bu const. kullanarak en az 2 nesne oluşturun ve konsolda bu nesnelerin özellikleri yazdırın
        Ipucu: Constructor konusunu pratik yapalım. Nesnelerin rengini adını sayısını gönderelim sonra cagırıp konsolda yazdıralım.*/

String ad="Humeyra";
int yas=36;
boolean seviyorMu= true;
String kimi="Fatih`i";
    public Soru43() {
        System.out.println("Sevgili guzel kizim...");

    }

    public Soru43(String ad, int yas, boolean seviyorMu, String kimi) {
        System.out.println("herseyi verdim.");
        this.ad = ad;
        this.yas = yas;
        this.seviyorMu = seviyorMu;
        this.kimi = kimi;
    }

    public static void main(String[] args) {

        Soru43 obj1=new Soru43("Azra",10,false,"Beni");

       System.out.println(obj1.seviyorMu);
        Soru43 obj2=new Soru43();

        System.out.println(obj2);//Sevgili guzel kizim...
       //SampleQuestion.Soru43@4c203ea1


        System.out.println(obj2.yas);//36

    }

}
