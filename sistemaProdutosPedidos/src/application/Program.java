package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		System.out.println("Enter client data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();
		System.out.print("Birth Date (DD/MM/YYYY): ");
		Date birthDate = sdf.parse(sc.next());
		
		System.out.println();
		
		System.out.println("Enter order data: ");
		sc.nextLine();
		System.out.println("Status: ");
		String orderStatus = sc.nextLine();
		
		System.out.println();
		
		Order order = new Order(new Date(), OrderStatus.valueOf(orderStatus), new Client(name, email, birthDate));
		
		System.out.print("How many items to this order? ");
		int numberOfOrders = sc.nextInt();
		
		for(int i = 1; i <= numberOfOrders; i++) {
			System.out.printf("Enter %d item data:%n", i);
			sc.nextLine();
			System.out.print("Product name: ");
			String productName = sc.nextLine();
			System.out.print("Product price: ");
			double productPrice = sc.nextDouble();
			System.out.print("Quantity: ");
			int productQuantity = sc.nextInt();
			
			OrderItem orderItem = new OrderItem(productQuantity, productPrice, new Product(productName, productPrice));
			order.addItem(orderItem);
			System.out.println();
		}
		
		System.out.println("ORDER SUMMARY: ");
		System.out.println("Order moment: " + sdf2.format(order.getMoment()));
		System.out.println("Order status: " + order.getStatus());
		System.out.println("Client: " 
							+ order.getClient().getName() 
							+ " (" 
							+ sdf.format(order.getClient().getBirthDate()) 
							+ ") - "
							+order.getClient().getEmail());
		System.out.println("Order Items: ");
		for(OrderItem oi : order.getOrderedItems()) {
			System.out.println(oi.toString());
		}
		System.out.println("Total price: R$ " + String.format("%.2f",order.total()));
		
		sc.close();

	}

}
