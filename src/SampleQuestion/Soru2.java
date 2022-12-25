package SampleQuestion;

public class Soru2 {
    public static void main(String[] args) {
       /* Soru-2)   SOUT/SYSO
        Dikdortgenin alanini ve cevresini hesaplayan kodu yaziniz.
                Ipuclari:
* Dikdortgenin Cevresi: 2 * (uzun kenar + kisa kenar)
* Dikdortgenin Alani : uzun kenar * kisa kenar (edited)

        */
        int uzunKenar=45;
        int kisaKenar=25;
        int alani= uzunKenar*kisaKenar;
        int cevre= 2*(uzunKenar+kisaKenar);
        System.out.println(alani);
        System.out.println(cevre);

    }
}
