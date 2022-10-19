package EllyTask;

import java.util.Scanner;

public class T01_elly {
    public static void main(String[] args) {



        /*  Kullanicidan yaricap isteyip cemberin cevresini ve dairenin alanini hesaplayip yazdirin (pi =3.14)
        //  Kullanicidan ismini ve soyismini alip aralarinda bir bosluk olusturarak asagidaki sekilde yazdirin
        //  Isim – soyisim : Elly Dainty
        //  Kullanicidan ismini alip isminin bas harfini yazdirin.
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            //   System.out.println("cemberin yaricapini girinz : ");
            //   double yaricap = scan.nextDouble();
//
            //   System.out.println("yaricap = " + yaricap);
            //   System.out.println("cemberin cevresi : " + 2*3.14*yaricap);
            //   System.out.println("dairenin alani : " + 3.14*yaricap*yaricap);
            // System.out.println("lutfen isminizi giriniz : ");
            // String isim = scan.nextLine();
            // System.out.println("lutfen soyisminizi giriniz :");
            // String soyIsim = scan.nextLine();
            // System.out.println("isim -soyisim  :" + isim + " " +soyIsim );
           // System.out.println("lutfen isminizi giriniz :");
           // char ilkHarf = scan.next().charAt(0);
            //System.out.println("girdiginiz ismin ilk harfi : " + ilkHarf); */



       /* int x=121345;

        int birler=x%10;
        int onlar =(x/10)%10;
        int yüzler=(x/100)%10;
        int binler=(x/1000)%10;
        int onbinler=(x/10000);

        System.out.println(onbinler + "\n" + binler + "\n" +yüzler + "\n" + onlar + "\n" + birler );*/










        Scanner input=new Scanner(System.in);
        System.out.println("boyunuzu giriniz");
        double boy= input.nextDouble();

        System.out.println("kilonuuz giriniz");
        double kilon= input.nextDouble();


        double vke=boy/(kilon*kilon);

        if (vke>30) {
            System.out.println("obez grubundasınız");
        }else if(vke>25) {
            System.out.println("şişman katogorisindesiniz");

        }else if (vke>20) {
            System.out.println("normal sınırlardasınız");

        } else System.out.println("zayıfsınız");



            }
        }





























