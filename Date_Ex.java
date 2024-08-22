package Collections;
import java.util.*;
public class Date_Ex {
	public static void main(String args[]) {
		Date d=new Date();
		System.out.println(d);
		int j;
		System.out.println(d.getSeconds());
		for(int i=0;i<20000;i++) {
		j=i*i;
		}
		System.out.println(d);
		System.out.println(d.getSeconds());
	}
}
