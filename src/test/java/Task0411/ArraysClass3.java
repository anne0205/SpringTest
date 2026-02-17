package Task0411;

import java.util.Arrays;

public class ArraysClass3 {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int intArrays[] = {45,6,34,5,6};
		
		Arrays.sort(intArrays);
		 
		 for (int Arry : intArrays)
		 { 
			 System.out.println("sort of the numbers: " + Arry);
			  
			 }
		
		//Find the largest element in the array
		 
		 int LargestElement[] = {120,45,90,5,0,350};
		 
		 for(int i=0;i<LargestElement.length; i++) {
			 
			 System.out.println("Length of the largest array: " + LargestElement[i]);
			 
		 }
		 
		 Arrays.sort(LargestElement);
		 
		 for(int i=0;i>LargestElement.length; i++) {
			 
			 System.out.println("Length of the sort largest array: " + LargestElement[-1]);
			 
		 }
		 
	}

	

}
