package EllyTask;

import java.nio.channels.ScatteringByteChannel;
import java.util.Scanner;

public class Q01_StringManipulations {
    public static void main(String[] args) {



//Kullanicidan ismini ve soyisimi girmesini isteyin, sonrasinda konsola tam ismini buyuk harfler ile yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println( "lütfen isminizi ve soy isminizi giriniz");
        String firstname= scan.nextLine(),lastname= scan.nextLine();


        String fulname=firstname.concat(" "+lastname).toUpperCase();
        System.out.println("fulname="+fulname);




        //Scanner kullanarak iki ayri deger giriniz ve bu iki kelimeyi method kullanarak birlestiriniz.

//yukardaki ornekte verilen ilk ve ikinci degiskenlerinin ilk harflerini atip birlestiriniz.


            Scanner sc= new Scanner(System.in);
            System.out.println("String 1 :");
            String str1 = scan.nextLine();
            System.out.println("String 2 :");
            String str2 = scan.nextLine();
            System.out.println("1.method ile birlesim :" + str1 + " " + str2);
            System.out.println("2.method ile birlesim :" + str1.concat(" " + str2));
            String  str1Ilksiz = str1.substring(1);
            String  str2Ilksiz = str2.substring(1);
            System.out.println("ilk harfler olmadan birlesimi : " + str1Ilksiz + " " + str2Ilksiz);







        }
}
