package pkg.restaurant;

public class Bill {

	Order order;
	int bill;
	int count;
	static int TotalBill = 0;
	
	void generateBill(Customer c) {
		order = c.order;
		System.out.println("Dear Customer "+c.getCustomerName()+", Your bill:");
		System.out.println("INVOICE");
		System.out.println("-------");
		System.out.println("Item\t\t\tQuant\tBill");
		System.out.println("----\t\t\t-----\t----");
		for(int i=0;i<order.Items.length;i++) {
			int itemNumber = (order.Items[i][0])-1;
			int quantity = order.Items[i][1];
			int cost = 0;
			switch(itemNumber) {
			case 2,4,5:
				cost = 50*quantity;
				break;
			case 0,3,8:
				cost = 100*quantity;
				break;
			case 1,9:
				cost = 150*quantity;
				break;
			case 6,7:
				cost = 200*quantity;
				break;
			}
			TotalBill+=cost;
			System.out.println(Waiter.listItems[itemNumber]+"\t\t"+quantity+"\t"+cost);
		}
		System.out.println("\t\t\t\t-----");
		System.out.println("\tTotal Bill\t\t"+TotalBill);
	}
	
}
