package Assignment_1;

import java.util.Objects;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CalculatorApp {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        double[] numbers;

        do {
            System.out.println("-------------------Calculator-----------------");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Square Root");
            System.out.println("6. Power");
            System.out.println("7. Mean");
            System.out.println("8. Variance");

            System.out.print("Choose an operation: ");
            String ch;
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            ch = reader.readLine();

            if (Objects.equals(ch, "end")) {
                break;
            }
            int choice = Integer.parseInt(ch);

            double num1;

            double num2;

            switch (choice) {
                case 1:
                    System.out.print("Enter num1: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter num2: ");
                    num2 = scanner.nextDouble();
                    System.out.println("Result: " + Calculator.add(num1, num2));
                    break;
                case 2:
                    System.out.print("Enter num1: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter num2: ");
                    num2 = scanner.nextDouble();
                    System.out.println("Result: " + Calculator.subtract(num1, num2));
                    break;
                case 3:
                    System.out.print("Enter num1: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter num2: ");
                    num2 = scanner.nextDouble();
                    System.out.println("Result: " + Calculator.multiply(num1, num2));
                    break;
                case 4:
                    System.out.print("Enter num1: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter num2: ");
                    num2 = scanner.nextDouble();
                    System.out.println("Result: " + Calculator.divide(num1, num2));
                    break;
                case 5:
                    System.out.print("Enter num1: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter num2: ");
                    num2 = scanner.nextDouble();
                    System.out.println("Result: " + Calculator.squareRoot(num1));
                    break;
                case 6:
                    System.out.print("Enter num1: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter the exponent: ");
                    int exponent = scanner.nextInt();
                    System.out.println("Result: " + Calculator.power(num1, exponent));
                    break;
                case 7:

                    System.out.println("Enter numbers (type 'end' to finish): ");
                    numbers = readNumbersFromInput(scanner);
                    System.out.println("Result: " + Calculator.mean(numbers));
                    break;
                case 8:

                    System.out.println("Enter numbers (type 'end' to finish): ");
                    numbers = readNumbersFromInput(scanner);
                    System.out.println("Result: " + Calculator.variance(numbers));
                    break;
                default:
                    System.out.println("Invalid choice.");
            }

        } while (true);
        numbers = readNumbersFromInput(scanner);
        System.out.println("Average: " + Calculator.mean(numbers));
        scanner.close();
    }

    private static double[] readNumbersFromInput(Scanner scanner) {
        String input;
        double[] numbers = new double[0];

        while (!(input = scanner.next()).equals("end")) {
            double number;
            try {
                number = Double.parseDouble(input);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter valid numbers or 'end' to finish.");
                continue;
            }

            double[] newNumbers = new double[numbers.length + 1];
            System.arraycopy(numbers, 0, newNumbers, 0, numbers.length);
            newNumbers[numbers.length] = number;
            numbers = newNumbers;
        }

        return numbers;
    }
}