package BenimJava.J09_SwitchStatement;

import java.util.Scanner;

public class C06_SwitchCase {
    public static void main(String[] args) {

        //Task->girilen haftanın gününü hafta içi veya sonu olduğunu print eden code create ediniz

        Scanner sc = new Scanner(System.in);
        System.out.println("gun giriniz");
        String gun=sc.next();
        switch (gun){

            case "pazartesi":

            case "salı":

            case "çarşamba":
            case "perşembe":
            case "cuma":
                System.out.println("girilen gün hafta içine aittir");

                break;
            case"cumartesi":
            case"pazar":
                System.out.println("girilen gün hafta sonuna aittir....");
                break;
            default:
                System.out.println("lütfen doğru giriş yapınız");









        }



















    }
}
