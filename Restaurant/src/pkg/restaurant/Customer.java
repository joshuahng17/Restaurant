package pkg.restaurant;

import java.util.Scanner;

public class Customer {

	private String customerName;
	private int customerTableNumber;
	Order order;
	
	public Customer(String customerName, int customerTableNumber) {
		super();
		this.customerName = customerName;
		this.customerTableNumber = customerTableNumber;
	}

	public String getCustomerName() {
		return customerName;
	}
	
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	Order OrderingItems() {
		Scanner sc = new Scanner(System.in);
		System.out.println(getCustomerName()+" is giving their order");
		System.out.println("Please enter the number of items...");
		int noOfItems = sc.nextInt();
		System.out.println("Please enter the item number followed by the quantity, one at a time");
		int Items [][] = new int[noOfItems][];
		boolean isVeg = true;
		for(int i=0;i<noOfItems;i++) {
			System.out.println("-----------------------------");
			Items[i] = new int[2];
			Items[i][0] = sc.nextInt();
			if(Items[i][0] < 2 || Items[i][0] > 5)
				isVeg = false;
			Items[i][1] = sc.nextInt();
		}
		Order currentOrder = new Order(noOfItems, Items, isVeg);
		order = currentOrder;
		sc.close();
		return currentOrder;
	}
	
	void eat() {
		System.out.println(getCustomerName()+" is eating...");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}
