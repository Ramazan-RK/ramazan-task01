package j16_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class C13_replaceall_fill {
    public static void main(String[] args) {


        ArrayList<Integer>listSayi=new ArrayList<>(Arrays.asList(1,24,23,14,19,60,55,27,1,38));
        System.out.println("listSayi="+listSayi);


        Collections.replaceAll(listSayi,1,20);//replaceAll yeni sayı ile değiştirir
        System.out.println("listSayi="+listSayi);





        Collections.fill(listSayi,33);
        System.out.println("listSayi="+listSayi);//listte tüm elamanları belirli bir değere update eder




    }
}
