package test.day07;

public class TopZiplama {
    public static void main(String[] args) {
           /*
    //Bir top belirli yükseklikten atılmaktadır.
    // Atıldıktan sonra, atıldığı yüksekliğin 3/4 u kadar yerden yukarı doğru zıplamaktadır
    // Top zıplama  yüksekliği 1 metrenin altına indiğinde durmaktadır.
    // Bu ana kadar aldigi toplam yolu ve yere vurma sayısını bulan do
    // while code blogu create ediniz.
         */
        double yukseklik=2;
        double topYol=0;
        int yereVurmaSayisi=0;

        do {
            topYol+=yukseklik;
            yereVurmaSayisi++;
            yukseklik*=0.75;
            topYol+=yukseklik;



        }while(yukseklik>=1);
        System.out.println("Topun aldigi yukseklik :"+topYol
        +"\nToplam yere vurma sayisi: "+yereVurmaSayisi);


    }
}
