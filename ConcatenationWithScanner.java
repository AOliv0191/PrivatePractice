import java.util.Scanner;

public class ConcatenationWithScanner {
    public static void main(String[]args){
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Insert Today's Month: ");
            String month = input.nextLine();
            
            System.out.print("Insert Today's Day: ");
            String day = input.nextLine();

            System.out.print("Insert Your Major: ");
            String major = input.nextLine();

            //Exercise 2
            System.out.println("Today is " + month + ", of 2023. The day is " + day + ". Our study major is " + major );

            //Exercise 3
            int size1 = month.length();
            int size2 = day.length();
            int size3 = major.length();

            int totalSize = size1 + size2 + size3;

            System.out.println("The total number of characters is : " + totalSize);

            //Exercise 4
            System.out.print("Insert Your First Name: ");
            String firstName = input.nextLine().toUpperCase();

            System.out.print("Insert Your Last Name: ");
            String lastName = input.nextLine().toUpperCase();

            char initialFirst = firstName.charAt(0);
            char initialLast = lastName.charAt(0);

            System.out.println(initialFirst + "." + initialLast + ".");
        }
    }
}
