package SampleQuestion;

import java.util.Arrays;

public class Soru39 {
    public static void main(String[] args) {
        /*
        Soru-39)
Bir tamsayı dizisini (Int Array) girdi olarak kabul eden ve verilen bu (Arrayden) diziden minimum ve maksimum sayıları yazdıran
 bir yöntem yazın
Örnek:
Input : {3,2,5,4,1,6}
Output :
min: 1
max: 6
Ipucu: sort yöntemni kullanabilirsiniz.
*/
        int[] arr={5,4,6,8,9,7,12,56,45,23};
        Arrays.sort(arr);
        System.out.println("Minumum sayi = "+arr[0]+"\nMaksimum sayi = "+arr[arr.length-1]);


    }
}
