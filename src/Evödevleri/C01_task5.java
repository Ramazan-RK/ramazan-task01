package Evödevleri;

import java.util.Scanner;

public class C01_task5 {
    public static void main(String[] args) {

        //task 01->girilen bir sayının onlar basamağını sayı ile yazdırınız

      /*  Scanner sc=new Scanner(System.in);
        System.out.println("Sayı=");
        int sayı= sc.nextInt();
        sayı/=10;
        sayı%=10;
        switch (sayı){
            case 0:
                System.out.println("Girilen sayınıın onlar basamağı SIFIR dır");
                break;
            case 1:
                System.out.println("Girilen sayınıın onlar basamağı Bİr dır");
                break;
            case 2:
                System.out.println("Girilen sayınıın onlar basamağı iki dır");
                break;
            case 3:
                System.out.println("Girilen sayınıın onlar basamağı üç dür");
                break;

            case 4:
                System.out.println("Girilen sayınıın onlar basamağı dört dır");
                break;
            case 5:
                System.out.println("Girilen sayınıın onlar basamağı beş dır");
                break;
            case 6:
                System.out.println("Girilen sayınıın onlar basamağı altı dır");
                break;

            case 7:
                System.out.println("Girilen sayınıın onlar basamağı yedi dır");
                break;
            case 8:
                System.out.println("Girilen sayınıın onlar basamağı sekiz dır");
                break;
            case 9:
                System.out.println("Girilen sayınıın onlar basamağı dokuz dır");
                break;
            default:
                System.out.println("lütfen doğru giriş yapınız");*/





                //task->Kullanıcının yasadığı güne göre 100 gün sonra hangi gün olduğunu print eden code create ediniz

                //pazartesi hafta başı olacak

                Scanner scan=new Scanner(System.in);
                System.out.println("Pazartesi:1\nSalı:2\nçarşamba:3\nperşembe:4\nCuma:5\nCumartesi:6\npazar:7\n" +
                        "haftanın kaçıncı gününde olduğunuzu girin");
                int kacinciGun=scan.nextInt();
                switch (kacinciGun){
                    case 1:
                    System.out.println("Bugün pazartesi olduğundan,100 gün sonrası+çarşambadır");
                    break;
                    case 2:
                        System.out.println("Bugün salı olduğundan,100 gün sonrası+perşembe'dir");
                        break;
                    case 3:
                        System.out.println("Bugün çarşamba olduğundan,100 gün sonrası+cuma dır");
                        break;
                    case 4:
                        System.out.println("Bugün perşembe olduğundan,100 gün sonrası+cumartesi dir");
                        break;
                    case 5:
                        System.out.println("Bugün cuma olduğundan,100 gün sonrası+pazar dır");
                        break;
                    case 6:
                        System.out.println("Bugün cumartesi olduğundan,100 gün sonrası+pazartesi dir");
                        break;
                    default:
                        System.out.println("Bugün pazar olduğundan,100 gün sonrası "+"Salı dır");










                }




















        }



    }


