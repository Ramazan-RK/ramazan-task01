package C11_metodCreation;

import java.util.Locale;
import java.util.Scanner;

public class task02 {
    public static void main(String[] args) {

      //task girilen ad ve soyadın ilk harfleri buyuk diğerlerini küçük yapan method crete ediniz

        Scanner scan = new Scanner (System.in);
        System.out.println("Adınızı giriniz : ");
        String ad = scan.next();
        System.out.println("Soyadınızı giriniz : ");
        String soyad = scan.next();
       isimKontrol(ad,soyad);




    }
public  static void isimKontrol(String ad,String soyad){
        ad=ad.substring(0,1).toUpperCase()+ad.substring(1).toLowerCase();
        soyad=soyad.substring(0,1).toUpperCase()+soyad.substring(1).toLowerCase();
    System.out.println("ad soyad="+ad+" "+soyad);
}

}


