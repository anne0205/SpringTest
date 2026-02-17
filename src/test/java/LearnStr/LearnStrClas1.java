package LearnStr;

public class LearnStrClas1 {
	
	//string literals()
	
	public void StrLiteral() {
		
		String str;
		str = "TestString";
		System.out.println("Printing string: "+ str);
		
	}	
	
	//string objec()
	public void StrObj() {
		
		String str2 = new String();
		
		  str2 = "TestStringobj";
		  
		System.out.println("Print object: " + str2);
		
	}
	
	public void Stringarray() {
		
		String[] names = new String[3];
		String intarry[] = new String[3];
		
		names [0] = "Kevin";
		names [1] = "Ricky";
		names [2] = "Sandy";
		
//	
////		for(int i=0; i<intarry.length; i--)
////		{
////			 System.out.println("Print numbers[" +i+ "]: " + intarry[i] );
////		}
//		for(String eachval : names) {
//			System.out.println("Prints names in array :" + eachval);
//		}
//		
		System.out.println("Prints names from Stringarray :[ " + "]" + names[1]);
		
	}

	public static void main(String[] args) {
			
		//classname objectname = new constructor();
		
		LearnStrClas1 obj = new LearnStrClas1();
		
		 int intarry[] = {02,06,10,12};
		
		obj.StrLiteral();
		obj.StrObj();
		obj.Stringarray();
		
		String test = "Testing String";
		int name = test.length();
		
		System.out.println("lenght of the string from main class: " + name);
		
		//Retuns the character of a specified string
		
		char b = test.charAt(5);
		
		System.out.println("Retun Specific charater from main class string :" + b);
		
		//indexOf
		//Given any character get the position of that particular character
		//Gives the position of the first occurrance
		
		int c = test.indexOf('i');
		
		
		System.out.println("position of the character from main class string: " + c);
		
		//it will not throw any error rather give a negative value as -1
		
		int d = test.indexOf('M');
		System.out.println("position of the character from: " + d);
		
		
		//checking last occurance of that given string of specific character
		int lastchar = test.lastIndexOf("i");
		System.out.println("last occurance of character: " + lastchar);
		
		//toCharArry - It converts the string to a character array
		// Ex: apple = a,p,p,l,e
		
	//	char[] chararry = test.toCharArray();
	
		//	for(int i =0; i<chararry.length; i++) {			
		//	System.out.println("namestring of test["+i+"] " + chararry[i]);
       //System.out.println("Converts the string to char :" + chararry)
		
		        //split()
				//test = Testing Spring
				//delimiter
				//Retuns the arrary of strings		
	     		//	System.out.println("Printing the string array: " len);
		
		 for(int i=0; i<intarry.length; i++) {
	    	  System.out.println("Print numbers[" +i+ "]: " + intarry[i] );
	      }
		//Split testing with String
		String[] spl = test.split(" ");
		int len = spl.length;
		
		for(int i =0; i<len; i++) {
				System.out.println("namestring of test["+i+"] " + spl[i]);
				
				 //split
				 
				  String[] str= test.split(" ");
				  
				  int lenStr = str.length;
				  
				  for(int j=0; j<lenStr; j++) {
					  
					  System.out.println("Split the line of the string:[ "+"] :" + str[j]);

					  
				  }
				  //using delimiter of the string
				  String testStr2 = "Lenght/of/thestr/ing";
				  String[] str2= testStr2.split("/");
				  
				  int lenStr2 = str2.length;
				  
				  for(int k=0; k<lenStr2; k++) {
					  
					  System.out.println("Split the line of the string:[ "+"] :" + str2[k]);

					  
				  }

		}
		
	}

}
