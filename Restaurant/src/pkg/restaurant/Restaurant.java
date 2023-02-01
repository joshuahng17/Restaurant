package pkg.restaurant;

public class Restaurant {

	public static void main(String[] args) {
		
		Customer c = new Customer("chaitu", 1);
		Waiter w = new Waiter();
		w.takeOrder(c);
		Order customerOrder = c.OrderingItems();
		w.PlaceOrderToChef(customerOrder);
		System.out.println("The waiter brought the items to the customer");
		c.eat();
		Bill b = new Bill();
		b.generateBill(c);
	}
	
}
