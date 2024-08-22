import java.util.*;
public class VotOrNot{
public static void main(String[] args){
	System.out.println("Enter age:");
	int age;
	Scanner sc=new Scanner(System.in);
	age=sc.nextInt();
	if(age>=18)
		System.out.println("Eligible to vote!!");
	else
		System.out.println("Not Eligible to vote!!");
	}
}