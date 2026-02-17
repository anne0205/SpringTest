package Task0404;

public class Calculations {
	
	
	public int addition(int value1, int value2) {
		
		int value3 = value1 + value2;
		return value3;
		
	}

	public int substraction(int minus1, int minus2) {
		
		int minus3 = minus1 - minus2;
		return minus3;
		
	}
	
	public float multiply(float multi1, float multi2) {
		
		float multi3 = multi1 * multi2;
		return multi3;
	}
	
	public double division(double div1, double div2) {
		
		double div3 = div1 / div2;
		return div3;
		
	}
	public void display() {
		
		int sum = addition(90, 80);
		int total = substraction(100, 50);
		float whole = multiply(1009f, 534f);
		double reminder = division(256,13);
		
		System.out.println("Sum of Addition : " + sum);
		System.out.println("Remaining total of 2 numbers: " + total);
		System.out.println("Whole value of multiply: " + whole);
		System.out.println("Reminder of the division : " + reminder);
		
		
	}
	public static void main(String[] args) {
		
		Calculations output = new Calculations();
		
		output.display();
		

	}

}
