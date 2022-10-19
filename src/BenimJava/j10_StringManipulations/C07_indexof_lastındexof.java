package BenimJava.j10_StringManipulations;

import javax.swing.*;
import java.util.Scanner;

public class C07_indexof_lastındexof {
    public static void main(String[] args) {

/* indexOf()
 * char karakter ya da String metnin kacinci indexden basladigini veren bir method dur. Sonuc integer dir.
 * Bu method index'i sorulan char'in String icindeki ilk gorunumunun index'ini return eder
  contains den farkı indexini verir, contains ise true false

*/

String str="Good";
        System.out.println("ilk görülen o nun yeri index nosu:"+str.indexOf('0'));//1
        System.out.println("d nin yeri index nosu:"+str.indexOf("d"));
        System.out.println("d nin yeri index nosu:"+str.indexOf("D"));//-1-> d karekteri olmadığı iiçin //ahanda trick ->olmayan karekteri
        //indexi sorgularsa -1 return eder

        System.out.println("od nun yeri index nosu:"+str.indexOf("0d"));//2
        System.out.println("Od nun yeri index nosu:"+str.indexOf("Od"));//-2

/* lastIndexOf()
 *  String içinde aranan karakter(ler)in sondan itibaren ilk indexini verır
 *  indexOf un sondan olan hali fakat index numaraları değişmez.
 *  lastIndexOf() Method'u index'i sorulan character'in son gorunumunun index'ini return eder.
 *  indexOf() methodunda birden fazla character'in index'i sorulursa ilk character'in index'i return edilir.
 */

        String isim="mustafa nizamoğlu";
        System.out.println("isim.indexOf('a') = " + isim.indexOf('a'));
        System.out.println("isim.lastIndexOf('fa') = " + isim.lastIndexOf('a'));



        /*
task
 Girilen cümlenin aşaıdaki durumları sağlayacak code create ediniz

 1-Girilen cumle java icermiyor
 2-Girilen cumle 1 tane java iceriyor
 3-Girilen cumlede birden fazla java var
 */


        Scanner sc=new Scanner(System.in);
        System.out.println("kafi miktarda bir cümle giriniz:");


        String cumle=sc.nextLine().toLowerCase();


        if (cumle.indexOf("java")==-1){
            System.out.println("girilen cümle java içermiyor");

        }else if (cumle.indexOf("java")==cumle.lastIndexOf("java")) {
            System.out.println("gieilen cümle 1 tane java içeriyor");


        }else System.out.println("girilen gümlede birden fazla java var");




    }
}
