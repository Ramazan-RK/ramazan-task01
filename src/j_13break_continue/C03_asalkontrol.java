package j_13break_continue;

import java.util.Scanner;

public class C03_asalkontrol {
    // task girilen tamsayının asal olmasının kontrol eden code create ediniz
    /*
    asal sayı bir ve kendisine bölünen sayı
        */


    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

      //  System.out.print("Bir sayi giriniz: ");
      //  int sayi = scan.nextInt();
      //  int sayac = 0;
      //  int i = 2;
//
      //  while(i < sayi) {
      //      if(sayi % i == 0) {
      //          sayac++;
      //      }
      //      i++;
      //  }
      //  if(sayac == 0) {
      //      System.out.println(sayi + " Asal bir sayidir.");
      //  }
      //  else {
      //      System.out.println(sayi + " Asal bir sayi degildir.");
      //  }



        //task-> girilen tamsayının asal olmasını kontrol eden code create ediniz
        //asal tamsayı: 1 ve kendisinden başka tam böleni olmayan sayılar->asil bölünemeyen sayı

        Scanner sc = new Scanner(System.in);
        System.out.println("AGAm bi dene tamsayı  giresen :");
        int sayi=sc.nextInt();// 23->2,3,4,5,6,7...23 24
        //     v x x          x -> false


        boolean asalMı=true;
        for (int i = 2; i < sayi; i++) {
            if (sayi % i == 0) {//eğer sayi kendisine kadar olan sayılara tam bölunuyorsa
                asalMı = false;
                break;
            }


        }

    }
}






