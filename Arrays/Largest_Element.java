import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Largest_Element {

    //not a Inbuild function
    public static int findlargestElementn  (int arr[]){
    int largest = arr[0];
    for(int i=0;i<arr.length;i++){
        if(arr[i]>largest){
            largest = arr[i];
        }
    }
        return largest;
    }


// List<Integer> list = Arrays.asList(10, 5, 20, 8);

// int max = Collections.max(list);

    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 2, 8};
    
       int result=findlargestElementn(arr);
       System.out.println("largest:  " + result);
    }

}