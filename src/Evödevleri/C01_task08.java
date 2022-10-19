package Evödevleri;

import java.util.Scanner;

public class C01_task08 {
    public static void main(String[] args) {








       /*
  // TASK 1 : Kullanıcıdan alacağınız bir stringde boşluk karakterinin olup olmadığını kontrol ediniz.



        System.out.println("yaz birşeyler");
        String s =input.nextLine();
        if (s.contains(" ")){
            System.out.println("boşluk var");



        } else System.out.println("boşluk yok"); */



        /* TASK 2:
         * Kullanicidan bir isim isteyiniz ve isim sadece 3 harfli olmalidir ternary
         * kullanarak harflerin unique(farkli) olup olmadigina bakiniz e.g: ala => 3
         * Test data: ali eme all
         */


        /* Scanner input=new Scanner(System.in);
        System.out.println("üç harfli bir isim giriniz");
        String isim=input.nextLine();

        if (isim.length()==3){
            char c1=isim.charAt(0);
            char c2=isim.charAt(1);
            char c3=isim.charAt(2);

            String eşittir=(c1==c2||c1==c3||c2==c3)?"girdiğiniz isimde aynı olan harfler vardır":"girdiğiniz ismide tüm harfler faklıdır";

            System.out.println(eşittir);

        }else System.out.println("hatalı giriş yaptınız.üç harfli bir isim giriniz");*/


       /*
       StringMethods:
        girilen  bir strngin ilk yarisini print eden code create ediniz
        ORNEK:
        INPUT :istanbul
        OUTPUT :ista*/


       /* Scanner input=new Scanner(System.in);
        System.out.println("bir isim giriniz");
        String isim=input.nextLine();

        System.out.println(isim.substring(0,isim.length()/2)); /*



        */



  /*
        task>>> girilen e mail hesabının @gmail.com içermiyorsa "lütfen gmail hesabı giriniz"
        gmail.com ile bitiyorsa "hesabınız onaylandı" aksi durumda "geçerli hesabı giriniz print eden code create ediniz
         */


        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen mail hesabınızı giriniz");
        String mail = scan.nextLine();
        if (!mail.contains("@gmail.com")) {
            System.out.println("Lütfen gmail hesap giriniz.");
        }else if (mail.endsWith("@gmail.com")) {
            System.out.println("Hesabınız onaylandı.");
        }else System.out.println("Geçerli hesap giriniz");








    }
}
