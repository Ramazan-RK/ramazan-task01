package EllyTask;

import javax.swing.plaf.PanelUI;
import java.util.Scanner;

public class day5 {

    /*  Q02_MethodCreation
 Write a method named isEven that accepts an integer argument.
  The method should return true if the argument is even, or false otherwise.*/
    public static void main(String[] args) {

      /* Scanner scan = new Scanner(System.in);
       System.out.println("bir sayi giriniz :");
       int sayi = scan.nextInt();
       System.out.println(isEven(sayi));
   }
    public static boolean isEven(int sayi) {
        return  sayi%2 == 0 ? true :false;

/*
 cm olarak verilen bir sayiyi, metre ve kilometreye donusturen bir method yaziniz

  */

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen m ve km ye donusturmek istediginiz sayiyi giriniz : ");
        double sentiMeter = scan.nextDouble();
        System.out.println(meter(sentiMeter) + " metre");
        System.out.println(kilometer(sentiMeter) + " km");
        convertFromSM(sentiMeter);
    }
    public static double meter (double x){
        return x/100;
    }
    public static double kilometer (double y) {
        return y / 100000;
    }
    public static void convertFromSM(double sayi){
        System.out.println("girilen santimeter degeri : " + sayi/100 + " metre\n" + sayi/100000 + " kilometredir");









    }

}