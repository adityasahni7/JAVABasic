package OtherLoops;

public class WhileLoops {
    public static void main(String[] args) {
        int number = 5;
        int multiplier = 1;
        while(multiplier <= 10){
            System.out.printf("%d X %d = %d \n", number, multiplier, number*multiplier);
            multiplier++;
        }
    }
}
