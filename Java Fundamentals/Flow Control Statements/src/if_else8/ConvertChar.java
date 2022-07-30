package if_else8;
import java.util.Scanner;

public class ConvertChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char c = sc.next().charAt(0);
        int i;
		
		if(c>='a'&&c<='z') {
		i=(int)c;
		c=(char)(i-32);
		System.out.println(c);
		}
		
		else {
		    i=(int)c;
			c=(char)(i+32);
			System.out.println(c);
		}

	}

}
