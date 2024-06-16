package com.employee3;
import com.employee7.*;
import com.employee6.*;
import com.employee4.*;
import com.employee5.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.sql.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import com.employee1.login;

public class home implements ActionListener {
	JFrame frame=new JFrame();
	JButton click1,click2,click3,click4;
public home(){
	JLabel heading=new JLabel("EMPLOYEE MANAGEMENT SYSTEM");
	heading.setBounds(40,0,500,200);
	heading.setFont(new Font("serif",Font.PLAIN,29));
	heading.setForeground(Color.BLACK);
	
	//for adding employee
	 click1=new JButton("ADD EMPLOYEE");
    click1.setBounds(190, 150, 200, 50);
    click1.addActionListener(this);
    
    //for viewing employee
     click2=new JButton("VIEW EMPLOYEE");
    click2.setBounds(190, 230, 200, 50);
    click2.addActionListener(this);
    
    //for updating employee
    click3=new JButton("UPDATE EMPLOYEE");
    click3.setBounds(190, 310, 200, 50);
    click3.addActionListener(this);
    
    //for deleting employee
    click4=new JButton("REMOVE EMPLOYEE");
    click4.setBounds(190, 390, 200, 50);
    click4.addActionListener(this);
	
	frame.setLayout(null);
	frame.setSize(600,600);
	frame.setLocation(400,50);
	frame.getContentPane().setBackground(Color.MAGENTA);
	frame.add(heading);
	frame.add(click1);
	frame.add(click2);
	frame.add(click3);
	frame.add(click4);
	frame.setVisible(true);
}
public void actionPerformed(ActionEvent ae ) {
	if(ae.getSource()==click1) {
		frame.setVisible(false);
		//employee4
		new addemp();
	}
	else if(ae.getSource()==click2) {
		frame.setVisible(false);
		//employee5
		new viewemp();
	}
	else if(ae.getSource()==click3) {
		frame.setVisible(false);
		//employee6
		new viewemp();
	}
	else if(ae.getSource()==click4) {
		frame.setVisible(false);
		new removeemp();
	}
	
	
}
public static void main(String args[]) {
	new home();
}
}
