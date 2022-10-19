package L01_forLoops;

public class c01_dowhileLoop {


    public static void main(String[] args) {

       /*
       while loop ->önce  şart kontrol edilir eğer şart sonucu trıe alınırsa body action çalışır
        do-while loop-> önce body action çalışır sonra şart kontrol edilir.şart true ise döngü devam edilir
        şart false ise döngü kırılır ve döngüden sonraki ilk satır çalışır
        do-while loop ->game app. de daha çok kullnılır
        trik:Trick: while loop sart sağlanmazsa hiç çaılşmayabilir ama do-while sart sağalasın sağlamasın
en az bir kez çalışır..

        */


        int yas = 31;
        //  while (yas < 33) {
        //      System.out.println("agam yas " + yas + " gayet basarılı :) while body action ....");

        //      yas++;
        //  }

        do {
            System.out.println("agam yas " + yas + " gayet basarılı :) do while body action");

            yas++;

        } while (yas < 33);













    }
}
