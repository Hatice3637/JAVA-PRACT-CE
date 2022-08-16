package day01_P;

public class Day01_P {



    public static void main(String[] args) {


    /*
  Konsolda asagidaki ciktiyi yazdiriniz
        T
        E
        C
        H
        P
        R
        O
        E
        D
        U
        C
        A
        T
        I
        O
        N
         */

        System.out.println("T");
        System.out.println("E");
        System.out.println("C");
        System.out.println("H");
        System.out.println("P");
        System.out.println("R");
        System.out.println("O");
        System.out.println(" ");
        System.out.println("E");
        System.out.println("D");
        System.out.println("U");
        System.out.println("C");
        System.out.println("A");
        System.out.println("T");
        System.out.println("I");
        System.out.println("O");
        System.out.println("N");



 /*
  println() ve print() arasinda tek fark var;
  println satir atliyor,
  print ise imlecin ayni satirda kalmasini sagliyor.
   */
        System.out.println("****println****");
        System.out.println("welcome");
        System.out.println("java");
        System.out.println("practice_elifhoca");


        System.out.println("****print****");
        System.out.print("welcome");
        System.out.print(" java");
        System.out.print(" class");


     /*
         * Primitive data type
                byte: only takes whole numbers
	 	        short: only takes whole numbers
	 	        int(used more often): only takes whole numbers
	 	        long: only takes whole numbers
	 	        float: can take decimals (MUST have F or f at the end)
	 	        double( used more often): can take decimals
	 	        boolean: true or false boolean expressions
	 	        char: character within single quote ''
	 	        	 	also takes number
         * Range: double > float >long > int >short > byte
         */

        //byte, short, integer,long, double, float veri tiplerinin max ve min degerlerini yazdiralim.

int intMax= Integer.MAX_VALUE;
int intMin= Integer.MIN_VALUE;
        System.out.println("intMax = " + intMax);
        System.out.println("intMin = " + intMin);

   byte bytMax= Byte.MAX_VALUE;
   byte bytMın= Byte.MIN_VALUE;

        System.out.println("bytMax = " + bytMax);
        System.out.println("bytMın = " + bytMın);


        short shortMax= Short.MAX_VALUE;
        short shortMın= Short.MIN_VALUE;

        System.out.println("shortMax = " + shortMax);
        System.out.println("shortMın = " + shortMın);

        long lonMax= Long.MAX_VALUE;
         long lonMın= Long.MIN_VALUE;

        System.out.println("lonMax = " + lonMax);
        System.out.println("lonMın = " + lonMın);


        //Her veri turuyle bir tane olmak uzere 4 degisken olusturun (float, double, char, boolean)
        //Degiskenler icin anlamli isimler kullanip, yazdiralim

        float laptopFiyat=999.99f;
        double kilometre=34.56;
        char harf='A';
        boolean guzelMİ=true;

        System.out.println("guzelMİ = " + guzelMİ);
        System.out.println("harf = " + harf);
        System.out.println("laptopFiyat = " + laptopFiyat);
        System.out.println("kilometre = " + kilometre);

        // Initializing Variable  //variable baslangic degeri verme

        int yas = 33;
        double boy = 1.70;

        System.out.println("yas :" + yas);
        System.out.println("boy : " + boy);


// To copy the variable's value

         int yasim=23;
         int enesYas=yasim;

        System.out.println("enesYas = " + enesYas);
        System.out.println("yasim = " + yasim);



        // you can declare multiple variables in the same line

        int yil=2022 , ay=6 , gun=20;

        // updating a variable

        yil=2032;
        System.out.println("update yil = " + yil);



    }

}
