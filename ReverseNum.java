import java.util.*;
public class ReverseNum{
	public static void main(String args[]){
		int n,r,res=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a value:");
		n=sc.nextInt();//678
		while(n>0){
			r=n%10;//8 7
			res=res*10+r;//80 
			n=n/10;//67
		}
	System.out.println("Reverse value:"+res);
	}
}