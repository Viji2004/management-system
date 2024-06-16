package com.employee4;
import com.employee3.*;
import com.employee2.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.*;
import javax.sql.*;
import javax.swing.*;
public class addemp implements ActionListener{
	JFrame frame=new JFrame();
	JTextField f1,f2,f3,f4,f5,f7,f9,f6,f0,f8;
	Random ran=new Random();
	int number=ran.nextInt(999999);
	JButton click1,click2;
	JLabel h12;
public addemp(){
	//for heading
	JLabel heading=new JLabel("ADD EMPLOYEE");
	heading.setBounds(290,0,500,200);
	heading.setFont(new Font("serif",Font.PLAIN,25));
	heading.setForeground(Color.BLACK);
	
	
	//for emp name
	JLabel h1=new JLabel("Name:");
	h1.setBounds(10,100,200,70);
	h1.setFont(new Font("serif",Font.PLAIN,15));
	h1.setForeground(Color.BLACK);
    f1=new JTextField();
	f1.setBounds(95,125,200,20);
	f1.setBackground(Color.white);
	f1.setForeground(Color.black);
	
	//fathers name
	JLabel h2=new JLabel("Father's name:");
	h2.setBounds(350,100,200,70);
	h2.setFont(new Font("serif",Font.PLAIN,15));
	h2.setForeground(Color.BLACK);
    f2=new JTextField();
	f2.setBounds(450,125,200,20);
	f2.setBackground(Color.white);
	f2.setForeground(Color.black);
	
	//for date of birth
	JLabel h3=new JLabel("Date of Birth:");
	h3.setBounds(10,150,200,70);
	h3.setFont(new Font("serif",Font.PLAIN,15));
	h3.setForeground(Color.BLACK);
    f3=new JTextField();
	f3.setBounds(95,175,200,20);
	f3.setBackground(Color.white);
	f3.setForeground(Color.black);
	
	
	//salary
	JLabel h4=new JLabel("Salary:");
    h4.setBounds(350,150,200,70);
	h4.setFont(new Font("serif",Font.PLAIN,15));
	h4.setForeground(Color.BLACK);
    f4=new JTextField();
    f4.setBounds(450,175,200,20);
	f4.setBackground(Color.white);
	f4.setForeground(Color.black);
	
	//address
	JLabel h5=new JLabel("Address:");
	h5.setBounds(10,200,200,70);
	h5.setFont(new Font("serif",Font.PLAIN,15));
	h5.setForeground(Color.BLACK);
    f5=new JTextField();
	f5.setBounds(95,230,200,20);
	f5.setBackground(Color.white);
	f5.setForeground(Color.black);
	
	//for phone
	JLabel h6=new JLabel("Salary:");
    h6.setBounds(350,200,200,70);
	h6.setFont(new Font("serif",Font.PLAIN,15));
	h6.setForeground(Color.BLACK);
    f6=new JTextField();
    f6.setBounds(450,230,200,20);
	f6.setBackground(Color.white);
	f6.setForeground(Color.black);
	
	//for email
	JLabel h7=new JLabel("Email:");
	h7.setBounds(10,250,200,70);
	h7.setFont(new Font("serif",Font.PLAIN,15));
	h7.setForeground(Color.BLACK);
    f7=new JTextField();
	f7.setBounds(95,280,200,20);
	f7.setBackground(Color.white);
	f7.setForeground(Color.black);
	
	//for education
	JLabel h8=new JLabel("Education:");
    h8.setBounds(350,250,200,70);
	h8.setFont(new Font("serif",Font.PLAIN,15));
	h8.setForeground(Color.BLACK);
    f8=new JTextField();
    f8.setBounds(450,280,200,20);
	f8.setBackground(Color.white);
	f8.setForeground(Color.black);
	
	//designation
	JLabel h9=new JLabel("Designation:");
	h9.setBounds(10,300,200,70);
	h9.setFont(new Font("serif",Font.PLAIN,15));
	h9.setForeground(Color.BLACK);
    f9=new JTextField();
	f9.setBounds(95,330,200,20);
	f9.setBackground(Color.white);
	f9.setForeground(Color.black);
	
	//for random emp id
	JLabel h11=new JLabel("Employee Id:");
	h11.setBounds(10,350,200,70);
	h11.setFont(new Font("serif",Font.PLAIN,15));
	h11.setForeground(Color.BLACK);
    h12=new JLabel(""+number);
	h12.setBounds(95,375,200,20);
	h12.setBackground(Color.white);
	h12.setForeground(Color.black);
	
	//aadhar number
	JLabel h0=new JLabel("Aadhar No:");
    h0.setBounds(350,300,200,70);
	h0.setFont(new Font("serif",Font.PLAIN,15));
	h0.setForeground(Color.BLACK);
    f0=new JTextField();
    f0.setBounds(450,330,200,20);
	f0.setBackground(Color.white);
	f0.setForeground(Color.black);
	
	//adding employee
	click1=new JButton("Add Details");
    click1.setBounds(200, 450, 120, 40);
    click1.addActionListener(this);
    
    //previous home page
    click2=new JButton("Back");
    click2.setBounds(400, 450, 120, 40);
    click2.addActionListener(this);
	
	frame.setLayout(null);
	frame.setSize(800,600);
	frame.setLocation(300,70);
	frame.add(heading);
	frame.add(h1);
	frame.add(f1);
	frame.add(h2);
	frame.add(f2);
	frame.add(h3);
	frame.add(f3);
	frame.add(h4);
	frame.add(f4);
	frame.add(h5);
	frame.add(f5);
	frame.add(h7);
	frame.add(f7);
	frame.add(h9);
	frame.add(f9);
	frame.add(f6);
	frame.add(h6);
	frame.add(h8);
	frame.add(f8);
	frame.add(f0);
	frame.add(h0);
	frame.add(h11);
	frame.add(h12);
	frame.add(click2);
	frame.add(click1);
	frame.setVisible(true);
}
public void actionPerformed(ActionEvent ae) {
	
	if(ae.getSource()== click1) {
	String 	name=f1.getText();
	String  fname=f2.getText();
	String  dob=f3.getText();
	String salary=f4.getText();
	String  address=f5.getText();
	String  phone=f6.getText();
	String  email=f7.getText();
	String  education=f8.getText();
	String  designation=f9.getText();
	String  aadhar=f0.getText();
	String  empid=h12.getText();
	try {
		connection co=new connection();
		String query="insert into addemployee values('"+name+"','"+fname+"','"+dob+"','"+salary+"','"+address+"','"+phone+"','"+email+"','"+education+"','"+designation+"','"+aadhar+"','"+empid+"')";
	   co.st.executeUpdate(query);
	   JOptionPane.showMessageDialog(null, "Your Details added successfully");
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
		new addemp();

	}

}
