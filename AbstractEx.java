abstract class Abs{
abstract void show();
void display(){
	System.out.println("Complete method in abstract class");
}
}
class Test extends Abs{
void show(){
System.out.println("Abstract class method in test class");
}
}
class AbstractEx{
public static void main(String[] args){
Test t=new Test();
t.show();
t.display();
}
}