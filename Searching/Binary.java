import java.util.Arrays;
public class Binary {
    
//     Sirf sorted array me kaam karta hai
// Middle se check karta hai → half data eliminate
// Fast (O(log n))


//INBUID FUNCTION
//int M =Arrays.binarySearch(arr,target);

public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5};
    int target = 5;
    
    int  start =0;
    int  end = arr.length-1;
   while(start<=end){
    int m = (start + end) / 2;

    if(arr[m] ==target){
        System.out.println(m);
        return;
    }
    else if(arr[m]<target){
        start = m+1;
       
    }
    else{
        end = m-1;
    }
   }
   System.out.println("Element not found");
}
}
