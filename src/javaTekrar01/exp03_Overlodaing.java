package javaTekrar01;

public class exp03_Overlodaing {
    public static void main(String[] args) {

        //todo auto genereted method stup
int sonuç1=toplama(10,20,30);
        System.out.println("sonuç1:"+sonuç1);
int sonuç2=toplama(10,20);
        System.out.println("sonuç2:"+sonuç2);



    }

public static int toplama(int sayi1,int sayi2,int sayi3) {
  return sayi1+sayi2+sayi3;
}
public static int toplama(int sayi1,int sayi2){

        return sayi1+sayi2;
}
}





