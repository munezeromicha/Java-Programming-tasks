import javax.swing.*;
// we want to one swing class called JOptionPane
//JOptionPane has 2 methods: showMessageDialog and showInputDialog

public class SwingDemo {
    static int a;
    public static void main(String args[]){
        JOptionPane op = new JOptionPane();
        String s = op.showInputDialog("Enter a number");
        a = Integer.parseInt(s);
        int sq = a*a;
        op.showMessageDialog(null, "Welcome to Swing programming\n" + "Square = " + sq);

    }
}