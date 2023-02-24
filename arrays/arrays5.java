package arrays;
import java.util.*;
public class arrays5 {
    public static void main(String[] args) {
        char vowels[] = {'e','u','a','o','i'};
        int startingIndex = 1;
        int endingIndex = 4;
        Arrays.sort(vowels, startingIndex, endingIndex);
        System.out.println(Arrays.toString(vowels));
    }
}
