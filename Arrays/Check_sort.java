import java.uti.Arrays;
public class Check_sort {
    public static void main(String[] args){
        int  arr[] = {1,2,9,4,5,6};
        boolean sort = true;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                sort = false;
            }
        }
        if(sort){
            System.out.println("array is sorted");
        }
        else{
            System.out.println("array is not sorted");
        }
    }
}


