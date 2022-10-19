package EllyTask;

import java.util.Scanner;

public class T01_switchCase {
    public static void main(String[] args) {

        /*
    gunleri gösterebilen bir program yazın
    gun Pazartesi veya Sali ise:
    Java dersi gunleri

    gun Persembe veya Cuma ise:
    Selenyum dersi gunleri

    gun carsamba veya cumartesi ise:
    SQL dersi gunleri

    aksi halde: izin gunu
    (if deyimini KULLANMAYIN)
*/

        String day="monday";
        switch (day){

            case "Monday":
            case "tuesday":
                System.out.println("java class");
                break;
            case "thursday":
            case "friday":
                System.out.println("selenium class");
                break;
            case "wednasday":
            case "saturday":
                break;
            default:
                System.out.println("day off");




        }











    }
}
