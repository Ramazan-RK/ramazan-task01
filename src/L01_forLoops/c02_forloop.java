package L01_forLoops;

import java.util.Scanner;

public class c02_forloop {



    public static void main(String[] args) {


        Scanner sc=new Scanner(System.in);
        System.out.println("pozitif taM SAYI GİRİNİZ");

        int sayi= sc.nextInt();

       if(sayi>100){
           System.out.print("100 den küçük girin");

       }
        for (int i = sayi; i <100 ; i++) {

            if (i%4==0){
                System.out.println(i+" ");


            }

        }






    }

}
