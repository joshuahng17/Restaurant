package pkg.restaurant;

public class VegChef extends Chef{

	public void vegSection(Order order) {
		System.out.println("Your order has reached the veg section");
		prepareOrder(order, "Veg");
	}
	
}
