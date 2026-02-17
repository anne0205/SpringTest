package Task0409;

public class FullReverse {

	public static void main(String[] args) {
			
//		for(int i=0;i<5;i++) 
//		{
//			
//			if(i==2)
//			continue;
//			System.out.println("print value: " + i); //Ans: 0134
//			
//		}
		//Reverse Full String
		
		String revstr = "The automation is a real fun";
		
		String revstr1=" ";
		
		String[] str = revstr.split(" ");
		
		int lenstr = str.length;
		
		int count=0;
		
		String Fullrevstr = " ";
		
		for(int j=0; j<lenstr; j++) 
		
		{
			
			//System.out.println("printing index " + str[j]);
			
			for (count = str[j].length()-1; count >= 0; count--) 
			{			
				
					revstr1 = revstr1 + str[j].charAt(count);	
						
	    	}
			
			Fullrevstr = revstr1 ;
			
		//	System.out.println("Reversing the string: " + Fullrevstr);		
			
		}
		  
		if(count == -1)
			
		System.out.println("Reversing the string: " + Fullrevstr);
	
	}
	
}	


