package ArrayList;
import java.util.ArrayList;
import java.util.Comparator;
public class ArrayList7{
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(4);
        numbers.add(2);
        numbers.add(5);
        numbers.add(3);
        numbers.sort(Comparator.naturalOrder());
        //we can reverse the order by Comparator,reverseOrder()
        System.out.println(numbers.toString());
    }
}