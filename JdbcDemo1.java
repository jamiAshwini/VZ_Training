package Collections;

	import java.sql.*;
	class JdbcDemo1
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
	st.execute("create table test1(id int)");
	System.out.println("Table Created!!");

	//closing objects
	st.close();
	con.close();
	}
	}


