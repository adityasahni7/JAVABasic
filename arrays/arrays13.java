package arrays;
import java.util.*;
public class arrays13 {
    public static void main(String[] args) {
        int numbers[] = {1,2,3,4,5};
        int startingIndex = 1;
        int endingIndex = 4;
        int copyOfNumbers[] = Arrays.copyOfRange(numbers, startingIndex, endingIndex);
        Arrays.fill(numbers, 0);
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(copyOfNumbers));
    }
}
