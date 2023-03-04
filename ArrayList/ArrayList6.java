package ArrayList;
import java.util.ArrayList;
public class ArrayList6{
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1); //0
        numbers.add(2); //1
        numbers.add(3); //2
        numbers.add(4); //3
        numbers.add(5); //4
        numbers.set(2, Integer.valueOf(30));
        System.out.println(numbers.toString());
    }
}