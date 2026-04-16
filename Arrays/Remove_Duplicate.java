
import java.util.*;

class Remove_Duplicate {
    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 2, 3};

        Arrays.sort(nums);

        int j = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[j]) {
                j++;
                nums[j] = nums[i];
            }
        }

        // Print unique elements
        for (int i = 0; i <= j; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}