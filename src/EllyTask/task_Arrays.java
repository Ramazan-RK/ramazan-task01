package EllyTask;

import java.util.Arrays;

public class task_Arrays {
    public static void main(String[] args) {

/*
      given an int array and find the squares of the elements
      (Verilen bir int dizisi icin elemanlarin karelerini bulun )
      Example:{2,6,4,5,8,9}
      output:{4,36,16,25,64,81}
      */


 /* int arr[]={2,6,4,5,8,9};
        for (int i = 0; i < arr.length; i++) {
           arr[i] *=arr[i];//arr[i] = (arr[i]*arr[i])
        }
        System.out.println("elamanların karesi: " + Arrays.toString(arr));*/

        /***********************************************************************************************
         * write a java program that calculates the average value of array elements
         * Print elements that are greater than avarage
         * (dizi elemanlarinin ortalama degerini hesaplayan ve
         * ortalamadan büyük olanları yazdıran bir java programi yazin)
         * input[]= {1,2,3,4,5,6,7}
         * Output : 4
         **************************************************************************************************/


        /*int arr [] = {1,2,3,4,5,6,7};

        int toplam = 0;
        for (int i = 0; i < arr.length; i++) {
            toplam+=arr[i];
        }

        double ortalama = toplam/arr.length;
        System.out.println("ortalama = " + ortalama);
        System.out.println("ortalamadan buyuk olan elemanlar");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>ortalama){
                System.out.print(arr[i] + " ");*/



        /*  you have a string "HeySiri"
         * with arrays change it to "ByeSiri" and write changing array
         *(String iniz: "HeySiri"  Diziyi "ByeSiri" ye cevirin )
         *
         */



        //    //1.adim str tanimladik
        //    String str = "HeySiri";
//
        //    //2.adim HeySiri yi ByeSiri ye donustur
        //    str =str.replace("Hey", "Bye");
        //    System.out.println(str);
//
        //    String arr[] = new String[1];
        //    arr[0] =str;
        //    System.out.println(Arrays.toString(arr));
        //2.yol
        String str1 = "HeySiri";
        String yeniStr [] = str1.split("y");
        System.out.println(Arrays.toString(yeniStr)); //[He, Siri]
        yeniStr[0] = "Bye" ;
        System.out.println(Arrays.toString(yeniStr)); //[Bye, Siri]
        str1 =yeniStr[0] +  yeniStr[1];
        System.out.println("str1 = " + str1);
        String arr2[] = new String[1];
        arr2[0] = str1;
        System.out.println(Arrays.toString(arr2));




































    }
}
