package arrays;

import java.util.Arrays;

public class arrays9 {
    public static void main(String[] args) {
        int number[] = {1,2,3,4,5};
        int copyOfNumbers[] = number;
        Arrays.fill(number,0);
        System.out.println(Arrays.toString(number));
        System.out.println(Arrays.toString(copyOfNumbers));
    }
}
