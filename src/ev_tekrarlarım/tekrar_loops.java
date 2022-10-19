package ev_tekrarlarım;

import java.util.Scanner;

public class tekrar_loops {
  /*
        girilen iki sayı arasındaki çift sayıları yanyana  print eden code create ediniz..
         */
  public static void main(String[] args) {


      Scanner sc = new Scanner(System.in);
      System.out.println("sayix giriniz");
      int sayix=sc.nextInt();
      System.out.println("sayıM GİRİNİZ");
      int sayıM=sc.nextInt();

      if (sayix<sayıM) {

          for (int i = sayix; i < sayıM; i++) {

              if (i%2==0){
                  System.out.println(i+"");

              }

          }
      }else System.out.println("hatalı giriş yaptınız" );













  }


}
