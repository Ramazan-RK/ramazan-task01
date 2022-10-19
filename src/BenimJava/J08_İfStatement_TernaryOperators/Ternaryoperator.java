package BenimJava.J08_İfStatement_TernaryOperators;

import java.util.Scanner;

public class Ternaryoperator {
    public static void main(String[] args) {


// TASK-> girilen bir tamsayının 2 veya daha fazla basamkalı olmasını kontrol eden code create ediniz.


        Scanner sc=new Scanner(System.in);

        System.out.println("bir sayı giriniz");
        int a=sc.nextInt();

        System.out.println(a>9?"sayı iki veya daha fazla basamaklıé":"sayı tek basamaklı");
;
       String sonuç=a>9?"sayı iki veya daha fazla basamaklıé":"sayı tek basamaklı";

        String sonuc =( a > 9 ||a<-9)? " sayı iki veya daha fazla basamaklı  " : "sayı tek basamaklı";
        System.out.println(sonuc);


    }
}
