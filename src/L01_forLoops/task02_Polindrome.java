package L01_forLoops;

import java.util.Scanner;

public class task02_Polindrome {
    public static void main(String[] args) {

      /*
      girilen ifadenin polindrome olmasını şfade eden method create ediniz
      polidrome=her iki yönde okunduğunda eşit olan ifadeler ey edip adanada pide ye*/





        Scanner sc = new Scanner(System.in);
        System.out.print("bir metin  giriniz : ");
        String str = sc.nextLine();

        polindrome(str);//String parametreli method call


    }//main dışı

    public static void polindrome(String str) {//
        String  tersStr="";//bos bir String kutu kulah
        for (int i =str.length()-1; i >=0 ; i--) {

            tersStr+=str.charAt(i);//strnin i.Ci karakterini tersStr'ye ekler(concat)
        }
        System.out.println("girilen ifadenin tersi :"+tersStr);

        if (str.equalsIgnoreCase(tersStr)){//str ile tersSTr eşitlik kontrolu
            System.out.println("girilen ifade POLİNDROME ");

        }else System.out.println("girlen ifade polindrome değil");






























    }//main dışı





    }

