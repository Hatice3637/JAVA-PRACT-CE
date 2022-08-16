package practis_recap;

public class Q10_NestedTernary {

    /*
    Final notu tanimlayin, Nested Ternary ile cozunuz
    'A'  ->  "Gayet Basarili"
    'B'  ->  "Basarili"
    'C'  ->   "Ha gayret"
    bu notlar disindakilere de Digerleri.. yazdiriniz
     */

    public static void main(String[] args) {

        char finalnotu='b';


        String result=finalnotu=='a'?"gayet basarılı": finalnotu=='b'?"basarılı":finalnotu=='c'?"ha gayret":"diğerleri";
        System.out.println("result = " + result);
    }


}
