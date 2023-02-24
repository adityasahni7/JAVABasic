package arrays;
import java.util.*;
public class arrays6 {
    public static void main(String[] args) {
        char vowels[] = {'e','u','a','o','i'};
        Arrays.sort(vowels);
        char key = 'o';
        int foundItemIndex = Arrays.binarySearch(vowels, key);
        System.out.println(Arrays.toString(vowels));
        System.out.println(foundItemIndex);
    }
}
