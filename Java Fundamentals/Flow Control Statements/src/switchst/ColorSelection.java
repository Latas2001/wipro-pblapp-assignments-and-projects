package switchst;
import java.util.Scanner;

public class ColorSelection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter your color choice in R , O , B , G , W , Y :- ");
		char choice = sc.next().charAt(0);
		switch(choice) {
		case 'R':
			System.out.println("Red");
			break;
		case 'O':
			System.out.println("Orange");
			break;
		case 'B':
			System.out.println("Blue");
			break;
		case 'G':
			System.out.println("Green");
			break;
		case 'W':
			System.out.println("White");
			break;
		case 'Y':
			System.out.println("Yellow");
			break;
		default:
			System.out.println("Invalid Code");
		}
	}

}
