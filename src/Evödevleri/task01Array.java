package Evödevleri;

import java.util.Arrays;
import java.util.Scanner;

public class task01Array {
    public static void main(String[] args) {
    /*
		     Anagram, bir kelimenin harflerinden baska bir kelime olusturmaya denir.
			Kullanıcıdan alınacak  iki kelimenin Anagram kontrolu yapan  Java code create ediniz
			isAnagram("listen", "Silent") ==> true
		 */


        Scanner sc=new Scanner(System.in);
        System.out.println("Bir kelime giriniz");
        String Kelime= sc.nextLine().toLowerCase();
        String arr[]=Kelime.toLowerCase().split("");
        Arrays.sort(arr);


        System.out.println("bir kelime giriniz");
        String kelime1= sc.nextLine().toLowerCase();
        String arr1[]=kelime1.toLowerCase().split(" ");
        Arrays.sort(arr1);

        boolean flag=true;
        if (Arrays.equals(arr1,arr)){
            System.out.println(flag);

        }else System.out.println(flag );





    }
}
