package arrays;
import java.util.*;
public class arrays12 {
    public static void main(String[] args) {
        int numbers[] = {1,2,3,4,5};
        int copyOfNumbers[] = Arrays.copyOf(numbers, 2);
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(copyOfNumbers));
    }
}
