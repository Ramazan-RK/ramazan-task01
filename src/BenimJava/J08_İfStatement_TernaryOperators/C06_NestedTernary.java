package BenimJava.J08_İfStatement_TernaryOperators;

import java.util.Scanner;

public class C06_NestedTernary {
    public static void main(String[] args) {

        /*
    TASK :
   Kullanicidan bir sayi aliniz
   Sayi 0 dan buyuk esit ise 10 dan kucuk olup olmadigini kontrol ediniz.
  10 dan kucuk ise ekrana "Rakam" yazdiriniz degilse "Pozitif Sayi" yazdiriniz.
   Sayi o dan kucuk ise ekrana "Negatif Sayi" yazdiriniz.
   */


        Scanner sc=new Scanner(System.in);
        System.out.println("sayı giriniz");
        int a=sc.nextInt();

//iç içe kod

        System.out.println(a>=0 ?(a<10?"rakam":"pozitif"):"negatşf sayı");


    }


}
