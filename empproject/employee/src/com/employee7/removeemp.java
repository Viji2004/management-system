package com.employee7;
import com.employee3.*;
import javax.swing.*;

import com.employee2.connection;

import net.proteanit.sql.DbUtils;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.*;
public class removeemp implements ActionListener {
	JFrame frame=new JFrame();
	Choice emp;
	JLabel lblname,lblphone,lblemail;
	JButton click1,click2;
public removeemp(){
	
	JLabel lemp=new JLabel("Employee id");
	lemp.setBounds(50, 50, 100, 20);
	frame.add(lemp);
	
	
	emp=new Choice();
	emp.setBounds(200, 50, 150, 30);
	frame.add(emp);
	
	try {
		connection co=new connection();
		String query="select * from addemployee";
	  ResultSet rs=co.st.executeQuery(query);
	  while(rs.next()) {
		emp.add(rs.getString("empid"));  
	  }
	  }
	catch(Exception e) {
		e.printStackTrace();
	}
	
	JLabel lname=new JLabel("Name");
	lname.setBounds(50, 100, 100, 20);
	frame.add(lname);
	final JLabel lblname=new JLabel();
	lblname.setBounds(200, 100, 100, 20);
	frame.add(lblname);
	
	JLabel lphone=new JLabel("Phone");
	lphone.setBounds(50, 150, 100, 20);
	frame.add(lphone);
	final JLabel lblphone=new JLabel();
	lblphone.setBounds(200, 150, 100, 20);
	frame.add(lblphone);
	
	JLabel lemail=new JLabel("Email");
	lemail.setBounds(50, 200, 100, 20);
	frame.add(lemail);
	final JLabel lblemail=new JLabel();
	lblemail.setBounds(200, 200, 100, 20);
	frame.add(lblemail);
	
	try {
		connection co=new connection();
		String query="select * from addemployee where empid='"+emp.getSelectedItem()+"'";
	  ResultSet rs=co.st.executeQuery(query);
	  while(rs.next()) {
		 lblname.setText(rs.getString("name"));
		 lblphone.setText(rs.getString("phone"));
		 lblemail.setText(rs.getString("email"));
	  }
	  }
	catch(Exception e) {
		e.printStackTrace();
	}
	
	
	emp.addItemListener(new ItemListener(){

		public void itemStateChanged(ItemEvent ie) {

			try {
				connection co=new connection();
				String query="select * from addemployee where empid='"+emp.getSelectedItem()+"'";
			  ResultSet rs=co.st.executeQuery(query);
			  while(rs.next()) {
				 lblname.setText(rs.getString("name"));
				 lblphone.setText(rs.getString("phone"));
				 lblemail.setText(rs.getString("email"));
			  }
			  }
			catch(Exception e) {
				e.printStackTrace();
			}	
			
		}
		
	});
	
	click1=new JButton("Delete");
    click1.setBounds(220, 300, 100, 40);
    click1.addActionListener(this);
    frame.add(click1);
    //previous home page
    click2=new JButton("Back");
    click2.setBounds(350, 300, 120, 40);
    click2.addActionListener(this);
    frame.add(click2);
	
	frame.setLayout(null);
	frame.setSize(1000,400);
	frame.setLocation(300,70);
	frame.setVisible(true);
}
public void actionPerformed(ActionEvent ae ) {
	if(ae.getSource()==click1) {
		try {
			connection co=new connection();
			String query="delete from addemployee where empid='"+emp.getSelectedItem()+"'";
		   co.st.executeUpdate(query);
		   
		   JOptionPane.showMessageDialog(null, "Your Details deleted successfully");
		   frame.setVisible(false);
			new home();
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	else {
		frame.setVisible(false);
		new home();
	}
}
	public static void main(String[] args) {
	new removeemp();

	}

}
