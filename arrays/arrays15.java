package arrays;
import java.util.*;
public class arrays15 {
    public static void main(String[] args) {
        int numbers[] = {1,2,3,4,5};
        int copyOfNumbers[] = Arrays.copyOf(numbers, numbers.length);
        System.out.println(Arrays.equals(numbers, copyOfNumbers));
    }
}
