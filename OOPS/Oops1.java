package OOPS;
import java.time.LocalDate;
import java.time.Period;
public class Oops1 {
    public String name;
    public LocalDate birthday;
    public int age(){
        int age = Period.between(this.birthday, LocalDate.now());
        return age();
    }
}
