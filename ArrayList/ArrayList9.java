package ArrayList;

import java.util.ArrayList;

public class ArrayList9 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(4);
        numbers.add(2);
        numbers.add(5);
        numbers.add(3);
        numbers.clear();
        System.out.println(numbers.isEmpty());
    }
}
