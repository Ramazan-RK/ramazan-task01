package BenimJava.J08_İfStatement_TernaryOperators;

import java.util.Scanner;

public class example_04 {
    public static void main(String[] args) {
     /*Task -> girilen bir karakterin harf olup olmadığını kontrol eden code create ediniz/*

      */

         /*
          TASK -> girilen bir karakterin harf  olup olmadığını  kontrol eden code create ediniz..

         */
        Scanner sc = new Scanner(System.in);

        System.out.print("bir karakter  giriniz : ");

        char krktr = sc.nextLine().charAt(3);

        if ((krktr>='A'&&krktr<='Z')||(krktr>='a'&&krktr<='z')){
            System.out.println("giridiginiz karakter harfdir :)");
        }else System.out.println("girdiğiniz  karakter harf değildir :(");









    }
}
