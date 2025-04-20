// Name: Krrish Sinha
// PRN: 23070126063
// Batch: 2023-2027

import java.util.Scanner;

public class CalculatorMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        double num1, num2;

        System.out.println("----- Welcome to Java Calculator -----");

        do {
            System.out.println("\nSelect Operation:");
            System.out.println("1. Addition\n2. Subtraction\n3. Multiplication\n4. Division");
            System.out.println("5. Square\n6. Cube\n7. Square Root\n8. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            try {
                switch (choice) {
                    case 1:
                        System.out.print("Enter two numbers: ");
                        num1 = sc.nextDouble();
                        num2 = sc.nextDouble();
                        System.out.println("Result: " + Addition.add(num1, num2));
                        break;
                    case 2:
                        System.out.print("Enter two numbers: ");
                        num1 = sc.nextDouble();
                        num2 = sc.nextDouble();
                        System.out.println("Result: " + Subtraction.subtract(num1, num2));
                        break;
                    case 3:
                        System.out.print("Enter two numbers: ");
                        num1 = sc.nextDouble();
                        num2 = sc.nextDouble();
                        System.out.println("Result: " + Multiplication.multiply(num1, num2));
                        break;
                    case 4:
                        System.out.print("Enter two numbers: ");
                        num1 = sc.nextDouble();
                        num2 = sc.nextDouble();
                        System.out.println("Result: " + Division.divide(num1, num2));
                        break;
                    case 5:
                        System.out.print("Enter a number: ");
                        num1 = sc.nextDouble();
                        System.out.println("Result: " + Square.square(num1));
                        break;
                    case 6:
                        System.out.print("Enter a number: ");
                        num1 = sc.nextDouble();
                        System.out.println("Result: " + Cube.cube(num1));
                        break;
                    case 7:
                        System.out.print("Enter a number: ");
                        num1 = sc.nextDouble();
                        System.out.println("Result: " + SquareRoot.sqrt(num1));
                        break;
                    case 8:
                        System.out.println("Exiting Calculator. Goodbye!");
                        break;
                    default:
                        System.out.println("Invalid Choice! Try Again.");
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }

        } while (choice != 8);
        sc.close();
    }
}

