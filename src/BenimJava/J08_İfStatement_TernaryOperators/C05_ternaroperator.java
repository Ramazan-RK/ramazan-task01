package BenimJava.J08_İfStatement_TernaryOperators;

import java.util.Scanner;
import java.util.SortedMap;

public class C05_ternaroperator {
    public static void main(String[] args) {

        // TASK-> girilen bir tamsayı çiftse yarısını değilse "girilen sayı tek oldugu için yarısı tamsayı değildir"
        // print eden code create ediniz

        Scanner sc=new Scanner(System.in);
        System.out.println("sayı giriniz");
        int a=sc.nextInt();

        System.out.println(a%2==0? a/2: "girilen sayı tek sayı sayıdır");



    }
}
