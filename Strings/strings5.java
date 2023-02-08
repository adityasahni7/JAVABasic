package Strings;
public class strings5 {
    public static void main(String[] args) {
        String name = "Aditya Sahni"; //%s
        String country = "India";
        int age = 20; //%d
        String company = "Bennett Univerity";
        double gpa = 6.75; //%f
        char percentSign = '%'; //%c
        boolean amITellingTheTruth = true; //%b

        String formattedString = String.format(
            "My name is %s. I am from %s. I am %d years old. I work for %s. My gpa is %f. I have attended 100%c of my university classes. These are all %b claims.",
             name, country, age, company, gpa, percentSign, amITellingTheTruth 
        );
        System.out.println(formattedString);
    }
}
