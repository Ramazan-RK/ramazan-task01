package L01_forLoops;

import java.util.Scanner;

public class task12 {
    public static void main(String[] args) {
        /*
        girilen 5 sayısının 10 ile 20 arası hariç diğerleriniintoplamını hesap eden code create ediniz
                 */


        Scanner sc=new Scanner(System.in);

        int toplam=0;

        for (int i = 1; i <=5; i++) {
            System.out.print(i+".sayı giriniz");
            int sayı= sc.nextInt();

            if (sayı<=10||sayı>=20) {

                toplam+=sayı;
            }


        }

        System.out.println("girdiğiniz sayıların istenen şartta toplamı"+toplam);



    }
}
