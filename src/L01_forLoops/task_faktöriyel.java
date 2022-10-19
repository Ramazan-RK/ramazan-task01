package L01_forLoops;

import java.util.Scanner;

import static C11_metodCreation.C05_recursiveMethod.faktöriyel;

public class task_faktöriyel {
    /*
    task girilen sayının faktöriyelini hesaplayan method createe ediniz

     */
    public static void main(String[] args) {



Scanner sc=new Scanner(System.in);
        System.out.println("bir pozitif sayı giriniz");
        int sayı= sc.nextInt();

     faktöriyeli(sayı);













    }

    private static void faktöriyeli(int sayı) {
        int faktöriyeli=1;
        for (int i =1 ; i <=sayı;  i++) {
            faktöriyeli*=i;


        }
        System.out.println("faktöriyeli: " + faktöriyeli);

    }


}
