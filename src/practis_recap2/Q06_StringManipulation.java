package practis_recap2;

import java.util.Scanner;

public class Q06_StringManipulation {
    //Scanner kullanarak iki ayri deger giriniz ve bu iki kelimeyi method kullanarak birlestiriniz.

    //yukardaki ornekte verilen ilk ve ikinci degiskenlerinin ilk harflerini atip birlestiriniz.


    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("String1 :");
        String str1=scan.nextLine();

        System.out.println("string2 :");
        String str2=scan.nextLine();

        System.out.println("1.yöntem :" +str1 + " " +str2);
        System.out.println("2.yöntem :" +str1.concat(" "+str2));


        String str1_al=str1.substring(1);
         String str2_al=str2.substring(1) ;

        System.out.println("son işlem :" +str1_al + " " + "" + str2_al);

    }
}
