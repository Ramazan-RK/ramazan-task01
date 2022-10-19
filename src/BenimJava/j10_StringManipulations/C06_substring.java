package BenimJava.j10_StringManipulations;

import java.util.Scanner;

public class C06_substring {
    public static void main(String[] args) {

    /*
substring()
Metin icinde, istenilen araliktaki bir parcasina ya da butunune ulasilabilir. Sonuc ise String dir.
substring(i)->Method'a parametre olarak girilen  index'den sona kadar olan parcayi return eder
substring(baslangicIndexi, bitisIndexi)->Method'a parametre olarak girilen  baslangicIndexi'den bitis
indexi'e kadar parçayı return eder
baslangic indexi ==> inclusive/dahil
bitis indexi ==> eclusive/haric
 */

       String str="java bilen sırtı yere gelmez:)";
        System.out.println(str.substring(10));//sırtı yere gelmez
        //str datasının son 10 karekterini print ediniz...
        System.out.println(str.length()-10);

//ilk 10 karekterini  print ediniz..


        System.out.println(str.substring(0,10));
        //ilk karekter
        System.out.println("str.substring(0,1) = " + str.substring(0, 1));//j_>0 alır 1 almaz yani 0. karekteri verir

        //girilen 4 harfli kelimeyi tersten yazdırınız
        Scanner sc=new Scanner(System.in);
        System.out.println("dört harfli kelime giriniz");
        String kelime=sc.next();
        if (kelime.length()!=4){
            System.out.println("lütfen dört harfli giriniz");


        }else{

        }


    }
}
// eksik kod düzenle
