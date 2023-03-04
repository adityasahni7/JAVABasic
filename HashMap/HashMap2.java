package HashMap;
import java.util.HashMap;
public class HashMap2 {
    public static void main(String[] args) {
        HashMap<String, Integer> examScorces = new HashMap<String, Integer>();
        examScorces.put("Math", 75);
        examScorces.put("Sociology", 85);
        examScorces.put("English", 95);
        examScorces.put("History", 90);
        examScorces.put("Physics", 80);
        examScorces.put("Chemistry", 70);
        examScorces.put("Biology", 65);
        examScorces.put("Geography", 60);
        System.out.println(examScorces.get("English"));
    }
}
