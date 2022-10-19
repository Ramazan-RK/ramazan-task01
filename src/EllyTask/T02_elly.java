package EllyTask;

import java.util.Scanner;

public class T02_elly {
    public static void main(String[] args) {


        /*kullanıcıdan aalacağını5 basamaklı sayınıın ilk 2 ve son iki basamağındaki rakammları toplamını
        bulunuz


        * input:12345
        output:12
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("5 basamakli bir sayi giriniz : ");
        int sayi = scan.nextInt();
        int ilkIki =sayi/1000; //12
        int sonIki = sayi%100; //45
        int ilkIkiTop = (ilkIki/10) + (ilkIki%10); //1+2
        System.out.println("ilkIkiTop = " + ilkIkiTop);
        int sonIkiTop = (sonIki/10) + ( sonIki%10); //4+5
        System.out.println("sonIkiTop = " + sonIkiTop);
        System.out.println("esas toplam = " + (ilkIkiTop + sonIkiTop));









    }
}
