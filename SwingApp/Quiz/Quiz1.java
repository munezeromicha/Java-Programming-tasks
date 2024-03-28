// package Quiz;

import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.*;
public class Quiz1 extends JFrame {
    String name;
    JLabel L1,L2;
    JFrame f;

    public Quiz1(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name: ");
        name = sc.nextLine();
        L1=new JLabel();
        L2 = new JLabel("---------------------------");
        f = new JFrame("Quiz");
        f.add(L1); f.add(L2);
        f.setLayout(new GridLayout(2,1));
        f.setSize(400,300);
        if(name.equals("Michael")){
            L1.setText("Welcome " + name);
            f.setVisible(true);
        }else{
            for(int i = 1; i<=10; i++){
                System.out.println(name + "likes java programming");
                if(i%2 == 0){
                    System.out.println("*******************************");
                }
            }
        }
    }
    public static void main(String[] args){
        Quiz1 test = new Quiz1();
    }
}

