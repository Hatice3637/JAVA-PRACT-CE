package day03_P;

import java.util.Scanner;

public class Day03_P {

    public static void main(String[] args) {


// kullaniciya ad, memleket,su anki konum, yas, boy soran bir program olusturun,
        // ve yasadiklari yeri seviyorlarsa
        // bu bilgiyi yazdirin

        // next() only can read the first word
        // nextLine() can read the whole line

        Scanner scan = new Scanner(System.in);
        System.out.println("isminizi giriniz");
        String isim = scan.nextLine();

        System.out.println("memleketiniz");
        String memleket = scan.nextLine();

        System.out.println("konumuz");
        String konum = scan.nextLine();

        System.out.println("yasınız");
        int yaş = scan.nextInt();

        System.out.println("boyunuz");
        double boy = scan.nextDouble();

        System.out.println("yasadiginiz " + konum + " seviyor musunuz? t/f");
        boolean seviyorMU = scan.nextBoolean();

        System.out.println("isim = " + isim);
        System.out.println("memleket = " + memleket);
        System.out.println("konum = " + konum);
        System.out.println("yaş = " + yaş);
        System.out.println("boy = " + boy);
        System.out.println("seviyorMU = " + seviyorMU);


        /*
         * KullanicidanY/N ikilisinden birisini girdiginde girdigi degeri
         * ekrana yazdiran java kodunu yaziniz.
         * INPUT : Y ,  N
         * OUTPUT : YES ; NO
         */


        System.out.println("Y veya N ikilisinden birini giriniz");
        char karakter = scan.next().charAt(0);

        if (karakter == 'Y' || karakter == 'y') {
            System.out.println("YES");
        } else if (karakter == 'N' || karakter == 'n') {
            System.out.println("NO");
        } else
            System.out.println("Y veya N ikilisinden bİrini giriniz");



  /*
    not hesaplayici
		   	A => 90 ~100
		   	B => 80 ~ 89
		   	C => 70 ~ 79
		   	D => 60 ~ 69
		   	F =>  0 ~ 59
     */

        System.out.println("bir not giriniz");
        int not = scan.nextInt();

        if (not >= 90 && not <= 100) {
            System.out.println("A");
        } else if (not < 90 && not >= 80) {
            System.out.println("B");
        } else if (not < 80 && not >= 70) {
            System.out.println("c");
        } else if (not < 70 && not >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }

/*
        Print "Lutfen is unvaninizi girin
        jobTitle isimli bir degisken olusturun ve kullanicidan isteyin.
        Dogru jobTitle yazdirmak icin asagidaki test datalarini kullanin. Example :
        Eger jobTitle  qa ise print is unvaniniz Quality Analyst
        test data: qa ise print Quality Analyst
        dev ise print Developer
        ba ise print Business Analyst
        pm ise print Project Manager
       */


        System.out.println("lütfen iş ünvanınızı giriniz");
        String job = scan.nextLine().toLowerCase();

        if (job.equals("ga")) {
            System.out.println("Quality a");
        } else if (job.equals("dev")) {
            System.out.println("developer");
        }else if(job.equals("ba")){
            System.out.println("Business Analyst");
        }else if(job.equals("pn")){
            System.out.println("Project Manager");
        }


        switch (job){

            case "qa":
                System.out.println("Quality a");
                break;
            case "dev":
                System.out.println("developer");
                break;
            case "ba":
                System.out.println("Business Analyst");
                break;
            case "pm"  :
                System.out.println("Project Manager");
                break;
            default:
                System.out.println("yanlış ise doğru bilgi giriniz");
                break;
        }
    }

}