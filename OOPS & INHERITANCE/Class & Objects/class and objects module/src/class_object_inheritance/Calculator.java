package class_object_inheritance;

public class Calculator {
	static double powerInt(int num1 ,  int num2) {
			return Math.pow(num1, num2);
		}
		static double powerDouble(double num1,  int num2) {
			return Math.pow(num1, num2);
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Calculator.powerInt(2, 3));
		System.out.println(Calculator.powerDouble(2.5, 3));


	}

}
