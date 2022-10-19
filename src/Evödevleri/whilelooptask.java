package Evödevleri;

import java.util.Scanner;
//girilen sayıların toplamı 333 gectiğinde girilen sayı adedini ve toplamını print eden code create ediniz.



public class whilelooptask {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int toplam = 0;
        int sayıtoplamı = 0;

        while (sayıtoplamı <= 333) ;
        {
            System.out.println("tamsayı giriniz");
            int sayı = scan.nextInt();
            toplam += sayı;
            sayıtoplamı++;


        }
    }
}