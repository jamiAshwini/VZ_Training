import java.util.*;
public class MultiplicationTable{	
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a value:");
		int n=sc.nextInt();
		int k;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=20;j++){
				k=i*j;
				System.out.println(+i+"*"+j+"="+k);
		}
		System.out.println();
	}
}
}