package arrays;
import java.util.*;
public class arrays11 {
    public static void main(String[] args) {
        char vowels[] = {'a','e','i','o','u'};
        int startingIndex = 1;
        int endingIndex = 4;
        Arrays.fill(vowels, startingIndex, endingIndex, 'x');
        System.out.println(Arrays.toString(vowels));
    }
}
