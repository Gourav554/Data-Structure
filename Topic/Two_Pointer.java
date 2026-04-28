package Topic;

public class Two_Pointer {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int target = 5;
        
        int start = 0;
        int end = arr.length - 1;
        
        while (start <= end) {
            int sum = arr[start] + arr[end];
            
            if (sum == target) {
                System.out.println("Pair found: " + arr[start] + " and " + arr[end]);
                return;
            } else if (sum < target) {
                start++;
            } else {
                end--;
            }
        }
        
        System.out.println("No pair found");
    }
    
}
