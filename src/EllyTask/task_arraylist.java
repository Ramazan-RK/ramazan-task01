package EllyTask;

import java.util.Arrays;

public class task_arraylist {
    /*
   Find the middle element in an integer array
   Example:  (10, 5, 6) ==> (5, 6, 10) ==> Output=6
             (16, 5, 8, 10) ==> (5, 8, 10, 16) ==> Output=(8+10)/2 = 9
*/

    public static void main(String[] args) {


     int[] arr={16,5,8,};
     Arrays.sort(arr);//arr in elemanlarını sıraladık
        System.out.println(Arrays.toString(arr));
        int middleIndex=arr.length/2;
        if (arr.length%2!=0){

            System.out.println(arr[middleIndex]);

        }else{
            middleIndex=(arr[middleIndex] + arr[middleIndex-1])/2;
            System.out.println(middleIndex);
        }




















    }


















}

