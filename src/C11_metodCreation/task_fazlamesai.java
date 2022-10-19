package C11_metodCreation;

import java.util.Scanner;

public class task_fazlamesai {
    /*
Fazla mesaiyi hesaplayan bir  method create ediniz
Yazacağınız program toplam kazancı return etsin.

Kullanıcıdan saatlik çalışma ücretini, hangi saatler arasında çalıştığını ve
fazla mesaiye kalırsa kazancını kaç ile katlayacağını alalım.

Daha sonra şu şekilde bir program yazınız :

Örnek :
saatlik çalışma ücreti : 40.0
hangi saat başladı : 9.0
hangi saat bitti : 20.0
mesaiyi kaçla katlayacağız : 1.8

ucretHesapla(9.0,20.0,40.0,1.8);

9 ile 17 arasında toplam çalışma 8 saat olduğu için 8 x 40 = 320
17 ile 20 arasında toplam çalışma 3 saat olduğu için 3 x 40 x 1.8 =  216

toplam = 536.0
*/
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        karar();

    }

    public static void karar() {
        int mesafe = 0;
        System.out.print("hoşgeldiniz nereye yolculuk ? \nB şehri , C şehri , D şehri     ");
        char yol = scan.next().toUpperCase().charAt(0);
        System.out.print("Yaşınızı giriniz : ");
        int yas = scan.nextInt();
        System.out.print("Uçuş çift yön mü olacak <E>vet   <H>ayır : ");
        char ucusTip = scan.next().toUpperCase().charAt(0);

        switch (yol) {

            case 'B':
                mesafe = 500;
                yasInd(yas);
                ucusTipi(ucusTip);
                biletFiyat(yasInd(yas), ucusTipi(ucusTip), mesafe);
                break;
            case 'C':
                mesafe = 700;
                yasInd(yas);
                ucusTipi(ucusTip);
                biletFiyat(yasInd(yas), ucusTipi(ucusTip), mesafe);
                break;
            case 'D':
                mesafe = 900;
                yasInd(yas);
                ucusTipi(ucusTip);
                biletFiyat(yasInd(yas), ucusTipi(ucusTip), mesafe);
                break;

            default:
                System.out.println("yanlış seçim yaptınız.");
                karar();

        }
        System.out.println("bilet fiyatınız : " + biletFiyat(yasInd(yas), ucusTipi(ucusTip), mesafe) + "$'dır");
        indirimlerYaz(yas, ucusTip);

    }

    public static double yasInd(int a) {

        double ind = 1;
        if (a <= 12) {
            ind = 0.5;
        } else if (a > 12 && a <= 24) {
            ind = 0.9;
        } else if (a >= 65) {
            ind = 0.7;
        } else {
            ind = 1;
        }
        return ind;
    }

    public static double ucusTipi(char ucusTipi) {
        double tipInd = 1;

        if (ucusTipi == 'E') {
            tipInd = 0.8;
        } else {
            tipInd = 1;
        }
        return tipInd;
    }

    public static double biletFiyat(double yasInd, double ucusTipi, int mesafe) {
        double fiyat = 1;
        if (ucusTipi != 0) {
            fiyat = yasInd * ucusTipi * mesafe * 0.10;
        } else {
            fiyat = yasInd * ucusTipi * mesafe * 2 * 0.10;
        }
        return fiyat;

    }

    public static void indirimlerYaz(int yas, char ucusInd) {
        System.out.println("yaş indiriminiz : %" + (100 - (yasInd(yas)) * 100) + "    Çift yön indiriminiz : %"
                + (100 - (ucusTipi(ucusInd)) * 100));


    }//main dışı

}



