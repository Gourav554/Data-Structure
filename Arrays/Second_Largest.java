public class Second_Largest {

    public static int secondlargest(int arr[]){
        int largest = arr[0];
        int seclargest = arr[1];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                //arr[i] ki value large hogi to wo largest mai jaygi aur jo latgest wali hai wo second largest mai
                seclargest = largest;
                largest = arr[i];
            }
            else if (arr[i]>seclargest &&arr[i]!=largest){
                seclargest = arr[i];
            }
        }
        return seclargest;
    }
    public static void main(String[] args) {
        int arr[] ={ 1,2,3,4,5};
        int result = secondlargest(arr);
        System.out.println("Second largest element is: " + result);
    }
}
