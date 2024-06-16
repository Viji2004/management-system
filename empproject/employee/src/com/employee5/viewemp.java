package com.employee5;
import com.employee6.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.awt.*;
import net.proteanit.sql.*;
import javax.swing.*;

import com.employee1.login;
import com.employee2.connection;
import com.employee3.home;
public class viewemp implements ActionListener {
	JFrame frame=new JFrame();
	JTable table1;
	JButton click1,click2,click3;
  Choice search1;
public viewemp(){
	
	//for heading
	JLabel heading=new JLabel("VIEW EMPLOYEE");
	heading.setBounds(330,0,500,200);
	heading.setFont(new Font("serif",Font.PLAIN,25));
	heading.setForeground(Color.BLACK);
	
	//search
    JLabel search=new JLabel("Search empid:");
	search.setBounds(150,200,100,20);
	frame.add(search);
	search1=new Choice();
	search1.setBounds(250,200,100,20);
	frame.add(search1);
	
	try {
		connection co=new connection();
		String query="select * from addemployee";
	  ResultSet rs=co.st.executeQuery(query);
	  //table1.setModel(DbUtils.resultSetToTableModel(rs));
	  
	  
	  while(rs.next()) {
		  search1.add(rs.getString("empid"));
	  }
	  }
	catch(Exception e) {
		e.printStackTrace();
	}
	
	//for creating table for viewing employee
	table1=new JTable();
	try {
		connection co=new connection();
		String query="select * from addemployee";
	  ResultSet rs=co.st.executeQuery(query);
	  table1.setModel(DbUtils.resultSetToTableModel(rs));
	  }
	catch(Exception e) {
		e.printStackTrace();
	}
	JScrollPane scroll=new JScrollPane(table1);
	scroll.setBounds(0,300,900,600);
	
	
	
	//for going back button
	click1=new JButton("BACK");
    click1.setBounds(250, 250, 100, 20);
	click1.addActionListener(this);
	
	//for updating
	click2=new JButton("UPDATE");
    click2.setBounds(370, 250, 100, 20);
	click2.addActionListener(this);

	//for searching
	click3=new JButton("SEARCH");
    click3.setBounds(500, 250, 100, 20);
	click3.addActionListener(this);
	frame.add(click3);
	
	
	frame.setLayout(null);
	frame.setSize(900,700);
	frame.setLocation(300,70);
	frame.add(scroll);
	frame.add(heading);
	frame.add(click1);
	frame.add(click2);
	frame.setVisible(true);
}

public void actionPerformed(ActionEvent ae ) {
	if(ae.getSource()==click1) {
	frame.setVisible(false);
	new home();}
	
	if(ae.getSource()==click2) {
		frame.setVisible(false);
		new updateemp(search1.getSelectedItem());}
	else if(ae.getSource()==click3) {
		
		String query1="select * from addemployee where empid= '"+search1.getSelectedItem()+"'";
	try {
		connection co=new connection();
	   ResultSet rs=co.st.executeQuery(query1);
	  table1.setModel(DbUtils.resultSetToTableModel(rs));
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	}	
	
}
	public static void main(String[] args) {
	new	viewemp();

	}

}
