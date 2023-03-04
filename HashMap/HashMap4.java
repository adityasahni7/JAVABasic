package HashMap;
import java.util.HashMap;
public class HashMap4 {
    public static void main(String[] args) {
        HashMap<String, Integer> examScores = new HashMap<String, Integer>();
        examScores.put("Math", 75);
        examScores.put("Sociology", 85);
        examScores.put("English", 95);
        examScores.put("History", 90);
        examScores.put("Physics", 80);
        examScores.put("Chemistry", 70);
        examScores.put("Biology", 65);
        examScores.put("Geography", 60);
        System.out.println(examScores.get("Religion"));
        System.out.println(examScores.getOrDefault("Religion",-1));
    }
}
