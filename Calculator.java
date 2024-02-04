package Assignment_1;
import java.util.Scanner;
public class Calculator {
    // Addition
    public static double add(double num1, double num2) {
        return num1 + num2;
    }

    // Subtraction
    public static double subtract(double num1, double num2) {
        return num1 - num2;
    }

    // Multiplication
    public static double multiply(double num1, double num2) {
        return num1 * num2;
    }

    // Division
    public static double divide(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            System.out.println("Cannot divide by zero!");
            return Double.NaN; // Not a Number
        }
    }

    // Square Root
    public static double squareRoot(double num) {
        if (num >= 0) {
            return Math.sqrt(num);
        } else {
            System.out.println("Cannot calculate square root of a negative number!");
            return Double.NaN;
        }
    }

    // Power
    public static double power(double base, int exponent) {
        return Math.pow(base, exponent);
    }

    // Mean
    public static double mean(double[] numbers) {
        if (numbers.length == 0) {
            return 0.0;
        }

        double sum = 0;
        for (double num : numbers) {
            sum += num;
        }

        return sum / numbers.length;
    }

    // Variance
    public static double variance(double[] numbers) {
        if (numbers.length <= 1) {
            System.out.println("Variance requires at least two numbers.");
            return Double.NaN;
        }

        double mean = mean(numbers);
        double sumSquaredDifferences = 0;

        for (double num : numbers) {
            sumSquaredDifferences += Math.pow(num - mean, 2);
        }

        return sumSquaredDifferences / (numbers.length - 1);
    }
}
