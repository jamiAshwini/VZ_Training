interface I1{
void show();
}
class Test implements I1{
public void show(){
System.out.println("show method called");
}
}
class InterfaceEx2{
public static void main(String args[]){
Test t =new Test();
t.show();
}
}