import java.util.Scanner;

public class AverageCalculator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("How many numbers would you like to average? ");
		int count = scanner.nextInt();

		if (count <= 0) {
			System.out.println("Please enter a number greater than zero.");
			scanner.close();
			return;
		}

		double sum = 0;
		for (int i = 1; i <= count; i++) {
			System.out.print("Enter number " + i + ": ");
			sum += scanner.nextDouble();
		}

		double average = sum / count;
		System.out.println("Average: " + average);

		scanner.close();
	}
}
