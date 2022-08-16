package day05_P;

import java.util.Scanner;

public class Q01_ForLoop {

     /*Kullanıcıdan bir harf girmesini isteyiniz. Girilen harf sesli ise Sesli harf olduğunu,
     değilse sessiz harf olduğunu ekrana yazdırsın. Girdiği değer harf değilse yada
     1 karakterden fazla ise hata mesajı göstersin. (Test girilen harfi büyük yada küçüklüğüne duyarlıdır.)
     Sesli harfler: a,e,i,o,u

     Test Data:
     a
     Beklenen Çıktı:
     a harfi sesli harfdir.

     Test Data:
     d
     Beklenen Çıktı:
     d harfi sesiz harftir.

     Test Data:
     we  yada  %

     Beklenen Çıktı:
     Yanlis karakter girdiniz!

     */

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("ır harf gırınız");
        String harf=scan.next().toLowerCase();

        String sesliharf="aeiou";
        String sessizharf="bcdfghjklmnpgrstvwyz";

        if(harf.length()==1){
            for (int i = 0; i <sesliharf.length() ; i++) {
                if(sesliharf.contains(harf)){
                    System.out.println("sesli harf");
                    break;
                }else if(sessizharf.contains(harf)){
                    System.out.println("sessizharf");
                    break;

                }else{
                    System.out.println("yanlış karakter girdiniz");
               break;
                }

            }
        }else System.out.println("tek karakter girdiniz");

    }

}