package if_else5;
import java.util.Scanner;

public class CharSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the first character");
		char ch1=sc.next().charAt(0);

		System.out.println("enter the second character");
		char ch2=sc.next().charAt(0);

		if (ch1>ch2)
		System.out.println(ch2+" , "+ch1);

		else
		System.out.println(ch1+" , "+ch2);
	}

}
