import java.util.Scanner;

public class SimpleCalculator {
 public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);

  System.out.print("Enter the first number: ");
  double firstNumber = scanner.nextDouble();

  System.out.print("Enter an operator (+, -, *, /): ");
  char operator = scanner.next().charAt(0);

  System.out.print("Enter the second number: ");
  double secondNumber = scanner.nextDouble();

  switch (operator) {
   case '+':
    System.out.println("Result: " + (firstNumber + secondNumber));
    break;
   case '-':
    System.out.println("Result: " + (firstNumber - secondNumber));
    break;
   case '*':
    System.out.println("Result: " + (firstNumber * secondNumber));
    break;
   case '/':
    if (secondNumber == 0) {
     System.out.println("Error: Cannot divide by zero.");
    } else {
     System.out.println("Result: " + (firstNumber / secondNumber));
    }
    break;
   default:
    System.out.println("Error: Invalid operator.");
  }

  scanner.close();
 }
}
