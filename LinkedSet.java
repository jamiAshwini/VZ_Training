package Collections;
import java.util.*;
public class LinkedSet {
	public static void main(String args[]) {
		LinkedHashSet hs=new LinkedHashSet();
		hs.add(123.32);
		hs.add(230.43);
		hs.add("Hey");
		hs.add(32.2);
		hs.add(123.32);
		System.out.println(hs);
	}
}
