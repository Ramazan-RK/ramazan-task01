package j16_ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class C02_nCopies {
    public static void main(String[] args) {



        ArrayList<String> listUlke = new ArrayList<>(List.of("Alamanya","Amerigonya","ingiltere","isvec"));
        ArrayList<String> listsehir = new ArrayList<>(List.of("Münih","LosAngeles","Londra","stokholm"));


        //nCopies(int,obj);->int elemanlı bir list

        ArrayList<String> yeniList=new ArrayList<>(Collections.nCopies(7,"javacan"));
        System.out.println(yeniList);


        //addAll();bir liste diğer liste olduğu gibi ekler

        listUlke.addAll(listsehir);//ülke list sonuna tamamen eklenir

        System.out.println("listUlke="+listUlke);

        System.out.println("listsehir=" + listsehir);

        System.out.println(listsehir.addAll(3, listUlke));


        //task->1 den 10 kadar sayıları bir liste atayıp print eden code ccreate ediniz
        //task-> 1 den 10 kadar sayılara bir liste atayıp print eden code create ediniz
        ArrayList<Integer> listSayi= new ArrayList<>();//boş integer list

        for (int i = 1; i <=10; i++) {
            listSayi.add(i);
        }
        System.out.println("listSayi = " + listSayi);//[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
    }
}
