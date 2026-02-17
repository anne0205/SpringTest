package Task0407;

public class LearnArry {
	
	public void Literals() {
		
		String str = " Hello World";
		System.out.println("Printing the string: " + str);
		
	}
	
	public void object() {
		String str = new String();
		str = "New Samsung TV OLED";
		System.out.println("Printing object value :" + str);
	}
	
	public void ArryString() {
		
		String[] arrStr = new String[4];
		
		arrStr[0] = "Anita";
		arrStr[1] = "Rohan";
		arrStr[2] = "Lohi";
		arrStr[3] = "HalfMoon";
		
		System.out.println("Printing values from arry string: " + arrStr[2]);
		
		
	}
	
	public void Arryprop() {
		
		String str[] = {"Sandy","Ricky","Ruby"};
		
	}

	public static void main(String[] args) {
		
		LearnArry obj = new LearnArry();
		
		obj.Literals();
		obj.ArryString();
		obj.object();
		
		String test = "Learning Java and Selenium";
		String prt = test.substring(4);
		
	//	System.out.println("Printing the lenght of the string: " + prt);
		
		// obj.Arryprop();// need to recheck
		 
		String[] names = {"Bunny","Ruby","Ricky"};
		
		int[] intArry = {2,4,6,8,10,12};
		int arrLen = intArry.length;//just printing the lenght of the array
		
	//	System.out.println("Print of lenght of the array of intArry: " + arrLen);
		
		
	//	for(int i=0; i<=intArry.length; i++) { This throws ArrayIndexOutOfBoundsException
		
		for(int i=0; i< intArry.length; i++) { 
			
		//	System.out.println("Print of the array by looping intArry:[ "+i+ "]" + intArry[i]);
			
		}
		
		//printing value in forward and reverse
		for(int i=names.length-1;i>=0; i--) { 
			
			System.out.println("Print of the array by looping intArry:[ "+i+ "]" + names[i]);
		}	
		//foreach
		
		//Syntax - for (datatype newVariable : <source/VariableName>)
			
		
		for(int eachVal   : intArry) {
			
		//	System.out.println(eachVal);
			
		}
		for(String eachVal   : names) {
			
			System.out.println(eachVal);
		}	
		
	}

}


