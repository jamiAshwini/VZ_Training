import java.util.*;
public class Digital_Clock{
	public static void main(String args[]) throws Exception{
		int h,m,s;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of hours:");
		h=sc.nextInt();
		System.out.println("Enter number of minutes:");
		m=sc.nextInt();
		System.out.println("Enter number of seconds:");
		s=sc.nextInt();
		for(h=h;h<24;h++){
			for(m=m;m<60;m++){
				for(s=s;s<60;s++){
					System.out.print(+h+":"+m+":"+s+"\r");
					Thread.sleep(1000);
				}s=0;
			}m=0;
		}h=0;
	}
}
		 
		