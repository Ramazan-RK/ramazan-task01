package BenimJava.j10_StringManipulations;

public class C04_Contains {
    public static void main(String[] args) {

        /*
        String içersinde istenen stringin varlığını kontrol eder boolean retun eder..

         */

      String s1="Enise Hanım başarılı bir qa rester team lead";
        System.out.println(s1.contains("hanım"));
        System.out.println(s1.contains("E"));
        System.out.println(s1.contains(" "));

        String s2="qa";
        System.out.println(s1.contains(s2));//true
        System.out.println(s2.contains(s1));//false

        /*
        task-> girilen bir cümlede aranan kelimenin varlığını kontrol eden bir code create ediniz

         */














    }
}
