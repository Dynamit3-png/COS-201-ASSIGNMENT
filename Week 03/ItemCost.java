import java.util.Scanner;

public class ItemCost {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter item name: ");
		String itemName = scanner.nextLine();

		System.out.print("Enter quantity: ");
		int quantity = scanner.nextInt();

		System.out.print("Enter price per item: ");
		double pricePerItem = scanner.nextDouble();

		if (quantity < 0 || pricePerItem < 0) {
			System.out.println("Quantity and price cannot be negative.");
		} else {
			double totalCost = quantity * pricePerItem;
			System.out.printf("Total cost for %s: $%.2f%n", itemName, totalCost);
		}

		scanner.close();
	}
}
