package BenimJava.j10_StringManipulations;

public class C05_Start_EndWith {

    public static void main(String[] args) {

/**
 * startsWith()
 *  Metnin bas kisminin istenilen dizi ile eslesip eslesmedigini kontrol eder. Sonucu boolean dir.
 *  String'in basladigi characteri dogrular
 * endsWith()
 * Metnin son kisminin istenilen dizi ile eslesip eslesmedigini kontrol eder. Sonucu boolean dir.
 */



String sehir="İstanbul";
        System.out.println(sehir.startsWith("İ"));
        System.out.println(sehir.startsWith("İs"));
        System.out.println(sehir.startsWith("s"));
        System.out.println(sehir.endsWith("l"));
        System.out.println(sehir.startsWith("bul"));
        System.out.println(sehir.startsWith("bu"));
        String str="bul";
        System.out.println(sehir.endsWith(str));
        int yas=48;
        System.out.println(sehir.startsWith("ya"));


//task->girilen e-mail hesabının geçerli @gmail.com içermiyorsa "lütfen gmail hesabı giriniz"
        //@mail.com ile bitiyorsa "hesabınınz onaylandı"aksi durumda "geçerli hesap giriniz print eden code create ediniz









    }


}
