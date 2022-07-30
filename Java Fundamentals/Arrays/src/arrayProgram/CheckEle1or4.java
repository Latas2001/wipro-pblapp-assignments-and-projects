package arrayProgram;
import java.util.Scanner;

public class CheckEle1or4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num, i, k=0;
		System.out.println("Enter the Size of the Array");
	    num = sc.nextInt();
	    int a[] = new int[num];
	    System.out.println("Enter the elements in the Array");
	    for(i=0; i<num; i++) {
	    	a[i] = sc.nextInt();
	    }
	    System.out.println ("The array elements are");
	    for ( i=0;i<a.length;i++){
	    	System.out.println ( a[ i ] + " " ) ;
	    }
	 // checking the elements

	    for ( i=0;i<num;i++){
	    	if ( a [ i ] == 1 || a [ i ] == 4 )
	    		k++;
	    	}
	    if ( k == num )
	    	System.out.println (" True ");

	    else
	    	System.out.println (" False ");


	}

}
