package BenimJava.j10_StringManipulations;

import java.util.Scanner;

public class C03_CharAt {
    public static void main(String[] args) {
        /*
   charAt () methodu parametre int olarak girilen index deki char değerinin return eder
   index değeri 0 dan başlar
    */


       //Task istanbul kelimesinin ortadaki karakterini print eden code create ediniz


        Scanner sc=new Scanner(System.in);
        System.out.println("bir kelime gir");
        String kelime=sc.nextLine();
        if (kelime.length()%2!=0){
            System.out.println(kelime.charAt((kelime.length()-1)/2));

        } else System.out.println("girilen karakterin orta karakteri yok");













    }







}
