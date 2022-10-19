package L01_forLoops;

import java.util.Scanner;

public class task7_nested {
    public static void main(String[] args) {
      /*
      task girilen boyutta bir kare için

       */

        Scanner sc=new Scanner(System.in);
        System.out.println("lütfen bir sayı giriniz");
        int sayi = sc.nextInt();


        for (int i = 0; i <sayi;i++) {
            for (int j = 0; j < sayi; j++) {
                if (i == j)
                    System.out.print(1);
                else
                    System.out.print(0);
            }
            System.out.println();


        }
    }
}
