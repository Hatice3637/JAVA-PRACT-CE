package practis_recap;

import java.util.Scanner;

public class Q01_Modulus {
    /*
     *  Kullanicidanalacaginiz 5 basamakli sayinin ilk 2 ve son iki basamagindaki rakamlari toplamini bulunuz
     *
     *   Ex :
     *   input  : 12345
     *   output : 12
     */

    public static void main(String[] args) {


        Scanner scan=new Scanner(System.in);
        System.out.println("5 basamaklı sayı giriniz");
        int num=scan.nextInt();

        int ilkiki=num/1000;
        int soniki=num%100;//100 e bolümünden kalan

        int ilkikitoplam=(ilkiki/10) + (ilkiki%10);
        int sonikitoplam=(soniki/10) + (soniki%10);

        System.out.println("sayıların toplamı :" + (ilkikitoplam+sonikitoplam));



    }
}
