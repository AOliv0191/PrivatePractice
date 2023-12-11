public class UserInteraction3{
    public static void main(String[] args){
        String name = args[0];
        String food = args[1];
        String age = args[2];

        int year = 2023 - Integer.parseInt(age);
    
        String response = "Hi, please to meet you " + name +
        ". I also love " + food + "!!! I bet you were born in " +
        year +"?, eh?";

        System.out.println(response);
    }
    
}
