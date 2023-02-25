package arrays;

import java.util.Arrays;

public class arrays10 {
    public static void main(String[] args) {
        int number[] = {1,2,3,4,5};
        int copyOfNumbers[] = Arrays.copyOf(number, number.length);
        Arrays.fill(number,0);
        System.out.println(Arrays.toString(number));
        System.out.println(Arrays.toString(copyOfNumbers));
    }
}
