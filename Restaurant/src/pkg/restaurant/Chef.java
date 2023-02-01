package pkg.restaurant;

public class Chef {

	void prepareOrder(Order order, String vegRnonVeg) {
		System.out.println("Order number "+Order.orderNum+" is getting ready. Please wait ("+vegRnonVeg+")");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Order number "+Order.orderNum+" is ready("+vegRnonVeg+")");
		callWaiter(vegRnonVeg);
	}
	
	void callWaiter(String vegRnonVeg) {
		System.out.println(vegRnonVeg+" to waiter: You can now deliver the items to the customer");
		System.out.println("--------------------------------------------------");
	}
	
}
