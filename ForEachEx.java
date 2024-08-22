import java.util.*;
public class ForEachEx{
public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number of values:");
	int n=sc.nextInt();
	int[] a=new int[n];
	System.out.println("Enter array values:");
	for(int i=0;i<n;i++){
		a[i]=sc.nextInt();
	}
	System.out.println("Entered values are:");
	for(int i:a)
		System.out.println(+i);
	}
}