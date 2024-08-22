package Collections;

import java.sql.*;
class JdbcDemo2_Insert
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
st.execute("insert into test values(123)");
System.out.println("Record Inserted");

//closing objects
st.close();
con.close();
}
}