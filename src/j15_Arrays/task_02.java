package j15_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class task_02 {
    public static void main(String[] args) {
        //task-> girilen int array elemanlarının  toplamınn print eden code create ediniz

       /* int[] array = {10, 20, 30, 40, 50, 10};
        int toplam = 0;

        for( int num : array) {
            toplam = toplam +num;
        }
        System.out.println("elemanların toplamı : "+toplam);*/

        //task-> girilen int array elemanları toplamını print eden code create ediniz.
        Scanner sc = new Scanner(System.in);

        System.out.print("agam kaç elemanlı array istirsen : ");
        //int arrBoyut = sc.nextInt();

        int arr[] = new int[sc.nextInt()];//boyutu belirlenmiş boş int array

        for (int i = 0; i < arr.length; i++) {
            System.out.print(i + ". index  elemanı giriniz : ");
            arr[i] = sc.nextInt();
        }
        System.out.println("agam istedgin array : " + Arrays.toString(arr));
        int arrToplam = 0;//local var.


        for (int i = 0; i < arr.length; i++) {
            arrToplam += arr[i];
        }
        System.out.println("array eleman toplamları : "+arrToplam);


        int toplam=0;
        for (int a:arr){
            toplam+=a;
        }
        System.out.println("toplam = " + toplam);









    }
}
