import javax.swing.JOptionPane;

public class UserInteraction2{
    public static void main(String[] args){
        String name = JOptionPane.showInputDialog("What is your name?");

        String food = JOptionPane.showInputDialog("What is your favorite food?");

        String age = JOptionPane.showInputDialog("What is your age?");
        
        int year = 2023 - Integer.parseInt(age);
    
        String response = "Hi, please to meet you " + name +
        ". I also love " + food + "!!! I bet you were born in " +
        year +"?, eh?";

        JOptionPane.showMessageDialog(null,response);
    
    }
    
}
