package arrayProgram;

public class LargestTwoSmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {5,3,9,10,7,2,11,1};
	    
	    int min1 = arr[0];
	    int min2 = 0;
	    
	    int max1 = arr[0];
	    int max2 = 0;
	    
	    for(int i=1;i<arr.length;i++) {
	        if(arr[i] > max1) {
	            max2 = max1;
	            max1 = arr[i]; 
	        }else if(arr[i] < min1){
	            min2 = min1;
	            min1 = arr[i];
	        }
	    }
	    
	    System.out.println("Max1 = "+max1+" Max2 = "+max2);
	    System.out.println("Min1 = "+min1+" Min2 = "+min2);

	}

}
