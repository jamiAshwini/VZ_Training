import java.util.*;
class Superclass{
void method1(){
	System.out.println("Super class method 1 is executing");
	}
void method2(){
	System.out.println("Super class method 2 is executing");
	}
}
class Subclass extends Superclass{
void method3(){
	System.out.println("Sub class method 3 is executing");
	}
}
public class InheritenceEx{
	public static void main(String args[]){
		Subclass obj=new Subclass();
		obj.method1();
		obj.method2();
		obj.method3();
	}
}