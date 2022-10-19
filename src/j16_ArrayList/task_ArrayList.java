package j16_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class task_ArrayList {
    public static void main(String[] args) {
        //bir listte istenen ayının varlığını kontrol eden code create ediniz
        ArrayList<Integer> listSayi = new ArrayList<>(Arrays.asList(1,24,23,14,19,60,1,55,27,1,38));



        Scanner sc= new Scanner(System.in);
        System.out.println("Hangi sayıyı arıyorsunuz");
        int ara=sc.nextInt();
        boolean varmi=false;




        for (int i = 0; i < listSayi.size(); i++) {
            if (listSayi.get(i)==ara){
                varmi=true;
                System.out.println("aradığınız sayı bizde var");
                break;
            }

        }
if (!varmi){
    System.out.println("aradığınız sayı yok:()");

}



    }
}
