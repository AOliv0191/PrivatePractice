import javax.swing.JOptionPane;

public class MeanUserTestScore {
    public static void main(String[]args){
        String score = JOptionPane.showInputDialog("Tell me the score that you got on the test:");

        double testScore = Double.parseDouble(score);

        if(testScore <=60.0){
            if(testScore ==0.0){
                JOptionPane.showMessageDialog(null, "Your grade is F. " + 
                "Wow... really, how do you even fail this hard?");
            }
            else{
                JOptionPane.showMessageDialog(null, "Your grade is F. " + 
                "Congratulations, you are a failure and you better get used to it.");
                
            }
        }
        else if(testScore >60.0){
            if(testScore <=70.0){
                JOptionPane.showMessageDialog(null, "Your grade is D. " + 
                "Don't brag about it, though. You're still almost a failure.");
            }
            else if(testScore <=80.0){
                JOptionPane.showMessageDialog(null, "Your grade is C. " + 
                "Well, only half of you is a failure.");
            }
            else if(testScore <=90.0){
                JOptionPane.showMessageDialog(null, "Your grade is B. " + 
                "How does it feel being the failure of second place, uh?");
            }
            else if(testScore <=99.9){
                JOptionPane.showMessageDialog(null, "Your grade is A. " + 
                "Common men, it's an A. Don't argue with your teacher for some points.");
            }
            else if(testScore >=100.0){
                JOptionPane.showMessageDialog(null, "Your grade is a perfect A. " + 
                "Wow, you really don't have a lot of friends... do you?");
            }
        }
    }
}