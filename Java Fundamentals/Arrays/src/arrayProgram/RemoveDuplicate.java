package arrayProgram;
import java.util.*;


public class RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	      System.out.println("Enter the size of array: ");
	      int n = sc.nextInt();
	      int arr[] = new int[n];
	      int ar[] = new int[100];
	      Arrays.fill(ar,0);
	      System.out.println("Enter " +n+ " array elements between 0 to 100 ");
	      for(int i=0; i<n; i++) {
	         arr[i] = sc.nextInt();
	     }
	     System.out.println("Array elements after removing duplicates");
	      for(int i=0;i<n;i++){
	        ar[arr[i]]++;
	        if(ar[arr[i]]==1){
	            System.out.println(arr[i]);
	        }
	    }
	}

}
