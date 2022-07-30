package arrayProgram;
import java.util.Scanner;

public class NumberPresence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n , x, flag=-1 , i;
		Scanner sc= new Scanner(System.in);
		System.out.println(" Enter the size of the Array:- ");
		n =  sc.nextInt();
		int a[] = new int[n];
		System.out.println(" Enter the elements in the Array:- ");
		for( i = 0; i<n; i++) {
			a[i] = sc.nextInt();				
			}
		System.out.println("Enter the element to be searched:- ");
		x = sc.nextInt();
		for( i = 0; i<n; i++) {
			if(a[i]==x) {
				flag = 1;
				break;
			}
			else {
				flag = -1;
			}
		}
		if(flag == 1) {
			 System.out.println("Element found at position:"+(i+1));
		}
		else {
			System.out.println("Element not found " + flag);
		}

	}

}
