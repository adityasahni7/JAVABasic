package Strings;
public class strings8 {
    public static void main(String[] args) {
        String string1 = new String("abc");
        String string2 = new String("abc");
        System.out.println(string1==string2); //they are same strings but not same object
        System.out.println(string1.equals(string2));
    }
}
