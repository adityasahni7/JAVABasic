package ArrayList;

import java.util.ArrayList;

public class ArrayList10 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(4);
        numbers.add(2);
        numbers.add(5);
        numbers.add(3);
        //lamda expression(function does not have any name)
        numbers.forEach(number ->{
            System.out.println(number*2);
        });
        System.out.println(numbers.toString());
    }
}
