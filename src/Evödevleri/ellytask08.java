package Evödevleri;

import java.util.*;

public class ellytask08 {
    public static void main(String[] args) {


        /*  Rastgele kullanici adi olusturan JAVA kodu yaziniz.
         *  1. Kullanicidan ismini isteyelim
         *  2. Kullanici adindaki bosluklari silelim.
         *  3. Kullanici adinin alinabilir olup olmadigina bakalim.
         *  4. Eger bizim listemizde oyle bir kullanici adi yoksa kullanici adi, kullanicinin girdigi isim olsun.
         *  5. Eger bu kullanici adi zaten varsa, sonuna rastgele sayi olusturup ekleyelim, ve gosterelim.

         */


       /* Scanner sc=new Scanner(System.in);
        System.out.println("isminizi giriniz");


        String isim= sc.nextLine().toLowerCase().trim().replace(" ", "");
        List<String>name=new ArrayList<>(List.of("ramazan","özlem","merve","feray","çiğdem"));

        if(!name.contains(isim)){
            System.out.println("isim:"+isim+"olarak ayandı");
            name.add(isim);
            System.out.println(name);
        }else {
            System.out.println("isminiz listede olduğu için yeni isim oluşturuldu:"  +isim +(int) (Math.random() * 100));


        }
        System.out.println(name);*/


  /*
     If the list has 12 as element, change all 12s to 21
     Example: (12, 11, 12, 15, 12, 34, 43) ==> Output is (21, 11, 21, 15, 21, 34, 43)
 */

ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(12, 11, 12, 15, 12, 34, 43));
        System.out.println("list="+list);

        if (list.contains(12))
            Collections.replaceAll(list,12,21);
        System.out.println("list güncel="+list);




















    }



}
