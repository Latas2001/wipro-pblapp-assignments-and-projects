package reverseprogram;
import java.util.Scanner;

public class ReverseNumberPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int digit, reverse=0;
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter the number to be reversed");
		int num = sc.nextInt();
		while(num != 0) {
			digit = num%10;
			reverse = reverse*10 + digit;
			num = num/10;
		}
		System.out.println("Reverse number is :- "+ reverse);

	}

}
