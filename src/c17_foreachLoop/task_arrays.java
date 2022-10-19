package c17_foreachLoop;

public class task_arrays {
    public static void main(String[] args) {
        /*
        task:
        bir int Array elemanlarının işaretini (+-) değiştiren bir method create ediniz
        input:1,2,-3,4,-5,-6
        output:-1,-2,3,-4,5,6
         */

        int arr[] = {1, 2, -3, 4, -5, -6};

        syınınTersi(arr);
    }

    private static void syınınTersi(int[] arr) {

        for (int a:arr){
            a*=-1;
            System.out.print(a+" ");
        }


















    }
}
