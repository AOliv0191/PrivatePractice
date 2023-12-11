import java.util.Scanner;

public class MeanGradeScore{
    public static void main(String[]args){
        try(Scanner input = new Scanner(System.in)){
            double test1;
            double test2;
            double test3;
            double sum;
            double avg;

            System.out.println("Provide the score of the first test:");
            test1 = input.nextDouble();

            System.out.println("Provide the score of the second test:");
            test2 = input.nextDouble();

            System.out.println("Provide the score of the third test:");
            test3 = input.nextDouble();

            sum = test1 + test2 + test3;
            avg = sum/3;

            if (avg == 100.0){
                System.out.println("Your final grade is a perfect A");
                System.out.println("Are you parents Asian or something?");
            }
            else if((avg >= 90.0) && (avg <100.0)){
                System.out.println("Your final grade is A");
                System.out.println("Yet, not a perfect A :p.");
            }
            else if ((avg >= 80.0) && (avg < 90.0)){
                System.out.println("Your final grade is B");
                System.out.println("Wow... how disappointing...");
            }
            else if ((avg >= 70.0) && (avg < 80.0)){
                System.out.println("Your final grade is C");
                System.out.println("That means you are an average failure.");
            }
            else if ((avg >= 60.0) && (avg < 70.0)){
                System.out.println("Your final grade is D");
                System.out.println("How does it feel to be walking on the tightrope between " 
                + "failing classes and almost being kicked out of home?");
            }
            else if ((avg < 60.0) && (avg > 0.0)){
                System.out.println("Your final grade is F");
                System.out.println("One of two: either the teacher really hates you, or you really are a disappointment.");
            }
            else if(avg <= 0.0){
                System.out.println("Your final grade is F");
                System.out.println("Really, there is no way you can even fail this hard.");
                System.out.println("What do you even do at school?!");
            }
            else{
                System.out.println("In case you didn't notice, you have to write actually numbers on the request.");
                System.out.println("Is not even that hard, geez.");
            }
        }
    }
}