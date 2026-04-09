public class Second_Largest {

    public static int secondlargest(int arr[]){
        int largest = arr[0];
        int seclargest = arr[1];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                largest = arr[i];
            }
            else if (arr[i]>seclargest &&arr[i]!=largest){
                seclargest = arr[i];
            }
        }
        return seclargest;
    }
    public static void main(String[] args) {
        int arr[] ={ 85,96,4,5,78,38,455,65};
        int result = secondlargest(arr);
        System.out.println("Second largest element is: " + result);
    }
}
