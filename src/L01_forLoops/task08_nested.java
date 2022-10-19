package L01_forLoops;

import java.util.Scanner;

public class task08_nested {
    public static void main(String[] args) {
      /*
      task=girilen boyutta kare çarpım tablosu print eden code  create ediniz

       */

        Scanner sc=new Scanner(System.in);
        System.out.println("lütfen bir boyut giriniz");
        int boyut= sc.nextInt();

        for (int i = 1; i <boyut ; i++) {
            for (int j = 1; j <boyut; j++) {
                System.out.print(" "+(i*j));
                }
            System.out.println();//dumy

            }

        }




    }

