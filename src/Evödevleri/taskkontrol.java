package Evödevleri;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static java.util.Arrays.*;

public class taskkontrol {
    public static void main(String[] args) {

      /*  Scanner sc = new Scanner(System.in);

        System.out.print("bir kelime giriniz: ");
        String kelime = sc.nextLine().toLowerCase();
        String arr[] = kelime.toLowerCase().split("");
        Arrays.sort(arr);

        System.out.print("bir kelime giriniz: ");
        String kelime1 = sc.nextLine().toLowerCase();
        String arr1[] = kelime1.toLowerCase().split("");
        Arrays.sort(arr1);


        boolean flag = true;
        if (Arrays.equals(arr, arr1)) {
            System.out.println(flag);

        } else System.out.println(false);*/




        String[] arr ={"hi","how","are","you"};
        List<String> arrList=new ArrayList<>(asList(arr));
        if(arrList.removeIf(s->{System.out.print(s);return s.length()<=2;})){
            System.out.println("removed");
        }




















    }
}
