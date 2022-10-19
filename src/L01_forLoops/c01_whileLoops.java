package L01_forLoops;

import java.util.Scanner;

public class c01_whileLoops {
    public static void main(String[] args) {
    /*
    başalangıç ve bitiş değerleri net (bilinnen değerler)olan tekrarlarda adım sayısı belli olmayıpbir şarta duruma
    bağlı olan durumlarda while loop kullanılır

     */
      //task 11 den 20 ye kadar olan tamsayıları print eden code create ediniz

        for (int i = 11; i < 21; i++) {
            System.out.println(i+"");



        }


        System.out.print("***while çözüm***"  );
        int basla=11;

        while (basla<21){
            System.out.println(basla+" ");
            basla++;
        }


//task03->iki basamaklı teksayıları yanyana yazan code create ediniz

        System.out.println("***task03***");
        int b=11;

        while (b<100) {
            System.out.println(b + "");
            b += 2;

        }



        //task04->girilen metni tersten yazdırılan code create ediniz


        Scanner sc=new Scanner(System.in);
        System.out.println("bir metin giriniz : ");
        String  metin= sc.nextLine();
        int metinUzunluk=metin.length();

        while (metinUzunluk>=1){//metnin uzunlugu 0 a eşit ve buyuk iken
            System.out.print(metin.charAt(metinUzunluk-1));//
            metinUzunluk--;
        }


//task 05-> girilen tamsayıyı kadar tamsayıların toplamını print  eden code  create ediniz
        System.out.println("AGAM BİR TAM SAYI GİR");
        int sayi=sc.nextInt();
        int toplam=0;
        while (sayi>0){
            toplam+=sayi;
            sayi--;
        }
        System.out.println("sayılar toplamı:"+toplam);




        // task06-> girilen tamsayın faktoriyelini print eden code create ediniz...
        System.out.println("   *** task06 ***   ");

        int faktoriyel = 1;

        while (sayi > 0) {// sayı 1 olana dek body de ne varsa yap
            faktoriyel *= sayi;// her döngüde sayıyı toplama ekle
            sayi--;// her döngüde sayıyı 1 azalt ki dünta döndükçe dönmesin.!!
        }
        System.out.println("agam girdigin sayılar faktoriyeli : " + faktoriyel);











    }




}




