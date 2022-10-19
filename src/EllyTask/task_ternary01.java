package EllyTask;

public class task_ternary01 {
    public static void main(String[] args) {


        /*
         * Ternary kullanarak bir kod yazin. fiyat isminde bir variable tanimlayin. eger fiyat
         * 10 dan az ise "ucuz" , 10 ile 20 arasinda ise "normal" , 20 ve 20 den buyuk ise pahali
         * olsun
         */

double fiyat =20;
String result=fiyat<10 ?"ucuz":fiyat<20? "normal":"pahalı";
        System.out.println("reult="+result);



    }
}
