package EllyTask;

import java.util.Scanner;

public class day07 {
    // girilen sayının basamaklarındaki rakamların toplamını bulunuz.

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("lütfen bir sayı giriniz");
        int sayi=sc.nextInt();

        int toplam = 0;
        while (sayi!=0) {
            toplam=(sayi%10)+toplam;
            sayi/=10;

        }


        System.out.println("basamak:"+toplam);



    }
    //do while ile çöz
    //for ile çöz
}
