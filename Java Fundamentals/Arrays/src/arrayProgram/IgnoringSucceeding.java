package arrayProgram;
import java.util.Scanner;

public class IgnoringSucceeding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		int n, sum=0,i;
		    boolean add = true;
		    Scanner sc =  new Scanner(System.in);
			System.out.println("Enter the number of element to be insert in Array");
			n = sc.nextInt();
		    int a[] = new int[n];
		    System.out.println("Enter all the elements:- ");
			for( i=0; i<n; i++) {
				a[i] = sc.nextInt();
			}
		    for(i=0; i<a.length;i++)
		    {

		        if(a[i] != 6 && add==true)
		            sum = sum+a[i];
		        else if(a[i] == 6){
		            if((i+1) == a.length)
		                sum = sum+a[i];
		            else
		                add = false;
		        }
		        else if(a[i] == 7)
		            add = true;
		    }
		    System.out.println(sum);
		    

	}

}
