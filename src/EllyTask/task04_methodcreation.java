package EllyTask;

import java.util.Scanner;

public class task04_methodcreation {

    private static Object Q02_Method_Creation;

    /*
    Kullanicidan bir tam sayi alin.
    Bu sayinin negatif veya pozitif oldugunu,
    tek mi cift mi oldugunu ve
    uc basamakli veya daha buyukse birler,onlar ve yuzler basamagindaki rakamlarin toplamini,
    100'den kucukse sadece birler basamagini yazdirin.
    */
public static void main(String[] args) {


        Scanner scan = new Scanner (System.in);
        System.out.println("Bir tam sayı giriniz : ");
        int sayi = scan.nextInt();
        tekCift(sayi);
        pozitifNegatif(sayi);
        basToplam(sayi);



    }
    public static void tekCift (int a) {
        System.out.println((a%2==0)? "sayı çift sayıdır" : "sayı tek sayıdır");
    }
    public static void pozitifNegatif(int a) {
        System.out.println((a==0)?"sayınız nötrdür":((a<0)? "sayı negatifdir" : "sayı pozitifdir"));
    }
    public static void basToplam(int a) {
        if (a>99) {
            System.out.println(a%10 + ((a/10)%10) + a/100);
        }else System.out.println(a%10);








}





}





