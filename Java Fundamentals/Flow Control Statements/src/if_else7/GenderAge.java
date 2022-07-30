package if_else7;
import java.util.Scanner;

public class GenderAge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =  new Scanner(System.in);
		String gender = args[0];
		int age = Integer.parseInt(args[1]);
		if(gender.equalsIgnoreCase("Female")) {
			if(age>=18 && age<=58) {
				System.out.println("Interest = 8.2%");
			}
			else if(age>=59 && age<=100) {
				System.out.println("Interest = 9.2%");
			}
			else {
				System.out.println("No Result");
			}
		}
		else {
			 if(age>=1 && age<=58)
			      System.out.println("Interest=8.4%");

		       else if(age>58 && age<=100)
			       System.out.println("Interest=10.5%");

			   else 
				   System.out.println("No result");
		}
		

	}

}
