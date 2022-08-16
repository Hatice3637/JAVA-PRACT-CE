package practis_recap;

public class Q11_Ternary {



    /*
     * Ternary kullanarak bir kod yazin. fiyat isminde bir variable tanimlayin. eger fiyat
     * 10 dan az ise "ucuz" , 10 ile 20 arasinda ise "normal" , 20 ve 20 den buyuk ise pahali
     * olsun
     */

    public static void main(String[] args) {

        int fiyat=10;
        String result=fiyat<10?"ucuz":fiyat<20 ? "normal" : "pahalı";
        System.out.println("result = " + result);
    }
}
