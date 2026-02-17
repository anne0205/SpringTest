package Task0411;

import java.util.Arrays;

public class LearnStr4 {

	public static void main(String[] args) {
		// String is immutable
		String Learn = "Happy Learning";
		String RepStr = Learn.replace('p', '*');
		System.out.println(RepStr);
		
		System.out.println(Learn); // Original value never replaces
		
		
		//String Literals
		
		String Str = "KIA";
		String Str2 = "TATA";
		String Str3 = "KIA";
		
		//String objects
		
		String Str4 = new String ("AUDI");
		String Str5 = new String ("AUDI");
		String Str6 = new String ("SAFARI");
		
		//== compares the reference/ memory location it checks the parameter values
		//EQUALS () is a method
		
		boolean Result = Str5.equals(Str6);
		
		//Literals object 
		
		if(Str5==Str6) {
			System.out.println("They are equal");
		}
		else {
			System.out.println("They are not equal");
		}
		
		//Literal String 
		if(Str==Str3) {
			System.out.println("They are equal");
		}
		else {
			System.out.println("They are not equal");
		}
		
		//Literal comparision
		
		boolean isLiteralContentSame = Str.equals(Str3);
		
		System.out.println("Compared Literal String : " + isLiteralContentSame);
		
		//Using + operator to concat two strings wont throw any error
		
		String NullStr = "";
		String NewNullStr = Str+NullStr;
		System.out.println("+ operator String :" + NewNullStr);
		
		
		

		int intArrays[] = {45,6,34,5,6};
		
		Arrays.sort(intArrays);
		
		
	}

}
