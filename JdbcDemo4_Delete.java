package Collections;

import java.sql.*;
class JdbcDemo4_Delete
	{
	public static void main(String args[])throws Exception
	{
	//Loading Driver
	Class.forName("com.mysql.jdbc.Driver");

	//Providing Connection 
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb1","root","P@ssw0rd");

	//Using Statement Interface
	Statement st=con.createStatement();

	//processing query using statement method
	st.execute("delete from test where id=123");
	System.out.println("Record Deleted");

	//closing objects
	st.close();
	con.close();
	}
	
}
