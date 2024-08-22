package Collections;

import java.util.*;

public class Stact_Ex {
	public static void main(String args[]) {
		Stack s=new Stack();
		s.push(32);
		s.push(34);
		s.push(234);
		System.out.println(s);
		s.pop();
		System.out.println(s);
		System.out.println(s.peek());
	}
}
