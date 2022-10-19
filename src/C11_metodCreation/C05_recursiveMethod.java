package C11_metodCreation;

import java.util.Scanner;

public class C05_recursiveMethod {
    public static void main(String[] args) {

/*
Recursive  call edildiğinde run time'da programa ekstradan yük getiren bir yapıdadır
çünkü bir fonksiyon kendi kendini çağırdığında her çağırmada yığında (stack) bir işlem gerçekleşir ve bir bellek konumu oluşur.
Bu yüzden özyineleme ile yapılan hesaplamalar daha yavaş ve verimsizdir.
Peki özyinelemeyi neden kullanıyoruz?
Bazı karmaşık çözülmesi güç problemlerde döngülere göre daha kısa ve anlaşılır olduğu için.
 */



        /*
        faktöriyel girilen sayıdan 1 e kadar olan tamsayıların çarpımına denir.1!=1 0!=1,2!=2*1
         */
/*
task girilen sayınıın faktöriyelini hesaplayan method create ediniz
 */


Scanner sc=new Scanner(System.in);
        System.out.println( "bir tamsayı giriniz");
        int sayi= sc.nextInt();

        System.out.println(faktöriyel(sayi));

    }//main dışıin
    public static int faktöriyel(int a){
        if (a>=1){
            return a*faktöriyel(a-1);

        }else return 1;

    }

}
