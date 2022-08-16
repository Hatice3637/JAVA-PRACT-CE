package day09_P_P;

public class Müşteri {
    public static void main(String[] args) {

        Mutfak menu =new Mutfak();

        System.out.println("menu.toString() = " + menu.toString());

        Mutfak siparisim=new Mutfak("adanakebab","mercimek","kunefe","salgam");

        System.out.println("siparisim = " + siparisim);


    }
}

