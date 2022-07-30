package if_else;
import java.util.Scanner;


public class CheckNums {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner num = new Scanner(System.in);
		int n = num.nextInt();
		if(n > 0) {
			System.out.println(n + " Num is Positive");
		}
		else if(n < 0) {
			System.out.println(n + " Num is negative");
		}
		else {
			System.out.println(n + " Num is zero");
		}

	}

}
