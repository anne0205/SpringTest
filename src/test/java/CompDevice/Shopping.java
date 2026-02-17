package CompDevice;

import Task0404.MyDevice;

public class Shopping {
	
	
	public void makeCall() {
		System.out.println("Print values");
		int count = 3;
		System.out.println("count of calls international " + count);
		System.out.println("************************************");
	}
	
	public void eShop(String handbag, String model) {
		
		
		System.out.println("My shopping details: " + handbag + "," + model);
		System.out.println("************************************");
	}
	
	public void ePayment(float price, String creditcard) {
		
		System.out.println("My shopping sale details :" + price + "," + creditcard);
		System.out.println("************************************");
		
	}
	
	public void Delivery(int servrate, String Receivername, boolean isdelivered) {
		String delivery = eShipment();
		
		System.out.println("Delivery service details: " + delivery);
		
		System.out.println("Delivery Service rate : $" + servrate);
		System.out.println("Receiver name : " + Receivername);
		System.out.println("Product delivered successfully: " + isdelivered);
		
	}
	
	public String eShipment() {
		String service ="Fedex";
		System.out.println("International Shipping service : " + service);
		
		System.out.println("************************************");
		return service;
	}

	public static void main(String[] args) {
		MyDevice obj2 = new MyDevice(); // 
		obj2.makeCall();
		
		
		Shopping shop = new Shopping();
		
		shop.makeCall();
		shop.eShop("Tote Bag", "Coach");
		
		float p = 10050f;
		String cc = "Visa";
		
		shop.ePayment(p,cc); 
		
		shop.Delivery(150,"Anita",true);
		
		
	}

}
