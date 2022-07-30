package if_else2;

import java.util.Scanner;

public class LastNumCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner num = new Scanner(System.in);
		System.out.println("Enter The First Number :- ");
		int num1 = num.nextInt();
		System.out.println("Enter The Second Number :- ");
		int num2 = num.nextInt();
		if (num1%10 == num2%10) {
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}

	}

}
