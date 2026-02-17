package Task0410;

public class LearnStrclas3 {

	public static void main(String[] args) {
		
		String test = "Learn123";
		
		
		String str1 = test.replaceAll("[\\d]","");// non integers
		
		System.out.println(str1);
		
		String str2 = test.replaceAll("[\\D]","");// integers
		System.out.println(str2);
		
		String str = "Learn";
		
		System.out.println(str.replace('e','*'));// replace the value
		
		//calculate the discount 
		
		String val = "Rs.10,000/-";
		int discount = 15;
		
		String assign = val.replaceAll("[\\D]","");
	
		System.out.println("Value after replaceAll : " + assign);
		
		float sale = 15/100f;
		System.out.println(sale);
		int total = Integer.parseInt(assign);
		
		System.out.println(total);
		
		float val1 = sale*total;
		
		float val2 = total - val1;
		
		System.out.println(val1);
		System.out.println(val2);
		
	}

	

}
