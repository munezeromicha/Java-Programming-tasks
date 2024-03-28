/*
 * Three classes are used:
 * 1.JMenuBar used to create a menu bar (place holder ) where menus will be placed 
 * 2.JMenu used to create  menus
 * 3.JMenuItem used to create options in the menus
----------------------------------------------------------------
Example: A program that displays a window with 2 menus: file and Edit 
File menu has 2 options: calculator and Close 

 */
// package SwingApp;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class MenuDemo extends JFrame implements ActionListener{
    JMenuBar bar;
    JMenu File, Edit;
    JMenuItem FItem1, FItem2, EItem1, EItem2;
    JLabel L1,L2,L3,L4;
    JTextField T1,T2;
    JButton B1,B2;
    JFrame F1,F2;
    public MenuDemo() {
        F1 = new JFrame("Java Menus");
        F2 = new JFrame();
        File = new JMenu("File");
        Edit = new JMenu("Edit");
        L1 = new JLabel("Number 1: ");
        L2 = new JLabel("Number 2: ");
        T1 = new JTextField(15);
        T2 = new JTextField(15);
        L3 = new JLabel("Menu Program");
        L4 = new JLabel();
        B1 = new JButton("Add");
        B2 = new JButton("Reset");
        FItem1 = new JMenuItem("Calculator");
        FItem2 = new JMenuItem("Close");
        EItem2 = new JMenuItem("Copy");
        EItem2 = new JMenuItem("Paste");
        B1.addActionListener(this);
        B2.addActionListener(this);
        FItem1.addActionListener(this);
        FItem2.addActionListener(this);
        EItem1.addActionListener(this);
        EItem2.addActionListener(this);

    Edit.add(EItem1);
    Edit.add(EItem2);
    File.add(FItem1);
    File.add(FItem2);
    bar.add(File); bar.add(Edit);
    F1.add(bar); F1.add(L3);
    F1.setSize(400,200);
    F1.setLayout(new GridLayout(2,1));
    F1.setVisible(true);
    F2.add(L1); F2.add(T1);
    F2.add(L2); F2.add(T2);

    }
}
