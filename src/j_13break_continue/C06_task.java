package j_13break_continue;

import java.util.Scanner;

public class C06_task {
    public static void main(String[] args) {
   //task->girilen bir ifadedeki c karekterine kadar a karakter sayısını print eden code create ediniz


        Scanner sc=new Scanner(System.in);
        System.out.println("birşeyler yazınız");
        String birşeyler=sc.nextLine();
        int asayısı=0;
        for (int i = 0; i < birşeyler.length(); i++) {
            if (birşeyler.charAt(i) == 'a'){
                asayısı++;

            } else if (birşeyler.charAt(i) == 'c') {
                break;

            }
            System.out.println("döngüde işleme giren karakterler:"+birşeyler.charAt(i));
        }
        System.out.println("yazdığınız birşeylerda a sayısı :"+asayısı );



    }
}
