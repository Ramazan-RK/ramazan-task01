package EllyTask;

public class task09_simetrikarraySorusu {
    public static void main(String[] args) {

        /*
         *  Verilen bir cumledeki bosluklar haric character sayisini bulunuz.
         *  Cumle: Verilen bir cumledeki bosluklar haric character sayisini bulunuz.
         */

        //1.yol
        String str = "Verilen bir cumledeki bosluklar haric character sayisini bulunuz.";
        System.out.println( str.replace(" ", "").length()); //58
        //2.yol
        String [] arr = str.replace(" ", "").split("");
        System.out.println(arr.length); //58
        //3.yol



//Kullanicidan bir cumle isteyin ve kelime sayisini yazdirin.






    }
}