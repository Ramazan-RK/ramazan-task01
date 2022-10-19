package BenimJava.j10_StringManipulations;

public class C11_Vallueof_parse {
    public static void main(String[] args) {

        // Integer.valueOf() rakamlarla olusturulan String'leri sayiya donusturur. Boylece rakamlarla olusturulan
// Stringlerle matematiksel islemler yapabilmemizi saglar.

//valueOf() hem Integer wrapper classinin icinde hem de String'in icinde var. Integer wrapper classinin icinde
//olan valueOf() methdou String'i integer'a cevirir. String'in icindeki valueOf() methodu integer'i String'e cevirir.

     //task->string type verilen iki adet bağış miktarını toplayan code create ediniz

     String bagiş1="1500";
     String bagış2="2500";

     int bagiçDegeri1=Integer.valueOf(bagiş1);
     int bagişDeğeri2=Integer.valueOf(bagış2);
        System.out.println("toplam bagış miktarı:"+(bagiçDegeri1+bagişDeğeri2));


        System.out.println(Integer.parseInt(bagiş1) + Integer.parseInt(bagış2));


        Integer tc=1234567;
        String strtc=String.valueOf(tc);
        System.out.println("strtc="+(strtc+tc));

        String fiyat="$150";
        int yeniFiyat=Integer.valueOf(fiyat);



    }
}
