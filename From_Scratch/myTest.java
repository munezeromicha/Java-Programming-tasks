import javax.swing.JOptionPane; 
public class myTest {
    private static Object INFORMATION_MESSAGE;

    public static void main(String[] args){
        // JOptionPane.showMessageDialog(null, "Please enter the credentials: ", "Please fill this form", JOptionPane.INFORMATION_MESSAGE);
        String name = JOptionPane.showInputDialog("Enter your name here: ");
        System.out.println("Your name is: " + name);
    }

}
