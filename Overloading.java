//it performs polyphormism
import java.util.*;
class Test{
	void shape(int i){
		System.out.println("Triangle:"+i);
	}
	void shape(float j){
		System.out.println("Rectangle:"+j);
	}
	void shape(long k){
		System.out.println("Circle:"+k);
	}
}
public class Overloading{
	public static void main(String[] args){
	Test t=new Test();
	t.shape(10);
	t.shape(348.23f);
	t.shape(233478L);
	}
}	