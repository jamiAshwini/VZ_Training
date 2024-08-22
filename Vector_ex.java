package Collections;
import java.util.*;
public class Vector_ex {
	public static void main(String args[]) {
		Vector v=new Vector(2);
		int n1=v.capacity();
		System.out.println("Capacity of vector:"+n1);
		v.add(211);
		v.add(25);
		v.add(234);
		System.out.println(v);
		int n2=v.capacity();
		System.out.println("Capacity of vector is:"+n2);
		}
}
