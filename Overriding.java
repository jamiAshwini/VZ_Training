class Test2{
	void show(){
		System.out.println("Parent class method is called");
	}
}
class Test extends Test2{
	void show(){
		super.show();
		System.out.println("Child class method is called");
	}
}
class Overriding{
	public static void main(String[] args){
		Test t=new Test();	
		t.show();
		
	}
}