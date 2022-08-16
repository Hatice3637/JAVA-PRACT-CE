package practis_recap;

import java.util.Scanner;

public class Q04_NotHesaplama {

        /*
         * Kullanicidan alacaginiz vize2 vize2 ve final notlarini
         * vize ortalamasinin %30'u final notunun %70 alarak gecme notunu hesaplayiniz
         */


    public static void main(String[] args) {


      Scanner scan=new Scanner(System.in);
      int vize1;//inşirayz
      int vize2;
     int finalnot;

        System.out.println("vize1");
        vize1= scan.nextInt();//atama

        System.out.println("vize2");
        vize2=scan.nextInt();

        System.out.println("finalnot");
        finalnot= scan.nextInt();

        double sonuç=((vize1*vize2)/2*0.3 + finalnot*0.7);
        System.out.println("sonuç = " + sonuç);


    }

}
