public class Static_constructor_methods_Ex {
public static String line="This is my Program";
static 
{
System.out.println("Welcome to Java"); 
//System.exit(0);
}
public void display()
{
System.out.println("begin:");
}
public static void main(String[] args) { 
System.out.println("Program starts here"); 
Static_constructor_methods_Ex object=new Static_constructor_methods_Ex();
object.display();
System.out.println(Static_constructor_methods_Ex.line);
}
}
