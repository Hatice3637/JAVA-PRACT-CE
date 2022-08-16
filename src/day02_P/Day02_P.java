package day02_P;

import java.util.Scanner;

public class Day02_P {


    public static void main(String[] args) {


//Bir degisken tanimlayin : x
        //Baska bir degiskeni initialize edin : y
        //x degiskenini initialize edin
        //y degiskenini yeni bir degerle guncelleyin


    int x;
    int y=2000;
    x=30;
    y=1;

        System.out.println("x = " + x);
        System.out.println("y = " + y);


    /*
    yazdırılamayan karakterleri karakter ve dize değişmezlerine koymak için kullanılırlar .
    Örneğin, sekme, satır başı ve geri alma gibi karakterleri bir çıkış akışına koymak için kaçış dizilerini kullanabilirsiniz.
	  \n (or \r): starts from a new line : metni bir alt satirdan itibaren yazdirir.
	          \t:  horizontal tab : metni yatayda 1 tab miktari kaydirir.
	          \\: prints a back slash :\ (ters slash) yazdirir
	          \': prints single quote :' tek tirnak yazdirir.
	          \": prints double quote :"" cift tirnak yazdirir.
	 \: backslash
	 /:front slash
	 */

        //  Soru-1 :   konsola   "Hello ", "World \ //"   seklinde yazdiriniz

        System.out.println("\"Hello \", \"World \\ //\"");


// Soru-2 : Pazartesi kelimesini her harfini ayri bir satira gelecek sekilde yazdırınız.

        System.out.println("P\na\nz\na\nr");
        //Soru-3 : "Java" ile hayat cok 'afilli' yazdiriniz

        System.out.println("\"Java\" ile hayat cok \'afilli\' ");

        //Soru-4 : "Zaruret" insani
        //         'kasif'  yapar   yazdiriniz
        // sonraki "TechProEd ile java cok kolay ..." ifadesi  3 satir sonra ve satir basindan 1 tab ileride yazilsin, hepsini tek kod satırı ile yazdiriniz.

        System.out.println("\"Zaruret\" insani \'kasif\' yapar\n\n\n\t\"Tecproed ile java çok kolay...");



    /*
        double num1 = 23.4;
        double num2 = 24.0;
        double num3 = 12;
        double num4 = 450.3;
        double num5 = 23000;
        bu double sayilarin ortalamasini bulunuz
     */

        double num1 = 23.4;
        double num2 = 24.0;
        double num3 = 12;
        double num4 = 450.3;
        double num5 = 23000;

        double toplam=num1+num2+num3+num4+num5;
                double ort=toplam/5;
        System.out.println("ort = " + ort);

/*
        galonu litreye ceviren bir java programi yaziniz
            1 gallon = 3.785 litre
        litreyi galona ceviren bir java programi yaziniz
            1 litre = 1/3.785 gallon
        // Sıcaklığı Fahrenhayt'tan Santigrat derecesine çeviren bir Java programı yazın.
        // formül
        // c = (f-32)*5/9
     */

        int gallon= 1000;
        double litre=gallon*3.785;
        String sonuc1= gallon + "galon degeri" +litre +" litreye esittir";
        System.out.println(sonuc1);


        int l=1000;
        double g=l/3.785;
        System.out.println(l +"litre degeri " + g + " gallon esittir");


        // Sıcaklığı Fahrenhayt'tan Santigrat derecesine çeviren bir Java programı yazın.
        // formül
        // c = (f-32)*5/9

         Scanner scan =new Scanner(System.in);
        System.out.println("fahrenayt değerini giriniz");
        int fh=scan.nextInt();

        System.out.println("Girdiginiz fahrenayt degeri : " + fh + " karsiligi " + (fh-32)*5/9 + " santigrat derecedir.");

        // kullanicidan 2 tam sayi alin
        // bu tam sayilari toplayin ve sonucu yazdirin



        System.out.print("birinci sayiyi giriniz : ");
        int sayi1 = scan.nextInt();
        System.out.print("ikinci sayiyi giriniz : ");
        int sayi2 = scan.nextInt();

        System.out.println("iki sayinin toplami : " + (sayi1 + sayi2));




    }

}
