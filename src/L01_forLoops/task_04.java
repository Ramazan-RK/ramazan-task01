package L01_forLoops;

import java.util.Scanner;

public class task_04 {
    public static void main(String[] args) {

/*
girilen iki sayı arasındaki çif sayıları print eden code create ediniz
 */


        Scanner sc=new Scanner(System.in);
        System.out.println("birinci sayıyı giriniz");
        int sayi1= sc.nextInt();



        System.out.println("ikinci sayıyı giriniz");
        int sayi2= sc.nextInt();

        if (sayi1<sayi2){

            for (int i = sayi1; i < sayi2; i++) {
                if (i % 2 == 0) {//döngü içindeki sayıların çift kontrolu

                    System.out.print(i + " ");
                }
            }

        }else System.out.println("hatalı giriş yaptınız");


    }
}
