package pkg.restaurant;

public class Order {

	static int orderNum = 0;
	int Items[][];
	int noOfItems;
	boolean isVeg;
	
	public Order (int noOfItems, int[][] Items, boolean isVeg) {
		this.noOfItems = noOfItems;
		this.Items = Items;
		this.isVeg = isVeg;
		orderNum++;
	}
	
}
