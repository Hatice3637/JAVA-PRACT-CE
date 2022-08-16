package practis_recap;

import java.util.Scanner;

public class Q07_BMISiniflama {

		/*
		 *  Kullanicidan boyunu  CM  ve kilosunu kg alarak  BMI (VKE) hesaplayiniz
		 *
		BMI = kilo(kg) /(boy*boy)(m)
		BMI <=20 oldukca zayifsiniz
		20<BMI<=25 Normal sinirlardasiniz
		25<BMI<=30 Sisman kategorisindesiniz
		30<BMI ==> Obez grubundasiniz.

		 */

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("boyonuzu cm olarak giriniz");
        double boy=scan.nextDouble()/100;  //boyu metreye dönüştürdük

        System.out.println("kilonuzu k olarak giriniz");
        double kilo= scan.nextDouble();

        double BMI = kilo /(boy*boy);


        if(BMI <=20){
            System.out.println("oldukça zayıfsınız");
        }else if(BMI<=25){
            System.out.println("Normal sinirlardasiniz");
        }else if (BMI<=30){
            System.out.println("Sisman");
        }else if(BMI>30){
            System.out.println("Obez");
        }







    }




}
