package BenimJava.j10_StringManipulations;

public class C01_Concatenation {
    public static void main(String[] args) {


        /*concat methodu içine (parametre)aldığı string variabl'1 çalıştığı stringin sonuna ekler
        Java da +işlemi yapılırken eğer en az bir stirng varible varsa java toplama değil concT Yapar


         */
        String name ="Nur";
        String meslek=" Qa tester";
        System.out.println(name.concat(meslek));

        // ahan da TRICK-> String method'ları variable geciic değişklik yapar.
// ama değişken atam ayağpılırsa kalıcı değişir



        name=meslek.concat (name);
        System.out.println("name=" +name);

        name = meslek.concat(name);
        System.out.println("name = " + name);//name =  Qa tester  Nur

        System.out.println( name.concat(true + " :) "));// Qa tester  Nurtrue :)
        System.out.println( name.concat(100+ " :) "));// Qa tester  Nur 100 :)

        // TRICK-> concat methodu parametre olarak string type harici tüm dataları srtinge cevirip concat eder





























    }
}
