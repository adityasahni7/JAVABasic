package OOPS.OOPS1;
import java.time.LocalDate;
public class HelloWorld {
    public static void main(String[] args) {
        User youngerUser = new User();
        youngerUser.name = "John";
        youngerUser.birthDay = LocalDate.of(1990, 1, 1);
        User olderUser = new User();
        olderUser.name = "Jane";
        olderUser.birthDay = LocalDate.of(1980, 1, 1);
        System.out.println(youngerUser.name + " is " + youngerUser.age() + " years old.");
        System.out.println(olderUser.name + " is " + olderUser.age() + " years old.");
    }
}
