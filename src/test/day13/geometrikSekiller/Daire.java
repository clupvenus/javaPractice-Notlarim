package test.day13.geometrikSekiller;

import java.util.Scanner;

public class Daire implements IISlemler {
    Scanner scan=new Scanner(System.in);
    int yaricap= 0;
    @Override
    public void alan() {
        System.out.println("Dairenin yaricapini giriniz.");
        yaricap=scan.nextInt();

        System.out.println("Alan: "+(yaricap*yaricap*3.14));

    }

    @Override
    public void cevre() {
        System.out.println("Cevre : "+(2*yaricap*3.14));

    }
}
