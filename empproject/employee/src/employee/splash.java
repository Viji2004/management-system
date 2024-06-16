package employee;
import com.employee1.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class splash implements ActionListener {
	JFrame frame=new JFrame();
	splash(){
		JLabel heading=new JLabel("EMPLOYEE MANAGEMENT SYSTEM");
		heading.setBounds(40,0,500,200);
		heading.setFont(new Font("serif",Font.PLAIN,29));
		heading.setForeground(Color.BLACK);
		
		
		JButton click=new JButton("CLICK HERE TO CONTINUE");
        click.setBounds(190, 150, 200, 50);
		click.addActionListener(this);
        
		
		frame.setLayout(null);
		frame.setSize(600,400);
		frame.setLocation(400,50);
		frame.setResizable(false);
		frame.getContentPane().setBackground(Color.orange);
		frame.add(heading);
		frame.add(click);
		frame.setVisible(true);
		
	}
	public void actionPerformed(ActionEvent ae ) {
		
		frame.setVisible(false);
		new login();
		
	}
public static void main(String args[]) {
	
	new splash();
	
}
}
