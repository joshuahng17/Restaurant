package pkg.restaurant;

public class Waiter {

	static String listItems[];
	
	public Waiter() {
		listItems = new String [] {"Full Meals",
								"Veg Biriyani",
								"Veg Rice",
								"Veg Palav",
								"Veg Manchuria",
								"Gobi Noodles",
								"Chicken Biriyani",
								"Chicken 65",
								"Chicken Curry",
								"Chicken Manchuria"};
	}
	
	void menu() {
		System.out.println("[1.Full meals --100, 2.Veg Biriyani--150, 3.Veg Rice--50, 4.Veg Palav--100,\r\n"
				+ "5.Veg Manchuria--50, 6.Gobi Noodles--50, 7.Chicken Biriyani--200, 8.Chicken 65--200, \r\n"
				+ "9.Chicken Curry--100, 10.Chicken Manchuria--150]");
	}
	
	void takeOrder(Customer customer) {
		System.out.println("Hello "+customer.getCustomerName()+", Please select your order");
		menu();
	}
	
	void PlaceOrderToChef(Order order) {
		System.out.println("--------------------------------------------------");
		System.out.println("The waiter has placed your order to the chef...");
		VegChef veg = new VegChef();
		NonVegChef nonveg = new NonVegChef();
		if(order.isVeg) {
			veg.vegSection(order);
		}
		else {
			nonveg.nonVegSection(order);
		}
		
	}
	
}
