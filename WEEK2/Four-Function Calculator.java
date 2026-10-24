import java.util.Scanner;

public class FourFunctionCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = input.nextInt();

        System.out.print("Enter second number: ");
        int num2 = input.nextInt();

        System.out.println("Addition: " + (num1 + num2));
        System.out.println("Subtraction: " + (num1 - num2));
        System.out.println("Multiplication: " + (num1 * num2));

        /*
         * Integer division removes the decimal part of the result instead
         * of rounding it to the nearest whole number. When negative numbers
         * are used, the result of division is truncated toward zero.
         * The remainder can also be negative when the first number is
         * negative. Division and remainder operations cannot use zero
         * as the second number because this causes an ArithmeticException.
         */
        if (num2 != 0) {
            System.out.println("Division: " + (num1 / num2));
            System.out.println("Remainder: " + (num1 % num2));
        } else {
            System.out.println("Cannot divide by zero.");
        }

        input.close();
    }
}
