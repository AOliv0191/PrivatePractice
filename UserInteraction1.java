import java.util.Scanner;

public class UserInteraction1{
    public static void main(String[] args){
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("What is your name?");
            String name = input.nextLine();

            System.out.println("What is your favorite food?");
            String food = input.nextLine();

            System.out.println("What is your age?");
            int age = input.nextInt();
            int year = 2023 - age;

            String response = "Hi, please to meet you " + name +
            ". I also love " + food + "!!! I bet you were born in " +
            year +"?, eh?";

            System.out.println(response);
        }
    }
    
}
