package Task0405;

public class Overlearn {
	
	public int sum(int value1, int value2) {
		
		int value3 = value1 + value2;
		System.out.println("Value of addition :" + value3);
		return value3;
	}
	public double sum(double value1, int value2) {
		double value3 = value1 - value2;
		System.out.println("Value of substaction :" + value3);
		return value3;
		
	}
	public int sum(int value1, int value2, int value3) {
		int value4 = value1 * value2 * value3;
		System.out.println("value of multiplication :" + value4);
		return value4;
		
	}
	public float sum(float value1, float value2) {
		float value3 = value1 / value2;
		System.out.println("Value of division :" + value3);
		return value3;
	}

	public static void main(String[] args) {
		
      Overlearn over = new Overlearn();
      int arry[] = {12,14,16,18,20};
      int intarry[] = {02,06,10,12};
      
      char chararrt[] = {'B','W','P','Y'};
     // int intarry = intarry.length;
      
      System.out.println("array of chars :" );
      
      for(int i=0; i<intarry.length; i++) {
    	  System.out.println("Print numbers[" +i+ "]: " + intarry[i] );
      }
      
      
      
	}

}
