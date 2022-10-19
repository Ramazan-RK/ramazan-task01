package j_13break_continue;

import java.util.Scanner;

public class C01_break {
    public static void main(String[] args) {

/*
break loop'u istenen yerden sonlandırmak için  sonlandırmak için döngüyü kontrol edebiliriz.Bir loop'u, loop'un koşul bölümüne bağlı
kalmaksızın sona erdirmek için break komutu kullanılır. break komutu loop'a bağlı kod bloğunun
 herhangi bir işlem satırında yer alabilir. Program kod bloğunda break komutu'nu görür görmez,
 loop başlangıç koşulu sağlanmış olsa bile, loop'dan çıkar ve loop'dan sonra gelen ilk işlem
 satırından çalışmasına devam eder. İç içe(nested) looplarda break komutu kullanıldığında sadece
  içinde kullanıldığı loop'dan çıkışı sağlar:


 temelde döngüden atlamak için kullanılır, çoğunlukla if-else deyimi ile kullanılır
 */

// Task ->girilen bir mail hesabının @ sembolune kadar olan karakterlerni print eden code create ediniz.


        Scanner sc=new Scanner(System.in);
        System.out.println("mail hesabını giriniz");

        String meyil= sc.nextLine();

        for (int i = 0; i < meyil.length(); i++) {//0 indexten son indexe kadar herbir karekteri döngüye alır
            char c = meyil.charAt(i);//döngüdeki her bir karekteri c ye atar
            if (c == '@'){
                break;// if blok loop'u sonlandırır.kırar
            }
            System.out.print(c);//
        }










    }

}
