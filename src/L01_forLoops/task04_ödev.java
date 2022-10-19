package L01_forLoops;

import java.util.Scanner;

public class task04_ödev {
    private static Scanner scan;

    public static void main(String[] args) {


        //---TASK03---

	 /* Kullanıcıdan aldığımız sayının, asal olup olmadığını return eden
      bir method create ediniz.*/


       /*
        Scanner scan = new Scanner(System.in);

        System.out.println("bir sayi giriniz");
        int sayi = scan.nextInt();
        int sayac = 0;
        for (int i = 2; i < sayi; i++) {
            if (sayi % i == 0) {
                sayac++;


            }

        }
        if (sayac == 0) {
            System.out.println(sayi + "asal bir sayıdır");

        } else {
            System.out.println(sayi + "asal bir sayi değildir");

        }


 /*
        0 ile 100 arasındaki hem 5'e, hem de 4'e bölünebilen  sayıları print eden coode create edinz.
         */

        for (int i = 0; i < 100; i++) {
            if (i % 5 == 0 && i % 4 == 0)
                System.out.println(i + " ");

        }


        /* İlk 10 doğal sayının toplamını hesaplamak için bir kod yazın.
         */



        int sayi=11, toplam=0;
        for (int i = 0; i < sayi; i++) {

            toplam=toplam+i;

        }
        System.out.println("toplam="+toplam);




























    }





}



