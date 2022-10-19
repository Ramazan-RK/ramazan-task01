package j15_Arrays;

import java.util.Arrays;

public class C05_Arrays {
    public static void main(String[] args) {

      //Array copy...copyof(arr,newLenght);->girilen arr yin newlwnght kadR İLK elamanınnı copyalar


      int sayi[]={63,21,47,27,35,12,36,46,24};
      int yeniArr[]= Arrays.copyOf(sayi,5);
        System.out.println("sayıdan 5 eleamn kopyalanan yeni arr:"+Arrays.toString(yeniArr));

        int baskaArr[] = Arrays.copyOfRange(sayi,3,8);// 3dahil 8 hariç index elamanlar copyalanır

        System.out.println("sayı arr den özel kopyalanan baska arr:"+Arrays.toString(baskaArr));
        //Arrays belirli bir elaman ile update (set)etme...fill(arr,value);
        Arrays.fill(sayi,99 );
        System.out.println("sayı arr fullnmiş hali:"+Arrays.toString(sayi));

         Arrays.fill(sayi,3,7,33);//3.4.5.6. index elamanlar 33 ile update edildi



    }
}
