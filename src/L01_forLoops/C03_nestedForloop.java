package L01_forLoops;

public class C03_nestedForloop {
    public static void main(String[] args) {


/*
eğer bir döngünüün badisinde başka bir döngü bulunuyorsa bu tür döngülere nested loop yani
iç içe döngü denir.iç döngü dış döngünüün her  adımında tekrar çalışır.
iç içe döngülerde en içdeki  döngü en önce çalışır

 */

        for (int apt= 1; apt <10; apt++) {
            System.out.println("dış döngü:"+apt);
            for (int daire   = 1; daire < 5; daire++) {

                System.out.println("i"+apt+"için iç döngü j:"+daire);

            }

        }





    }
}
