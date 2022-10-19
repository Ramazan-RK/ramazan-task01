package javaTekrar01;

import java.util.Scanner;

public class ex01 {
    static Scanner scan=new Scanner(System.in);
    static int balance=1000;
    /*bakiye(başlangıcta 1000 tl) öğrenme, para yatırma ve çekme,
     cıkış işlemlerinin yapıldığı bir ATM app code create  edin
*/

    public static void main(String[] args) {

        System.out.println("***hoşgeldiniz**");

        atmİşlem();









    }

    private static void atmİşlem() {
        System.out.println("ana menü\nBakiye için 1\nPara çekme 2\npara yatırma 3\nCıkış yap 4");
        int secim = scan.nextInt();
        switch (secim){
            case 1:
                bakiye();
                break;
            case 2:
                paraÇekme();
                break;
            case 3:
                paraYatırma();
                break;
            case 4:
                çıkış();

                break;


        }
    }

    private static void çıkış() {
        System.out.println("yine Bekleriz");

    }

    private static void paraYatırma() {

        System.out.println("yatıracağınız miktarı veriniz");
        int yatırılanMiktar= scan.nextInt();
        balance+=(yatırılanMiktar);
        System.out.println("yeni bakiye"+balance);
        karar();
    }

    private static void karar() {
        System.out.println("devam etmek için 1\nÇıkmak için 0");
        int son= scan.nextInt();
        if (son==1){
            atmİşlem();
        }else System.out.println("yine bekleriz");


    }

    private static void paraÇekme() {
        System.out.println("ne kadar para çekeceksiniz yazınız");
        int çekilen= scan.nextInt();
        balance-=çekilen;
        System.out.println("yeni bakiyeniz"+balance);
        karar();


    }

    private static void bakiye() {
        System.out.println("mevcut bakiyeniz"+balance);
        karar();


    }
}
