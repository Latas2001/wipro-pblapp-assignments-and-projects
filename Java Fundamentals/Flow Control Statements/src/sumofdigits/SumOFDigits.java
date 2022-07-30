package sumofdigits;
import java.util.Scanner;

public class SumOFDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		int digit;
		System.out.println("Enter the number:- ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		while(num>0) {
			digit = num%10;
			sum = sum+digit;
			num = num/10;
		}
		System.out.println("Sum of All the digits:- " +sum);

	}

}
