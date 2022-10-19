package j14_scope;

public class C02_statıcVariable {

/* instance variable'lar obje'ye bagimlidir ve her obje farkli degerler alabilir
    ogrenci notlari veya ogretmen branslari gibi
    bir objeye ait bir variable'in son degerini bulmak icin sadece o objeyi dikkate aliriz

   Static variabler ise class variable olarak tanimlanir
   ve tum class uyeleri icin aynidir. Okul ismi, okul mudurunun adi gibi
   eger static variable'in degeri degistirilirse herkes icin degisir


 */
  static String firmaName=  "clarusway";
  static int firmaID;
  static boolean firmaIT;//güneş





public static void main(String[] args) {

    System.out.println("firmaID="+firmaID);//0
    firmaID=1001;
    System.out.println("firmaID="+firmaID);//1001
    C02_statıcVariable.firmaIT=true;//classname ile static variable call bad practice





}
   public static void statıcMethod(){
    firmaID=2002;
       System.out.println("yeni Id hayırlı olsun"+firmaID);

   }
public  void non_staticMethod(){
    firmaName="javacan";
    System.out.println("yeni firma:"+firmaName);
}

}
