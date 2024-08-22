package Collections;
import java.sql.*;
class JdbcDemo3
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
//st.execute("insert into test values(123)");
//System.out.println("Record Inserted");

//step 5:retrieving data using ResultSet
ResultSet rs=st.executeQuery("select * from test");
while(rs.next())
	{
	System.out.println(rs.getInt(1));
	}

//closing objects
st.close();
con.close();
}
}
