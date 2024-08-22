package Collections;
import java.util.Arrays;
public class ParallelSorting_Ex {
	public static void main(String[] args) {
		int a[]= {44,22,52,12};
		System.out.println("Accepted elements of an array");
		for(int i:a) {
			System.out.println(i);
		}
		Arrays.parallelSort(a);
		System.out.println("Sorted elements of an array");
		for(int i:a) {
			System.out.println(i);
		}
	}
}
