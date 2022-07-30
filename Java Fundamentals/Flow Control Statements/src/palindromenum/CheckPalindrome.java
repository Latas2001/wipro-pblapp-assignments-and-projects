package palindromenum;
import java.util.Scanner;

public class CheckPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int remainder, reverse=0, temp;
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter the number to check Palidrome:- ");
		int num = sc.nextInt();
		temp=num;
		while(num>0) {
		remainder = num%10;
		reverse = reverse*10 + remainder;
		num = num/10;
		}
		if (temp==reverse) {
			System.out.println("Hurray! It's a Palindrome Number " +temp);
		}
		else {
			System.out.println("Oops! IT's not a Palindrome Number "+ temp);
		}

	}

}
