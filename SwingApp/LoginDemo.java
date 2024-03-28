// package SwingApp;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class LoginDemo extends JFrame implements ActionListener{
    JLabel L1,L2,L3,L4;
    JTextField T;
    JPasswordField p ;
    JButton B1,B2,B3;
    JFrame F1,F2;

    public LoginDemo(){
        F1 = new JFrame("::Login Form::");
        F2 = new JFrame("Welcome Message");
        L1 = new JLabel("Username: ");
        L2 = new JLabel("Password: ");
        L3 = new JLabel();
        T = new JTextField(15);
        p = new JPasswordField(15);
        B1 = new JButton("Login");
        B2 = new JButton("Reset");
        B3 = new JButton("Close");
        L4 = new JLabel();

        L1.setBounds(75, 15, 175, 25);
        L2.setBounds(75, 50, 175, 25);
        T.setBounds(205, 15, 150, 25);
        p.setBounds(205, 50, 150, 25);
        B1.setBounds(75, 100, 100, 25);
        B2.setBounds(250, 100, 100, 25);
        L3.setBounds(100, 150, 100, 25);

        F1.add(L1); F1.add(T); F1.add(L2);
        F1.add(p); F1.add(B1); F1.add(B2);
        F1.add(L3);
        F1.setSize(600,400);
        F1.setVisible(true);
        F1.setLayout(null);
        F1.setResizable(false);
        F2.add(L4);
        F2.add(B3);
        
        F2.setLayout(new FlowLayout());
        F2.setSize(400,200);
        F2.setVisible(false);
        B1.addActionListener(this);
        B2.addActionListener(this);
        B3.addActionListener(this);

    }
    public void actionPerformed(ActionEvent ev){
        if(ev.getSource() == B1){
            String user = T.getText();
            String password = T.getText();
            if(user.equals("Michel") && (password.equals("1956"))){
                L4.setText("Welcome "+ user);
                F2.setVisible(true);
                F1.setVisible(false);
            }else{
                L3.setText("Wrong Username or password!");
            }
        }else if(ev.getActionCommand().equals("Reset")){
            T.setText("");
            p.setText("");
            L3.setText("");
        }else{
            System.exit(0);
        }
    }

    public static void main(String[] args){
        LoginDemo demo = new LoginDemo();
    }
}
