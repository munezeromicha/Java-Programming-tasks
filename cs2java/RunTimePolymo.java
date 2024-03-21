package cs2java;
import javax.swing.*;
public class RunTimePolymo {
    public void getData(){
        JOptionPane op = new JOptionPane();
        int a = Integer.parseInt(op.showInputDialog("Enter a Number:"));
        for (int i = 1; i<= 10; i++){
            System.out.println(a+ "*"+i+"=" + (a*i));
        }
    }
}
class MainClass extends RunTimePolymo{
    public void getData(){
        JOptionPane p = new JOptionPane();
        String Fn = p.showInputDialog("Enter First Name:");
        for(int i = 1; i<= 10; i++){
            System.out.println(Fn+ "Knows Java Programming!!!");
            if(i == 6){
                break;
            }
        }
    }
}
