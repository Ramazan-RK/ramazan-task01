package EllyTask;

public class Q07_StringManipılations {

    /*
     * girilen String icinde "xyz" dizimi var ise true degilse false return eden metod yaziniz
     *
     * input      output
     * axyzm  ==   true
     * xyz    ==   true
     * x.yz   ==   false
     * xyaz   ==   false
     */


    public static void main(String[] args) {

        String s="dxyzi";
        boolean xyziçeriyormu=false;
        if (s.contains("xyz")){
            xyziçeriyormu=true;
            System.out.println(xyziçeriyormu);

        }else {
            xyziçeriyormu=false;
            System.out.println(xyziçeriyormu);


        }








    }






}
