package Arrays;
import java.util.*;

public class Reverse {
    public static void main(String args[]) {

        Integer arr[] = {1, 2, 3, 4, 5}; // Integer use karo
            // In Build Function is not working for primitive data type like int, we have to use wrapper class Integer
        // List<Integer> list = Arrays.asList(arr);
        // Collections.reverse(list);

        // System.out.println("Reversed array: " + list);


        int left = 0;
        int right = arr.length -1;
        while(left<right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left ++;
            right--;
        }
        System.out.println("Reversed array: " + Arrays.toString(arr));
    }
}