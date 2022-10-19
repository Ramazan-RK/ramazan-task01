package j_13break_continue;

import java.util.Scanner;

public class c02_continue {
    public static void main(String[] args) {
/*
Program, bir loop içerisinde continue komutu ile karşılaşılırsa, ondan sonraki komutları
atlar ve loop'un bir sonraki değerinden devam eder.

 */

// Task-> girilen bir mail hesabındaki ' ' karakterlerini handle ederek print eden code cerate ediniz



        Scanner sc=new Scanner(System.in);
        System.out.println("mail hesabını giriniz");

        String meyil= sc.nextLine();//ebik kabık @gma il .kom

        for (int i = 0; i < meyil.length(); i++) {

            char ch=meyil.charAt(i);

            if (ch==' ') continue;

            System.out.print(ch);
        }




















    }





}
