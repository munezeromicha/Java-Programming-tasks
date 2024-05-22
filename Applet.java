//package JDBCDemo;
import java.sql.*;
public class JDBCDemo{
public static void main(String args[]){
String driver="com.mysql.jdbc.Driver";
String url="jdbc:mysql://localhost:3306/CS2";
String username="root";
String pass="12345";
try{
Class.forName(driver);
Connection con=DriverManager.getConnection(url,username,pass);
Statement st=con.createStatement();
String query="create table users(id int not null primary key auto_increment,name text,username text,password varchar(15),email text)";
st.executeQuery(query);
String insert="insert into users(name,username,password,email) values('Peter','Peter01','P2024','peter@ur.ac.rw')";
st.executeUpdate(insert);
ResultSet rs=st.executeQuery("select * from users");
while(rs.next()){
System.out.println(rs.getString("name")+" "+rs.getString("email"));
}
con.close();
}
catch(Exception e){
e.printStackTrace();
}
}
}

//---------------------------------------------------------------------------------
package Applet;

import java.awt.Color;
import java.awt.Graphics;

public class Applet extends Applet {

    @Override
    public void paint(Graphics g) {
        // Set the background color of the applet
        setBackground(Color.GRAY);

        // Draw a blue rectangle
        g.setColor(Color.BLUE);
        g.fillRect(50, 50, 200, 100);

        // Draw a white oval inside the blue rectangle
        g.setColor(Color.WHITE);
        g.fillOval(75, 75, 150, 50);

        // Draw the text "Java Exam" in green inside the oval
        g.setColor(Color.GREEN);
        g.drawString("Java Exam", 130, 105);
    }
}
//------------------------------------------------------------------------------------

package CheckBox;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class CheckBox {
	public static void main(String[] args) {
		JFrame JF = new JFrame("CheckBox");
		JCheckBox ChOne = new JCheckBox("Pizza");
		JCheckBox ChTwo = new JCheckBox("Burger");
		JCheckBox ChThree = new JCheckBox("Banana");
		JButton JB = new JButton("Pay");
		
		ChOne.setBounds(100,100,200,50);
		ChTwo.setBounds(100,150,200,50);
		ChThree.setBounds(100,200,200,50);
		JB.setBounds(90,250,100,30);
		
		JF.add(JB);
		JF.add(ChOne);
		JF.add(ChTwo);
		JF.add(ChThree);
		
		JF.setLayout(null);
		JF.setVisible(true);
		JF.setSize(500,500);
		
		JB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int amount = 0;
				String message = null;
				
			if(ChOne.isSelected()) {
				amount += 150;
				message = "Pizza Selected: " + 150 + "\n";
			if(ChTwo.isSelected()) {
				amount += 200;
				message += "Burger selected: " + 250 + "\n";
			if(ChThree.isSelected()) {
				amount += 50;
				message += "Banana selected: " + 50 + "\n";
			}
			}
			
			}else {
				message += "nothing selected\n";
			}
			message +="--------------------------\n";
			int Total = amount;
			JOptionPane.showMessageDialog(ChOne,message+ "Total: " + Total);
			}
		});
		
	}

}
//--------------------------------------------------------------------------------------------

package ComboBox;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ComboBox {

	public static void main(String[] args) {
		JFrame JF = new JFrame();
		String Country[] = {"Rwanda", "Tanzania", "Togo", "Canada", "China", "Sudan"};
		JComboBox CM = new JComboBox(Country);
		JLabel LB = new JLabel();
		JButton JB = new JButton("Select");
		
		CM.setBounds(100,100,200,50);
		LB.setBounds(100,200,500,50);
		JB.setBounds(100,270, 200,30);
		
		JF.add(JB);
		JF.add(LB);
		JF.add(CM);
		
		JF.setLayout(null);
		JF.setSize(500,500);
		JF.setVisible(true);
		
		JB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String select = "My Favorite Country is " + CM.getItemAt(CM.getSelectedIndex());
				LB.setText(select);
			}
		});
		
	}

}
//------------------------------------------------------------------------------------------------
