package Evödevleri;

import java.util.Scanner;

public class C01_task07 {
    public static void main(String[] args) {

        // TASK 4
                    /*
		Girilen  ayın  kac cektigini print eden code create ediniz.*/

        Scanner sc = new Scanner(System.in);
        System.out.println("Bulunduğunuz ayın adını giriniz");
        String seçim = sc.nextLine().toLowerCase();
        switch (seçim) {
            case "ocak":
            case "mart":
            case "mayıs":
            case "temmuz":
            case "ağustos":
            case "ekim":
            case "aralık":
                System.out.println("Girilen ay 31 gündür");
                break;
            case "nisan":
            case "haziran":
            case "eylül":
            case "kasım":
                System.out.println("Girilen ay 30 gündür");
                break;
            case "şubat":
                System.out.println("yılınızı giriniz");
                int yil = sc.nextInt();
                if (yil % 4 == 0) {
                    System.out.println("grilen şubat ayı 29 gün içerir");

                } else System.out.println("girilen ay şubat ayı 28 gün içerir");
                break;
            default:
                System.out.println("hatalı giriş yaptınız");
        }


        }


    // TASK 6:
    // VIP (Very Important Person) kisaltmasinda harflerin kelime karşılığını print eden code create ediniz


    Scanner scan=new Scanner(System.in);

















    }