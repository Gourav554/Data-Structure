import java.util.*;
public class MissingNo {
    public static void main(String args[])
    
    {
        int arr[] = {1, 2, 3, 5};
        int n = arr.length + 1; // Total numbers from 1 to n
        int sum = n * (n + 1) / 2; // Sum of first n natural numbers
        int missingNumber = sum - Arrays.stream(arr).sum(); // Subtract the sum of array from total sum
        System.out.println("Missing number: " + missingNumber);
    }
}
