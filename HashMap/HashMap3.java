package HashMap;
import java.util.HashMap;
public class HashMap3 {
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
        examScorces.putIfAbsent("Math", 69);
        //use examScores.replace("Math", 70); to replace the value
        System.out.println(examScorces.toString());
    }
}
