package BenimJava.J08_İfStatement_TernaryOperators;

import java.nio.channels.ScatteringByteChannel;
import java.util.Scanner;

public class Example01 {
    public static void main(String[] args) {


        /*
        task01
        girilen sayının negatif ve pozitifliğini test eden code create ediniz

         */
   /*
        Task01
           girilen bir sayının negatif ve pozitifliğini kontrol eden code create ediniz..
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("agam bir sayi gir : ");
        int sayi = sc.nextInt();

        if (sayi > 0) {//sayinin sıfırdan buyuk olması şarta baglandı
            System.out.println("girilen sayi pozitif");
        } else if (sayi < 0) {//sayinin sıfırdan buyuk olmaması halinde sıfırdan kucuk olamsı sarta baglandı
            System.out.println("girilen sayi negatif");
        } else {//syının sıfırdan buyuk veya kucuk olmaması halıinde kalan durum(sıfıra eşit olması) şarta bağlandı
            System.out.println("girilen sayi ne negatif  ne de pozitifdir yani nötr'dür");
        }

        /*
        Kullanıcıdan 100 üzerinden notunu isteyin.
        Notu harf haff sisremine çevirip yazdırın.

         50'den küçükse "D"
         =50 <60 arasi "C"
         =60 <80 arasi"B"
         =80 nin üzerinde ise"A"

         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("agam notunu  gir : ");
        int not = sc.nextInt();
        if (not<0 || not>100){
            System.out.println("agam negatif ve 100 den buyuk not olmaz\nadam gibi bişeyler gir :(\n" +
                    "gelmiim oraya");
        }else if (not<50){//50 den kucuk not alma kontrolu
            System.out.println("D");//1,2,3..49
        }else if (not<60){//60 den kucuk not alma kontrolu
            System.out.println("C");
        }else if (not<80){//80 den kucuk not alma kontrolu
            System.out.println("B");//60,61,...79
        }else {//80 ve buyuk    not alma kontrolu
            System.out.println("A");//80,81...1000
        }













        }













            }











