package BenimJava.j04_AritmetikOperators;

import java.util.Scanner;

public class task_aritmetikOperators {
    public static void main(String[] args) {

        // TASK01

        int x = 4;
        x++;
        x += x;
        --x;
        x = 7 + x;
        x *= x;
        x -= 3;

        System.out.println(" x = " + x );

        int a = 3;
        double d = 4.5;

        d+=a;
        a+=d;
        d-=a;
        a-=d;

        System.out.println(" d = " + ++d );
        System.out.println(" a = " + a-- );

        //task2
        /*int num = 1;
        System.out.println("multiplication table for 1");
        System.out.println("1x"+num+"="+(1*num++));
        System.out.println("1x"+num+"="+(1*num++));
        System.out.println("1x"+num+"="+(1*num++));
        System.out.println("1x"+num+"="+(1*num++));
        System.out.println("1x"+num+"="+(1*num++));
        System.out.println("1x"+num+"="+(1*num++));
        System.out.println("1x"+num+"="+(1*num++));
        System.out.println("1x"+num+"="+(1*num++));
        System.out.println("1x"+num+"="+(1*num++));
        System.out.println("1x"+num+"="+(1*num++));/*



        /*
         * Kullanicidan uc basamakli bir sayi alin
         * ve sayinin rakamlarini birler,onlar ve yuzler basamagi olarak yazdirin
         *
         *
         * Ornek : Inputs : 853
         * Output : Girdiginiz sayinin birler basamagi : 3
         *          Girdiginiz sayinin onlar basamagi : 5
         *          Girdiginiz sayinin yuzler basamagi : 8
         *
         *
         */

        Scanner scan = new Scanner(System.in);
        System.out.print("3 basamaklı bir sayı giriniz : ");

        int sayi = scan.nextInt();

        // 1 ler basamgı-> bir sayının 10 bolumunden kalan 1 ler basmagıdır..
        int birler = sayi % 10;//sayının birler basamagı
        sayi /= 10;// sayı 10 bolumunden bolumu verir 853/10->85
        int onlar = sayi % 10;// 85in 10 bolumunden kalan->5
        int yüzler = sayi / 10;// 85'in 10' a bolumu ->8

        System.out.println("Girdiginiz sayinin birler basamagi :"+birler+"\nGirdiginiz sayinin onlar basamagi : "+onlar
                +"\nGirdiginiz sayinin yuzler basamagi :"+yüzler);










    }
}
