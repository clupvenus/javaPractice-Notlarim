package SampleQuestion;

public class Soru40 {
    public static void main(String[] args) {
        /*------------------------------------------------------------------------------------------------------------
Soru-40)
Bir diziyi (Array) parametre olarak kabul eden ve dizideki tüm elemanların toplamını döndüren bir
method yazın ve ardından sonucu main methodda yazdırın.
Örn:
girdi : {1,2,3,4,5,6,7,8}
çıkış: 36
ıpucu: For Loop ile arrayin elemanlarını toplayın ve methodu yazdırarak döndürün
-------------------------------------------------------------------------------------------------------------
*/

        int[] arr={5,56,4,5,12,13};

        ArrayToplami(arr);

    }

    private static void ArrayToplami(int[] arr) {
        int top=0;
        for (int i = 0; i < arr.length ; i++) {
            top+=arr[i];

        }
        System.out.println("Arraydeki sayilarin toplami : "+top);

    }
}
