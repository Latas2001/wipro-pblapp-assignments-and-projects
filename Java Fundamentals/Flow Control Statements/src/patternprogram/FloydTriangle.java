package patternprogram;
import java.util.Scanner;

public class FloydTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	      System.out.println("Please enter the number of rows of floyd's triangle you want to print: ");
	      int rows = sc.nextInt();
	      System.out.println("Printing floyd's triangle star pattern in java");
	      for(int a = 0; a <= rows; a++)
	      {
	         for(int b = 0; b <= a; b++)
	         {
	            System.out.print("*");
	         }
	         System.out.println();
	      }
	}

}
