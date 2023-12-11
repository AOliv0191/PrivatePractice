import java.util.Scanner;

public class FoolingAround {
    public static void main(String[]args){
        try (Scanner input = new Scanner(System.in)) {
            String s;
            String q ="";
            int i;

            while(!q.equalsIgnoreCase("quit")){
                System.out.print("Provide text: ");
                s = input.nextLine();
                i = 0;
                while(i < s.length()){
                    System.out.println(s.charAt(i));
                    i++;
                }
                System.out.println("Do you want to quit?");
                q = input.nextLine();
            }
        }
    }
}
