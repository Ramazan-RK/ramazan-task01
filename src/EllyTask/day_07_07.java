package EllyTask;

import java.util.Scanner;

public class day_07_07 {
    public static void main(String[] args) {

/*
 Kullanıcıda x girilene kadar ekrana "Program çalışıyor" yazan
 ve x girildiğinde ise "Program bitti" yazan programı yazınız.
 */
 /*
     Kullanıcıda x girilene kadar ekrana "Program çalışıyor" yazan
     ve x girildiğinde ise "Program bitti" yazan programı yazınız.
     */

            Scanner scan = new Scanner(System.in);
            char c;
            do{
                System.out.print("harf giriniz :");
                c=scan.next().toLowerCase().charAt(0);
                System.out.println("Program calisiyor");
            }while (c!='x');
            System.out.println("Program bitti");



    }
}
