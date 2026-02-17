package Task0409;

public class LearnStrclas2 {

	public static void main(String[] args) {
	
		//Write a java program to find the occurrence of the character 'o' in the following string
		
//		String test = "You have no choice other than following me";
//		
//		char[] name = test.toCharArray();	
//		
		//System.out.println("position of the character from: " + d);
		
//		char[] chararry = test.toCharArray();
//		
//		for(int i =0; i<chararry.length; i++) {		
//		//	System.out.println("namestring of test["+i+"] " + chararry[i]);
//			
//			if( chararry[i]=='o') {
//				i++;
//				System.out.println("namestring of test["+i+"] " + i);
//				
//			} else
//			{
//				
//				//System.out.println("namestring of test["+i+"] " + chararry[i]);
//		}
		
		String test = "You have no choice other than following me";
		
		char[] name = test.toCharArray();	
		
		//int d = test.indexOf('o');
		
//		for( int i=0; i<name.length;i++) {
//			
//			System.out.println("Printing chars of the string ["+i+"] :"+  name[i]);
//		}
		
		int j = 0;
		
		for(char test1 : name)
		{
		 if( test1 == 'o')
		 {
				int i = test1+1;
				
				System.out.println("namestring of test:" + test1);		
			    j = j+1; // prints number of o's
			
			}
		
		  }
		System.out.println("Number of O's :" + j);
	}

}
