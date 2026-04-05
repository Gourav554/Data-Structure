package Arrays;
import java.util.*;

public class Reverse {
    public static void main(String args[]) {

        Integer arr[] = {1, 2, 3, 4, 5}; // Integer use karo

        List<Integer> list = Arrays.asList(arr);
        Collections.reverse(list);

        System.out.println("Reversed array: " + list);
    }
}