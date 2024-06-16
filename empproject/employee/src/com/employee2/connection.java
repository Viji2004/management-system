package com.employee2;
import java.sql.*;

public class connection {
	public Statement st;
	Connection c;
	//public static void main(String[] args) {
		public  connection() {
try {
	Class.forName("com.mysql.cj.jdbc.Driver");
    c=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","1234");
     st=c.createStatement();
}
catch(Exception e) {
	e.printStackTrace();
}
	}

}
