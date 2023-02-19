package UserInput;

import java.util.Scanner;

public class userinput1 {
        public static void main(String[] args) {
           Scanner scanner = new Scanner(System.in);
   
           System.out.println("What is your name? ");
           String name = scanner.nextLine();
   
           System.out.printf("Hello %s. How old are you?",name);
           int age = Integer.parseInt(scanner.nextLine());

          // double gpa = Double.parseDouble(scanner.nextLine());

           scanner.nextLine(); // cleans up the input buffer
   
           System.out.printf("%d is an excellent age to start programming. What language do you prefer?",age);
           String language = scanner.nextLine();

           System.out.printf("%s is a very popular programing language.", language);
           scanner.close();
        }
}
