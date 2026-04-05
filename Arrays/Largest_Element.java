package Arrays;

public class Largest_Element {
    public static int findlargestElementn  (int arr[])
    int largest = arr[0];
    for(int i=0;i<arr.length;i++){
        if(arr[i]>largest){
            largest = arr[i];
        }
    }
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 2, 8};
       
    }
}
