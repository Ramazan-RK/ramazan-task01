package C11_metodCreation;

public class C04_MethodDepo {
    /*her class da main method mecburiyeti yoktur*/

    //main method yok
    public static void geçmeNotu(int not){

        if (not>=85){
            System.out.println("agam tebrik çook başarılı:)");
        } else if (not>=70) {
            System.out.println("agam başarılı");


        } else if (not>=60) {
            System.out.println("sadece geçtin");

        } else if (not>=45) {
            System.out.println("aga ucuz yırttın");

        } else System.out.println("agam fena çaktın");



    }



}







