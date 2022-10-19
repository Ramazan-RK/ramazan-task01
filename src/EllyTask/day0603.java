package EllyTask;

import java.util.Scanner;

public class day0603 {
    public static void main(String[] args) {


/*    Kullanıcıdan 1'den büyük bir tam sayı girmesini isteyin
   ve 1'den girilen tam sayıya kadar olan sayıların karelerinin toplamını
   hesaplayan kodu yazın
  Örnek Ekran Çıktısı
  Girilen sayı=4
  Kareler toplamı=14
   */


      // Scanner sc=new Scanner(System.in);
      // System.out.println("1den büyük tamsayı giriniz");
      // int sayi= sc.nextInt();
      // int karetoplamı= 0;

      // for (int i =1; i < sayi; i++) {
      //     karetoplamı+=i*i;

      // }

      // System.out.println("kare toplam:"+karetoplamı);

        //Q05_NestedForLoop
/*
   Get the number of rows and columns from user.
   Create a rectangle.
   rows = 3 and column = 5 ==> * * * * *
                               * * * * *
                               * * * * *
*/
        Scanner sc=new Scanner(System.in);
        System.out.print("satir icin sayi girin: ");
        int satir= sc.nextInt();
        System.out.print("sutun icin sayi girin: ");
        int sutun= sc.nextInt();

        for (int i = 0; i < satir; i++) {
            for (int j = 0; j < sutun; j++) {

                System.out.print("* ");

            }
            System.out.println();//dumy olmaz ise hepsini yanyaa yazardı

        }




    }
}
