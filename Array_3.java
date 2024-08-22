import java.util.*;
public class Array_3{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array elements for 3*3 array:");
		int n=3;
		int[][] a=new int[3][3];
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				System.out.print("Enter array element for "+i+","+j+" position:");
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("Array elements are:");
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				System.out.print(+a[i][j]+" ");
			}
			System.out.println();
		}
	}
}
	