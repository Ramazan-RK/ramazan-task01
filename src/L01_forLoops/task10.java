package L01_forLoops;

import java.util.Scanner;

public class task10 {
    public static void main(String[] args) {

      /*
      girilen bir ifadenin istenen harf sayısını print eden code create edininz
      input selam javacanlar
      output:a  a sayısı :3

       */


        Scanner sc=new  Scanner(System.in);
        System.out.println("bir cümle giriniz");
        String cumle=sc.nextLine();
        System.out.println("sayılacak harfi giriniz");
        char harf=sc.next().charAt(0);

        int harfsayısı=0;//ilk değer 0 atandaki sayma da etki etmesin


        for (int i = 0; i <cumle.length() ; i++) {

            if (cumle.charAt(i) ==harf){
                harfsayısı++;

            }

        }
        System.out.println("giridiniz cümle:"+cumle+"de istediğiniz harf:"+harf+harfsayısı);



    }
}
