package test.day07;

import java.util.Random;
import java.util.Scanner;

public class TasKagitMakas {
    public static void main(String[] args) {
        //Bilgisayara karsi tas kagit makas oyunu oynayin
        //5 puana ilk ulasan oyunu oynar.
        Scanner scan=new Scanner(System.in);
        Random random=new Random();
        int userChoise=0;
        int compChoise=0;
        int user=0;
        int comp=0;

        do {
            //Kullanicinin secimini aldik.
            System.out.println("Asagidakilerden birini seciniz." +
                    "\n1-Tas" +
                    "\n2-Kagit" +
                    "\n3-Makas");
            userChoise=scan.nextInt();
            //Bilgisayarin secimini aliyoruz.
            compChoise=random.nextInt(3)+1;
            //Karsilastirilmasi ve puanlamasi

            if(userChoise==1&&compChoise==2){
                System.out.println("Kagit tasi sarar!---Bilgisayar+1");
                comp++;
                System.out.println("oyuncu = "+user+"//Bilgisayar ="+comp);
            }else if (userChoise==1&&compChoise==3){
                System.out.println("Tas makasi kirar!---oyuncu+1");
                user++;
                System.out.println("oyuncu = "+user+"//Bilgisayar ="+comp);}
            else if (userChoise==2&&compChoise==1){
                    System.out.println("Kagit tasi sarar!----oyuncu+1");
                    user++;
                    System.out.println("oyuncu = "+user+"//Bilgisayar ="+comp);}
            else if (userChoise==2&&compChoise==3){
                System.out.println("Makas kagidi keser!---bilgisayar+1");
                comp++;
                System.out.println("oyuncu = "+user+"//Bilgisayar ="+comp);
            }else if (userChoise==3&&compChoise==1){
                System.out.println("Tas makasi kirar!---bilgisayar+1");
                comp++;
                System.out.println("oyuncu = "+user+"//Bilgisayar ="+comp);}

             else if (userChoise==3&&compChoise==2){
                System.out.println("Makas kagidi keser!---oyuncu+1");
                user++;
                System.out.println("oyuncu = "+user+"//Bilgisayar ="+comp);

            }else {
                System.out.println("Berabere!");
                System.out.println("Oyuncu= "+user+"//Bilgisayar= "+comp);
            }


        }while (user!=5&&comp!=5);
        if(user>comp)
            System.out.println("Sen kazandin!!!");
        else System.out.println("Maalesef kaybettin");



    }
}
