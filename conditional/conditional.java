package conditional;
import java.util.Scanner;
public class conditional {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        double number1 = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Enter the second number: ");
        double number2 = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("What operation do you want to perform?");
        String operation = scanner.nextLine();
        System.out.println(number1);
        System.out.println(number2);
        if (operation.equals("sum")){
            System.out.printf("%f + %f = %f", number1, number2, number1 + number2);
        }
        else if (operation.equals("sub")){
            System.out.printf("%f - %f = %f", number1, number2, number1 - number2);
        }
        else if (operation.equals("mul")){
            System.out.printf("%f * %f = %f", number1, number2, number1 * number2);
        }
        else if (operation.equals("div")){
            System.out.printf("%f / %f = %f", number1, number2, number1 / number2);
        }
        else {
            System.out.printf("Invalid operation", operation);
        }
        scanner.close();
    }
}
