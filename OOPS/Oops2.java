package OOPS;
import java.time.LocalDate;
public class Oops2 {
    public static void main(String[] args) {
        Oops1 youngerUser = new Oops1();
        youngerUser.name = "Aditya Sahni";
        youngerUser.birthday = LocalDate.of(2002, 10, 30);
        System.out.printf("User %s was born on %s", youngerUser.name, youngerUser.birthday.toString());
    }
}
