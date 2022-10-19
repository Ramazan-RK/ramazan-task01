package j15_Arrays;

import java.util.Arrays;

public class Co6MdArrays {
    public static void main(String[] args) {
        /*
      Çok Boyutlu Diziler
Java'da Çok Boyutlu Diziler varsayılan bir veri tipi olarak bulunmazlar ve matris olarak adlandırılırlar.
 Dizilerin 2 boyutlu halleri şeklinde tanımlanırlar. Matrisler satır ve sütun şeklinde tablo verisi
 formatındaki verileri tutmak için kullanılır. Diziler liste halinde veriler için uygunken,
 matrisler tablo şeklindeki veriler için uygundur. Oluşturulan tabloda bir değere ulaşmak istersek
 satır ve sütun sayısını girmemiz yeterli olacaktır.
* TRICK :)İki boyutlu dizilerde tek boyutlu diziler gibi indis değeri 0'dan başlar.
Dizide tutulacak veri tipleri aynı olmak zorundadır farklı veri tiplerini aynı matriste tutamayız.

       * 1- Ic Icice olusturulan  array'lerde   disardaki ana array'e outer-> kat bilgisi array
       *  icerdeki  array'lere  inner array denir
       * 2- TRICK->  icerdeki array'lerin boyutlari birbirinden farkli ise
       *  Array'i ancak tum elemenlari atanarak declare edilmeli
       * 3- Multi dimensional array'de bir elemanin indexi icin
       *  en distaki array haric, elemania kadar ic ice olan tum arraylerin indexlerini yazmak gerekir
     */
//MdArrays tanımlama

        int arr1[][]=new int[3][5];//3 katlı her katta 5 daireli olan boş apt.->3 satır 5 sutun bir tablo
        //bir sitede herbirinde 10 dairelik 8 katlı apt var.nasıl arry olarak tanımlanır

        int site[][][] = new int[6][8][10];

// 24 kişilik 3 sınıf ve 21 kişilik 5 sınıfı olan okul nasıl array olarak tanımlanır


        int sınıf24[][] = new int[3][24];//24 kişilik 3 boş sınıf
        int sınıf21[][] = new int[5][21];//21 kişilik 5 boş sınıf



        //MdArray eleman ekleme


        arr1[2][4]=35;//2.kat 4.daire değeri 35 atandı
        arr1[0][3]=34;//0.kat 3.daire değeri 34 atandı

        System.out.println(arr1[0][3]);

        //elemanları girilerek Arrays tanımlama

        int arr[][]=
                {{1,2,3},//0. kat
                {10,20},//1. kat
                {101}};//2. kat



       //101 eleman index->arr[2] [0]


        //MdArrays elemanları print etme

        System.out.println(Arrays.toString(arr[1]));//
        System.out.println(arr[1]);//[I@19dfb72a->arr[1] bir array oldğ için doğrudan sout komutu arr[1]im referansı verir
        System.out.println(arr[1][0]);//10


        System.out.println(Arrays.deepToString(arr));//[[1, 2, 3], [10, 20], [101]]
        System.out.println(Arrays.toString(arr));//[[I@7e0ea639, [I@19dfb72a, [I@3d24753a]


    }







}
