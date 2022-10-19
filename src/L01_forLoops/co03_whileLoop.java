package L01_forLoops;

import java.util.Scanner;

public class co03_whileLoop {

    public static void main(String[] args) {
     //girilen tam sayının tam bolen sayısının print eden code create ediniz


     //20->1,2,4,5,10,20:20 nin tam bölenleri


        Scanner sc = new Scanner(System.in);
        System.out.println("AGAM nassıng :) bir tamsayı giriyorsun : ");
        int sayi = sc.nextInt();
        int bolenSayi=1;
        int tamBolenAdedi=0;
        while (bolenSayi<=sayi){

            if (sayi%bolenSayi==0) { //sayi bolen sayıya tam bölünme şartı

           tamBolenAdedi++;


            }

            bolenSayi++;//loop sonsuza düşmememesi için ve diğer sayıların kontrol edilmesi için




        }
        System.out.println("agam girdiğin "+sayi+" nın "+tamBolenAdedi+" kadar tam boleni var :)");




















    }

}
