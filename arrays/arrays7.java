package arrays;

import java.util.Arrays;

public class arrays7 {
    public static void main(String[] args) {
        char vowels[]= {'a','e','i','o','u'};
        Arrays.fill(vowels , 'x');
        System.out.println(Arrays.toString(vowels));
    }
}
