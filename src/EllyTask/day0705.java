package EllyTask;

import java.util.Scanner;

public class day0705 {
    /* Kullanicidan sayilar girmesini isteyin
     * ve girdigi sayilari toplayip yazdirin.
     * yeni sayi isteyin
     * girilen sayilarin toplami 100 'u gecerse
     * "... kere sayi girdin. Bu kadar sayi yeter" yazdirin ve oyunu bitirin
     *
     */

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("sayı giriniz");



        int toplam=0;
        int count=0;

        for (int i = 0; i < 100; i++) {
            count++;
            int sayi= scan.nextInt();
            toplam+=sayi;
            if (toplam>100){
                System.out.println(count+"kere sayı girdin.bu kadar sayı yeter.");
                break;

            }
            System.out.println("toplam="+toplam);







        }



















    }



}
