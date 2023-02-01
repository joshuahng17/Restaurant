package pkg.restaurant;

public class NonVegChef extends Chef{

	public void nonVegSection(Order order) {
		System.out.println("Your order has reached the non veg section");
		prepareOrder(order, "Non-Veg");
	}
	
}
