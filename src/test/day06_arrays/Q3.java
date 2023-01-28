package test.day06_arrays;

public class Q3 {
    public static void main(String[] args) {
        /*
        kullanicinin istedigi buyuklukte bir diizye 0-100 arasi rasgele sayilarla doldurup
        kacinin ortalamanin altinda
        kacinin uzerinde oldugunu bulan method olusturun.
         */
        int[] arr={2,2,5,45,6,56,8,54,17,27,32};
        ortalamaHesapla(arr);
        //Ortalamanin altinda 6 kadar sayi var.
        //Ortalamanin ustunde 5 kadar sayi var.
    }

    private static void ortalamaHesapla(int[] arr) {

        int toplam=0;

        for (int each:arr
             ) {
            toplam+=each;

        }
        int ortalama=toplam/arr.length;
        int ortalamaUstu=0;
        int ortalamaAlti=0;

        for (int each:arr
             ) {
            if(each>ortalama)
            ortalamaUstu++;
            else if (each<=ortalama) {
                ortalamaAlti++;
            }
        }
        System.out.println("Ortalamanin altinda "+ortalamaAlti+" kadar sayi var."+
                "\nOrtalamanin ustunde " +ortalamaUstu+" kadar sayi var.");




    }
}
