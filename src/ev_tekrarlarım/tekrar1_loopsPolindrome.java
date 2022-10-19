package ev_tekrarlarım;

import java.util.Scanner;



public class tekrar1_loopsPolindrome {
    public static void main(String[] args) {
           /*
        girilen ifadenin polindrome olmasını kontrol eden method create ediniz...
        plindrome:her iki yönde okundugunda eşit olan ifadeler

         */


        Scanner sc = new Scanner(System.in);
        System.out.println("lütfen bir metin giriniz");
        String str = sc.nextLine();

        polindrome(str);






        }//main dışı

    private static void polindrome(String str) {
        String tersStr=" ";
        for (int i =str.length()-1; i >=0 ; i--) {

            tersStr+=str.charAt(i);



        }
        System.out.println("girilen ifadenin tersi:"+tersStr);
        if (str.equalsIgnoreCase(tersStr)){
            System.out.println("girilen ifade polindrome");


        }else System.out.println("girilen ifade polindrome değil" );


    }


}




