package Task0404;

public class MyDevice {
	String color;
	int cameracount;
	float screensize;
	int ramsize;
	boolean isTouchScreen;
	long battery;
	short noofSIMslots;
	char make;
	double price;
	
	public void color() {
		
		System.out.println("Color of the mobile");
	}
	public void makeCall() {

		System.out.println("Make of my phone is Samsung");
		
	}
	private void ramsize() {
		System.out.println("My phone ramsize is 164");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		MyDevice obj1 = new MyDevice();
		
		obj1.color="Purple";
		obj1.make ='S';
		obj1.ramsize = 164;
		obj1.isTouchScreen = true;
		
		
		System.out.println("My mobile phone color :" + obj1.color);
		
		System.out.println("My mobile phone make :" + obj1.make);
		
		System.out.println("My mobile ramsize :" + obj1.ramsize);
	}

}
