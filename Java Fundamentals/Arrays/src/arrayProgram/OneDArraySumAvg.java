package arrayProgram;
import java.util.Scanner;

public class OneDArraySumAvg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, sum=0;
		float average;
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter the number of element to be insert in Array");
		n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("Enter all the elements:- ");
		for(int i=0; i<n; i++) {
			a[i] = sc.nextInt();
			sum = sum + a[i];
		}
		System.out.println("Sum of the Elements is :-  "+ sum);
		average = (float)sum/n;
		System.out.println("Average of the array elements is :- " + average);

	}

}
