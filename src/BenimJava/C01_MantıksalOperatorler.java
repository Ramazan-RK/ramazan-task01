package BenimJava;

public class C01_MantıksalOperatorler {
    public static void main(String[] args) {


       /* -------- && - and - (ve)---------

                True   &&    True    -->  True
        True   &&    False   -->  False
        False  &&    True    -->  False
        False  &&    False   -->  False


                -------- ||- or - (veya)---------

                True   ||    True    -->  True
        True   ||    False   -->  True
        False  ||    True    -->  True
        False  ||    False   -->  False*/

        //and->ve


        boolean b1=true;
        int a=3;
        int c=7;

        System.out.println(b1&(a<c));
        System.out.println(b1&&(a>c));
        System.out.println(b1&(a==c));




        //int sayi=65;

       // System.out.println(sayi>100 && sayi<75);




        //int sayi1 = 17;



       /* System.out.println(sayi1 > 30 || sayi1 >15);*/


        String isim="";

        int sayı =25;

        isim=sayı>26 ? "Ayşe":"Ayşegül";

        System.out.println(isim);









    }
}
