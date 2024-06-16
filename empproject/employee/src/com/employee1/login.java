package com.employee1;
import com.employee2.*;

import com.employee3.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.*;

public class login implements ActionListener {
 JTextField field1,field2;
 JFrame frame=new JFrame();
	public login(){
	JLabel mainheading=new JLabel("USER LOGIN");
	mainheading.setBounds(0,0,200,70);
	mainheading.setFont(new Font("serif",Font.PLAIN,30));
	mainheading.setForeground(Color.BLACK);
	
	//for username
	JLabel heading1=new JLabel("USERNAME:");
	heading1.setBounds(10,70,200,70);
	heading1.setFont(new Font("serif",Font.PLAIN,20));
	heading1.setForeground(Color.BLACK);
    field1=new JTextField();
	field1.setBounds(130,90,200,30);
	field1.setBackground(Color.white);
	field1.setForeground(Color.black);
	
	
	//for password
	JLabel heading2=new JLabel("PASSWORD:");
	heading2.setBounds(10,150,200,50);
	heading2.setFont(new Font("serif",Font.PLAIN,20));
	heading2.setForeground(Color.BLACK);
	field2=new JTextField();
	field2.setBounds(130,160,200,30);
	field2.setBackground(Color.white);
	field2.setForeground(Color.black);
	
	//for login button
	JButton click=new JButton("LOGIN");
    click.setBounds(130, 250, 120, 40);
    click.addActionListener(this);
	
	
	frame.setLayout(null);
	frame.setSize(400,400);
	frame.setLocation(600,70);
	frame.setResizable(false);
	frame.getContentPane().setBackground(Color.pink);
	frame.add(mainheading);
	frame.add(heading1);
	frame.add(field1);
	frame.add(heading2);
	frame.add(field2);
	frame.add(click);
	frame.setVisible(true);
	
}
public void actionPerformed(ActionEvent ae) {
	try {
		String username=field1.getText();
		String password=field2.getText();
		
		connection co=new connection();
		String query="select * from login2 where user= '"+username+"'and pass='"+password+"'";
	   ResultSet rs=co.st.executeQuery(query);
	if(rs.next()) {
		frame.setVisible(false);
		new home();
		
	}
	else {
		JOptionPane.showMessageDialog(null, "INVALID USER");
		frame.setVisible(false);
	}
	}
	catch(Exception e) {
		e.printStackTrace();
	}
}
	public static void main(String[] args) {
		new login();

	}

}
