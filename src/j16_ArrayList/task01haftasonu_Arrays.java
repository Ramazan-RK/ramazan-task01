package j16_ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class task01haftasonu_Arrays {


    public static void main(String[] args) {
        /* TASK :
         * Bir bakkalın 7 günlük tüm kazançlarını günlük olarak gösteren bir program yazınız.
         * Ayrıca bakkalın bu hafta ortalama kazandığı miktarı gösteren bir method yazınız.
         * Ayrıca bakkalın hangi günler ortalamanın üstüne kazandığını gösteren bir method yazınız.
         * Ayrıca bakkalın hangi günler ortalamanın altında kazandığını gösteren bir method yazınız.
         *
         * 1. Adım : Günleri içeren bir tane ArrayList oluşturun. (gunler)
         * 2. Adım : Günlük kazançları ekleyeceğimiz bir tane ArrayList oluşturun. (gunlukKazanclar)
         * 3. Adım : While döngüsü ile kullanıcıdan 7 günlük kazançları tekek teker alıp gunlukKazanclar ArrayList'e ekle.
         * 4. Adım : getOrtalamaKazanc() adlı method ile ortalama kazancı alın.
         * 5. Adım : getOrtalamaninUstundeKazancGünleri() adlı method oluşturun.
         * 			 for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
         * 			 ortalama kazançtan yüksekse o günleri return yap.
         * 6. Adım : getOrtalamaninAltindaKazancGünleri() adlı method oluşturun.
         * 			 for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
         * 			 ortalama kazançtan aşağıysa o günleri return yap.
         *


Scanner sc=new Scanner(System.in);
        List<String> gunlerList=new ArrayList<>(List.of("pazartesi","salı,","çarşamba","perşembe","cuma","cumartesi","pazar"));
        List<Integer>gunlukKazanc=new ArrayList<>();
        int gun=0;
        while (gun<gunlerList.size()) {
            System.out.println(gunlerList.get(gun)+"kazancı giriniz=");
            gunlukKazanc.add(sc.nextInt());
            gun++;


        }
        System.out.println("ortalama kazancınız="+getortalamakazanç(gunlukKazanc,gunlerList));
        System.out.println("gunlukortalamaınınuzerikazanç"+getortalamınınüstükazançlar(gunlerList,gunlukKazanc));
        System.out.println("gunlukortalamanınaltıkazanç"+getortalamınıaltıkazançlar(gunlerList,gunlukKazanc));
        

    }

    private static String getortalamınıaltıkazançlar(List<String> gunlerList, List<Integer> gunlukKazanc) {
        List<String> ortAlt=new ArrayList<>();
        for (int i = 0; i < gunlukKazanc.size(); i++) {
            if (gunlukKazanc.get(i)<getortalamakazanç(gunlukKazanc,gunlerList)){
                ortAlt.add(gunlerList.get(i)+"="+gunlukKazanc.get(i));

        }

        }
        return ortAlt.toString();
    }

    private static String getortalamınınüstükazançlar(List<String> gunlerList, List<Integer> gunlukKazanc) {
        List<String> ortUst=new ArrayList<>();
        for (int i = 0; i < gunlukKazanc.size(); i++) {
            if (gunlukKazanc.get(i)>=getortalamakazanç(gunlukKazanc,gunlerList)){
                ortUst.add(gunlukKazanc.get(i)+"="+gunlukKazanc.get(i));

            }

            
        }
        return ortUst.toString();
    }

    private static double getortalamakazanç(List<Integer> gunlukKazanc, List<String> gunlerList) {
        double toplam=0;
        for (int i = 0; i < gunlerList.size(); i++) {
            toplam+=gunlukKazanc.get(i);
            
        }double ortalama=toplam/gunlerList.size();

        return ortalama;*/



        //Not ortalama
Scanner sc=new Scanner(System.in);
        System.out.println("kaçtane not girmek istersiniz");
        int notSayisi= sc.nextInt();
        int Notlar[]=new int[notSayisi];
        int toplam=0;
        int ortalamaUstu=0;
        int ortalamaltı=0;

        for (int i = 0; i < notSayisi; i++) {
            System.out.println("Notu Giriniz");
            Notlar[i] =sc.nextInt();
            toplam+=Notlar[i];
            
            
        }

        System.out.println("toplam="+toplam);
        int ortalama=ortalamaUstu/notSayisi;
        for (int i = 0; i <=Notlar.length-1; i++) {
            if (Notlar[i]>=ortalama) {
                ortalamaUstu++;


            }else ortalamaltı++;

        }

        System.out.println("dersten geçenler="+ortalamaUstu);
        System.out.println("Dersten kalanlar="+ortalamaltı);



































    }
}
