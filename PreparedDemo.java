package Collections;
import java.sql.DriverManager;
import java.util.*;
import java.sql.*;
public class PreparedDemo {
public static void main(String args[]) throws Exception{
	System.out.println("Enter the rno and name:");
	Scanner sc=new Scanner(System.in);
	int id=sc.nextInt();
	String name=sc.next();
	Class.forName("com.mysql.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb1","root","P@ssw0rd");
	String data="insert into test values(?,?)";
	PreparedStatement ps=con.prepareStatement(data);
	ps.setInt(1, id);
	ps.setString(2, name);
	ps.executeUpdate();
	System.out.println("Record Inserted");
	ps.close();
	con.close();
	sc.close();
	}	
}
