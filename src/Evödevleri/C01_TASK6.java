package Evödevleri;

import java.util.Scanner;

public class C01_TASK6 {
    public static void main(String[] args) {

        // TASK 3
        // Girilen  gün sayısına karşılık gelen günün  adını print eden code create ediniz
        // 1.gün Pazartesi alınız

        Scanner scan=new Scanner(System.in);
        System.out.println("Pazartesi:1\nSalı:2\nçarşamba:3\nperşembe:4\nCuma:5\nCumartesi:6\npazar:7\n" +
                "haftanın kaçıncı gününde olduğunuzu girin");

        int kaçinciGun= scan.nextInt();
        switch (kaçinciGun){
            case 1:
                System.out.println("Bugün pazartesi");
                break;
            case 2:
                System.out.println("bugün salı");
                break;
            case 3:
                System.out.println("bugün çarşamba");
                break;
            case 4:
                System.out.println("bugün perşembe");
                break;
            case 5:
                System.out.println("bugün cuma");
                break;
            case 6:
                System.out.println("bugün cumartesi");
                break;
            default:
                System.out.println("bugün pazardır");

                // TASK 4
                    /*
		Girilen  ayın  kac cektigini print eden code create ediniz.*/

                Scanner sc=new Scanner(System.in);
                System.out.println("Bulunduğunuz ayın adını giriniz");
                String seçim= sc.nextLine().toLowerCase();
                switch (seçim){
                    case "ocak":
                    case "mart":
                    case "mayıs":
                    case "temmuz":
                    case "ağustos":
                    case "ekim":
                    case "aralık":
                        System.out.println("Girilen ay 31 gündür" );
                        break;
                        case"nisan":
                        case"haziran":
                        case"eylül":
                        case"kasım":
                            System.out.println("Girilen ay 30 gündür");
                            break;
                    case "şubat":
                        System.out.println("yılınızı giriniz");
                        int yil= sc.nextInt();
                        if (yil%4==0){
                            System.out.println("grilen şubat ayı 29 gün içerir");

                        }else System.out.println("girilen ay şubat ayı 28 gün içerir");



                }






















        }



    }
}
